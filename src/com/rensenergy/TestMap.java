package com.rensenergy;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		Map<String,TeVo> map=new HashMap<>();
		TeVo te =test(map);
		TeVo te1 =new TeVo("teone");
		TeVo te2 =test2(te1);
		System.out.println(te1.getFineName());
		System.out.println(te2.getFineName());
		// TODO Auto-generated method stub
//		String a="aaaa";
//		String b="cccc";
//		String c="aaaacccc";
//		String d =new String("cccc");
//		System.out.println(a+"cccc");
//		System.out.println(a+b);
//		System.out.println(c==(a+"cccc"));
//		System.out.println(c==(a+b));
//		System.out.println(c==(a+d));
	}
	private static TeVo test2(TeVo te){return new TeVo("tetwo");}
	public static TeVo test(Map<String,TeVo> map){
		if(map.get("test")==null){
			TeVo te =new TeVo();
			te.setname("aaa");
			map.get("test");
		}
		return map.get("test");
	}
}
