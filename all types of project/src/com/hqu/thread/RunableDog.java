package com.hqu.thread;

import java.io.IOException;
import java.nio.CharBuffer;

public class RunableDog implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"������");
		}
	}
	public static void main(String[] args) {
		//�����������߳�����
		RunableDog d1=new RunableDog();
		Thread th1=new Thread(d1,"��ʿ��");
		th1.setPriority(Thread.MAX_PRIORITY);//����������ȼ�
//		th1.setPriority(10);
		System.out.println(th1.getPriority());//������ȼ�����
		th1.start();
		RunableDog d2=new RunableDog();
		Thread th2=new Thread(d2,"��԰Ȯ");
		th2.setPriority(Thread.MIN_PRIORITY);//������С���ȼ�
		//th2.setPriority(1);
		System.out.println(th2.getPriority());
		th2.start();
		//ͨ���۲췢�֣����ȼ�Խ��,����ִ�е�Ƶ�ʻ�Ƚ϶�
			
		
	}
	

}
