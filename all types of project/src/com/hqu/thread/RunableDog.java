package com.hqu.thread;

import java.io.IOException;
import java.nio.CharBuffer;

public class RunableDog implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"汪汪叫");
		}
	}
	public static void main(String[] args) {
		//启动，借助线程启动
		RunableDog d1=new RunableDog();
		Thread th1=new Thread(d1,"哈士奇");
		th1.setPriority(Thread.MAX_PRIORITY);//设置最大优先级
//		th1.setPriority(10);
		System.out.println(th1.getPriority());//输出优先级级数
		th1.start();
		RunableDog d2=new RunableDog();
		Thread th2=new Thread(d2,"田园犬");
		th2.setPriority(Thread.MIN_PRIORITY);//设置最小优先级
		//th2.setPriority(1);
		System.out.println(th2.getPriority());
		th2.start();
		//通过观察发现，优先级越高,优先执行的频率会比较多
			
		
	}
	

}
