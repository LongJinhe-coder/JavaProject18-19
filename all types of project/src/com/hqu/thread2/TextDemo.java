package com.hqu.thread2;

public class TextDemo {
public static void main(String[] args) {
	Person person =new Person("����", "Ů");
	ReadThread rd=new ReadThread(person);
	rd.start();
	UpdateThread ud=new UpdateThread(person);
	ud.start();
}
}
