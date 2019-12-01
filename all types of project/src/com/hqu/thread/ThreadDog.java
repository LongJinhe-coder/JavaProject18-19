package com.hqu.thread;

public class ThreadDog extends Thread{
	//2.重写run方法,只要我们把代码写在run方法里面，就会以多线程方式启动
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"汪汪叫");
		}
	}
	public static void main(String[] args) {
		ThreadDog d1=new ThreadDog();
		d1.setName("哈士奇");
		d1.start();//启动线程
		ThreadDog d2=new ThreadDog();
		d2.setName("中华田园犬");
		d2.start();
	}
}
