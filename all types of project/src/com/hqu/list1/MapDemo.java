package com.hqu.list1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.xml.sax.HandlerBase;

public class MapDemo {
public static void main(String[] args) {
	Map<String,String> map=new HashMap<>();
	//���
	map.put("001", "��ǿ");
	map.put("002", "����");
	//map.put("002","С�ɰ�");����
	
	//���� keyset����
	for (String string : map.keySet()) {
		System.out.println(string+"="+map.get(string));
		
	}
	
	//����entryset
	for (Entry<String, String> string : map.entrySet()) {
		System.out.println(string.getKey()+"="+string.getValue());
	}
}
}
