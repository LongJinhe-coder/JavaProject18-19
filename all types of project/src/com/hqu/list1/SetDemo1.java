package com.hqu.list1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("С�ɰ�");
		set.add("С�ɰ�");
		set.add("��ǿ");
		System.out.println("��С��" + set.size());
		// ����
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println("����:" + it.next());
		}
		// ����2 foreach
		for (String string : set) {
			System.out.println("foreach����:" + string);
		}
	}
}
