package com.rensenergy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xcd
 * @Aata 2018年12月29日
 * @Description
 */
public class Aone {
	private static Aone example = new Aone();
	
	private static Map<Integer,Boolean> test = 
		new HashMap<Integer, Boolean>();
	
	public Aone()
	{
		test.put(1, true);
	}
	
	public static Aone getInstance()
	{
		return example;
	}
}

