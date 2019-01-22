package com.rensenergy;

public class LastTest {
	public static void main(String args[]){
		int i;
		int s = 0;
		for(i=0;i<2;i++){
			s = 1<<i + s;
			System.out.println(i+" "+s);
		}
		s = 0;
		for(i=0;i<2;i++){
			s = 1<<i|s;
			System.out.println(i+" "+s);
		}
	}
}
