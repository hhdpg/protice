package com.rensenergy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileTest {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =new File("C:/protice" + File.separator + "Test.txt");
		InputStream in =new FileInputStream(file);
		byte[] b =new byte[(int)file.length()];
		int temp=0;
		int len=0;
		while((temp=in.read())!=-1){
			b[len]=(byte)temp;
			len++;
		}
		in.close();
		System.out.println(new String(b,"UTF-8"));
		System.out.println(len);
		}
}
