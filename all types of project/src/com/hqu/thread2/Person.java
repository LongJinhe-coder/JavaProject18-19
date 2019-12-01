package com.hqu.thread2;

public class Person {
	private String name;
	private String sex;
	public Person(String name, String sex) {
		
		this.name = name;
		this.sex = sex;
	}
	
	public synchronized void update(String name,String sex){
		this.name=name;
		this.sex=sex;
	}
	
	public synchronized void show(){
		System.out.println(name+"ÐÔ±ð"+sex);
	}
	
}
