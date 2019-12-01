package com.hqu.list1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("小可爱");
		set.add("小可爱");
		set.add("德强");
		System.out.println("大小是" + set.size());
		// 遍历
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println("迭代:" + it.next());
		}
		// 遍历2 foreach
		for (String string : set) {
			System.out.println("foreach遍历:" + string);
		}
	}
}
