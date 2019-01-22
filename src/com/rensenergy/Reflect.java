package com.rensenergy;

public class Reflect {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		TestClass tc = new TestClass();
		Class testc =tc.getClass();
		System.out.println(testc.getName());
		Class testcc = TestClass.class;
		System.out.println(testc == testcc);
		Class testccc = Class.forName("com.rensenergy.TestClass");
		System.out.println(testc == testcc);
	}

}
