package com.rensenergy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Capacity {
	public static void main(String args[]) throws IOException{
/*		File filesourse = new File("C:\\usr\\ss.txt");
		FileInputStream fis = new FileInputStream(filesourse);
		int len = -1;*/		
		long startTime = System.currentTimeMillis();
		StringBuffer sbuf = new StringBuffer("");
		for(int i=0;i<=999999999;i++){
/*			byte[] buf = new byte[i];
			while ((len = (fis.read(buf))) != -1) {			
				sbuf.append(new String(buf, 0, len));
			}*/
			try{
				sbuf.append("d");
			}catch(Exception e){
				System.out.println(sbuf.length());
				break;
			}
			finally {				
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("所有时间为"+(endTime-startTime)+"ms");
	}
}
