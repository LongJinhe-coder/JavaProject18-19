package com.hqu.io;

import java.io.FileOutputStream;

public class OutputDemo {
	public static void main(String[] args) throws Exception {
		//1.��������
		FileOutputStream out = new FileOutputStream("d://2.txt");
		//2.д����
		//���ַ���-->byte���� 
		out.write("С�ɰ����ÿɰ�".getBytes());
		//3.�ر�
		out.close();
	}
}