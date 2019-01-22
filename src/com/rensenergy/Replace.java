package com.rensenergy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Replace {
	public static void main(String args[]) throws IOException{
		long startTime=System.currentTimeMillis();
		File file = new File("C:\\usr\\dd.txt");
		FileOutputStream fos = new FileOutputStream(file,false);
		File filesourse = new File("C:\\usr\\device_unit.txt");
		FileInputStream fis = new FileInputStream(filesourse);
		byte[] buf = new byte[1024];//每次读入文件数据量		
		int len = -1;		
		StringBuffer sbuf = new StringBuffer("");
		int i = 0;
		while ((len = (fis.read(buf))) != -1) {			
			sbuf.append(new String(buf, 0, len));
			fos.write(buf);
			i++;
			if(i%1000000 == 0 ){
				System.out.println("当前写入了"+i+"次了");
			}
			sbuf.setLength(0); 
		}
		System.out.println("文件大小为："+file.length());
		fos.close();
		System.out.println("覆盖成功");
		long endTime=System.currentTimeMillis();
		System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
	}
}
