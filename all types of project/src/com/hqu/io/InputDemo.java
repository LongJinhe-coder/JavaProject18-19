package com.hqu.io;

import java.io.FileInputStream;

public class InputDemo {
	public static void main(String[] args) throws Exception {
		//1.��������
		FileInputStream in = new FileInputStream("d://1.txt");
		//2.��ȡ���ݣ����ص�������(ASCII��ֵ)��
		//read()  һ��ֻ��ȡһ���ֽ�
     // int length = in.read();
	//	System.out.println((char)length);
//		length = in.read();
//		System.out.println((char)length);
//		//�������-1 ˵���ĵ�����û������
	//	length=in.read();
//	System.out.println(length);
		//3.һ�ζ�ȡ�����ô�죿
		//read(b) ÿ�ζ�ȡ�����byte����ĳ���
//		byte [] b = new byte[10];
//		int leng = in.read(b);
//		System.out.println(new String(b,0,leng));
		//4.��ΰ����е����ݶ���ȡ����(ѭ����ȡ while)
		int leng;
		byte [] b = new byte[1024*1024];
		while((leng=in.read(b))>-1){//�������-1  ˵������������
			System.out.print(new String(b,0,leng));
		}
		in.close();
	}
}