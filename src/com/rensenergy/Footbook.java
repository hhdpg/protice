package com.rensenergy;

import java.util.ArrayList;
import java.util.List;

public class Footbook {
	public static void main(String[] args) {
		int id = 286;
		int num = 13872;
		for(int i = 0;i<= 10;i++) {
			System.out.println("INSERT INTO `fault_code` VALUES ('" + id + "', '7', '" + num + "', '');");
			id++;
			num++;
		}
	}
}
