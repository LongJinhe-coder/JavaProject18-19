package com.hqu.thread;

public class Dog {
public void jiao(String name){
	for (int i = 0; i < 10; i++) {
		System.out.println(name+"������");
	}
}
public static void main(String[] args) {
	Dog d=new Dog();
	d.jiao("��ʿ��");
	Dog d2= new Dog();
	d2.jiao("�л���԰Ȯ");
}
}
