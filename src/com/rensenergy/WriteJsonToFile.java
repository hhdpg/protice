package com.rensenergy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//import com.aliyun.openservices.shade.com.alibaba.fastjson.JSON;

//import net.sf.json.JSONArray;
 
public class WriteJsonToFile {
 
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\usr\\testone.json");
		String jsonStr = "[{a:1,b:{b1:[{a:2},{a:1}]},c:3},{a:1},{b:1}]";
//		String jsonStr = "{a:1,b:{b1:[{a:2},{a:1}]},c:3,a:2,b:2}";
//		String jsonStr = JSON.toJSONString(data).toString();
//		JSONObject jsonObj = JSONObject.fromObject(jsonStr);
		
		char[] stack = new char[1024]; // 存放括号，如 "{","}","[","]"
		int top = -1;
		
//		String string = jsonObj.toString();
		StringBuffer sb = new StringBuffer();
		char[] charArray = jsonStr.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if ('{' == c || '[' == c) {
				stack[++top] = c; // 将括号添加到数组中，这个可以简单理解为栈的入栈
				sb.append(charArray[i] + "\n");
				for (int j = 0; j <= top; j++) {
					sb.append("\t");
				}
				continue;
			}
			if ((i + 1) <= (charArray.length - 1)) {
				char d = charArray[i+1];
				if ('}' == d || ']' == d) {
					top--; // 将数组的最后一个有效内容位置下标减 1，可以简单的理解为将栈顶数据弹出
					sb.append(charArray[i] + "\n");
					for (int j = 0; j <= top; j++) {
						sb.append("\t");
					}
					continue;
				}
			}
			if (',' == c) {
				sb.append(charArray[i] + "\n");
				for (int j = 0; j <= top; j++) {
					sb.append("\t");
				}
				continue;
			}
			sb.append(c);
		}
		
		Writer write = new FileWriter(file);
		write.write(sb.toString());
		write.flush();
		write.close();
	}
}
