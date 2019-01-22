package com.rensenergy;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String args[]) {
		int a = Integer.decode("0x0011".replace("0x00", "0x"));
		String errCode = Integer.toBinaryString(a);
		System.out.println(errCode);
		while (errCode.length() != 8) {
			errCode = "0" + errCode;
		}
		System.out.println(errCode);
		String[] errArray = errCode.split("");
		int x = -1;
		for (int i = 24; i <= 31; i++) {
			x++;
//			System.out.println(x);
			if (errArray[x].equals("1")) {
			}
		}
	}
}
