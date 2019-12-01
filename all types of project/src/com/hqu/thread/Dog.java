package com.hqu.thread;

public class Dog {
public void jiao(String name){
	for (int i = 0; i < 10; i++) {
		System.out.println(name+"ÍôÍô½Ð");
	}
}
public static void main(String[] args) {
	Dog d=new Dog();
	d.jiao("¹þÊ¿Ææ");
	Dog d2= new Dog();
	d2.jiao("ÖÐ»ªÌïÔ°È®");
}
}
