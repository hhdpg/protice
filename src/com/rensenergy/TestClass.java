package com.rensenergy;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ex(1, 2));
	}
	public static int ex(int a, int b) {
		System.out.println("a的值为："+a+" b的值为："+b);
		if (b == 0) return 0;
		if (b % 2 ==0) return ex(a+a, b/2);
		return ex(a+a, b/2);
	}
}
