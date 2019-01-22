package com.rensenergy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class TranslationTest {
	private final static String PreUrl="http://www.baidu.com/s?wd=";                        //百度搜索URL
    private final static String TransResultStartFlag="<span class=\"op_dict_text2\">";      //翻译开始标签
    private final static String TransResultEndFlag="</span>";                               //翻译结束标签
    private final static String TransAttributeResultStartFlag="<span class=\"op_dict_text1 c-gap-right\">";//单词属性开始标签

    public static String getTranslateResult(String urlString) throws Exception {    //传入要搜索的单词
        URL url = new URL(PreUrl+urlString);            //生成完整的URL
        // 打开URL
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        // 得到输入流，即获得了网页的内容
        BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String preLine="";
        String line;
        int flag=1;
        // 读取输入流的数据，并显示
        String content="";          //翻译结果
        String attribute="";
        String result="";
        while ((line = reader.readLine()) != null) {            //获取翻译结果的算法
            if(preLine.indexOf(TransResultStartFlag)!=-1&&line.indexOf(TransResultEndFlag)==-1){
                content+=line.replaceAll("　| ", "")+"\n";   //去电源代码上面的半角以及全角字符
                flag=0;
            }
/*            if(preLine.indexOf(TransAttributeResultStartFlag)!=-1&&line.indexOf(TransResultEndFlag)==-1){
                attribute+=line.replaceAll("　| ", "")+"\n";   //去电源代码上面的半角以及全角字符
                flag=0;
            } */           
            if(line.indexOf(TransResultEndFlag)!=-1){
                flag=1;
            }
            if(flag==1){
                preLine=line;
            }
//            result = attribute+content;
        }
        return content;//返回翻译结果
    }
	public static void main(String args[]){
		Scanner sca = new Scanner(System.in);
		String s = sca.nextLine();
		TranslationTest tt = new TranslationTest();
		try {
			String ss = tt.getTranslateResult(s);
			if (ss == null){
				System.out.println("抱歉，未找到该单词！");
			}
			System.out.println(ss);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
