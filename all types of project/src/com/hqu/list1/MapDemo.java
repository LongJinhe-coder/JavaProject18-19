package com.hqu.list1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.xml.sax.HandlerBase;

public class MapDemo {
public static void main(String[] args) {
	Map<String,String> map=new HashMap<>();
	//添加
	map.put("001", "德强");
	map.put("002", "美丽");
	//map.put("002","小可爱");覆盖
	
	//遍历 keyset遍历
	for (String string : map.keySet()) {
		System.out.println(string+"="+map.get(string));
		
	}
	
	//遍历entryset
	for (Entry<String, String> string : map.entrySet()) {
		System.out.println(string.getKey()+"="+string.getValue());
	}
}
}
