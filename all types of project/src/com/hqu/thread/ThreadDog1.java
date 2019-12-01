package com.hqu.thread;

import java.nio.charset.MalformedInputException;

public class ThreadDog1 extends Thread{
@Override
public void run() {
	// TODO Auto-generated method stub
	for (int i = 0; i < 10; i++) {
		System.out.println(Thread.currentThread().getName()+"汪汪叫");
		//System.out.println(this.getName()+"汪汪叫");
		if(Thread.currentThread().getName().equals("哈士奇")&&i==4){
			int j=1/0;
		}
	}
	
}
public static void main(String[] args) {
	ThreadDog1 d1= new ThreadDog1();
	d1.setName("哈士奇");
	d1.start();//启动线程
	ThreadDog1 d2= new ThreadDog1();
	d2.setName("中华田园犬");
	d2.start();//启动线程
	
}
}
