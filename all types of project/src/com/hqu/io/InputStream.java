package com.hqu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStream {
	public static void main(String[] args) throws IOException {

		FileInputStream in = new FileInputStream("d://java����.txt");

		FileOutputStream out = new FileOutputStream("e://copy_java����.txt");
		// ��ΰ����е����ݶ���ȡ������ѭ����ȡ while��
		int lenth;
		byte[] b = new byte[1024];
		while ((lenth = in.read(b)) > -1) { // �������-1��˵������������
			out.write(b, 0, lenth);
			System.out.println(new String(b, 0, lenth));
			//String s = new String(b, 0, lenth);
			// ���ַ���--��byte����
			//out.write(s.getBytes());
			out.close();
		}
		in.close();
	}
}
