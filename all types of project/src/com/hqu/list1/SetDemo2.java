package com.hqu.list1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo2 {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		Person person = new Person();
		person.setId(1);
		person.setAge(18);
		person.setName("С�ɰ�");
		person.setSex("��");
		set.add(person);

		Person p = new Person(2, "�³�", "��", 22);
		set.add(p);

		set.add(new Person(2, "��ǿ", "��", 17));

		if (!set.isEmpty()) {
			for (Person person2 : set) {
				if (!person2.getName().equals("С��")) {
					set.add(new Person(2, "С��", "��", 17));
					break;
				}
			}
		}
		for (Person person2 : set) {
			System.out.println(person2);
		}
		Iterator<Person> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
