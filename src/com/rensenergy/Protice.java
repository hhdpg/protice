package com.rensenergy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @Author xcd
 * @Aata 2019年1月3日
 * @Description
 */
public class Protice {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("AAA");
		list.add("VVV");
		list.add("SSSSS");
//		list.forEach(a -> System.out.println(a));
//		list.forEach(System.out::println);
//		List<String> newList = list.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
//		newList.forEach(System.out::println);
//		list.forEach(a -> System.out.println(a.equals("AAA")));
//		Double a = Double.valueOf("0.721");
//		System.out.println(a +" ");
//		System.out.println(a * 500 +" ");
		String value = String.valueOf((Double.valueOf("0.721") * 500));
		System.out.println(value);
	}
}
