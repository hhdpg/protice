package com.rensenergy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write {
	public static void main(String args[]) throws IOException{
		long startTime = System.currentTimeMillis();
		File file = new File("C:\\usr\\ss.txt");
		FileOutputStream fos = new FileOutputStream(file);
		for(int i=0;i<99999999;i++){
			fos.write("Hello File".getBytes());
			if(i%1000000 == 0 ){
				System.out.println("当前写入了"+i+"次了");
			}
		}
		System.out.println("文件大小为："+file.length());
		fos.close();
		long endTime = System.currentTimeMillis();
		System.out.println("运行时间为："+(endTime-startTime)+"ms");
	}
}
