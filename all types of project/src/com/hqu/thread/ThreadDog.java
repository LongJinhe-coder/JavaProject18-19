package com.hqu.thread;

public class ThreadDog extends Thread{
	//2.��дrun����,ֻҪ���ǰѴ���д��run�������棬�ͻ��Զ��̷߳�ʽ����
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"������");
		}
	}
	public static void main(String[] args) {
		ThreadDog d1=new ThreadDog();
		d1.setName("��ʿ��");
		d1.start();//�����߳�
		ThreadDog d2=new ThreadDog();
		d2.setName("�л���԰Ȯ");
		d2.start();
	}
}
