package com.hqu.thread;

import java.nio.charset.MalformedInputException;

public class ThreadDog1 extends Thread{
@Override
public void run() {
	// TODO Auto-generated method stub
	for (int i = 0; i < 10; i++) {
		System.out.println(Thread.currentThread().getName()+"������");
		//System.out.println(this.getName()+"������");
		if(Thread.currentThread().getName().equals("��ʿ��")&&i==4){
			int j=1/0;
		}
	}
	
}
public static void main(String[] args) {
	ThreadDog1 d1= new ThreadDog1();
	d1.setName("��ʿ��");
	d1.start();//�����߳�
	ThreadDog1 d2= new ThreadDog1();
	d2.setName("�л���԰Ȯ");
	d2.start();//�����߳�
	
}
}
