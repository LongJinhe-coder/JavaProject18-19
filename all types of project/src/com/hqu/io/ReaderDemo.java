package com.hqu.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReaderDemo {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("d://1.txt");
		int a=0;int A = 0;
		int len;
		char[] ch = new char[1];//1024���ַ�
		while ((len = reader.read(ch)) > -1) {//һ�ζ�ȡ1024���ַ�
			System.out.println(new String(ch, 0, len));
		
			if(len=='A'){
				A++;
			}
			else if(len=='a'){
				a++;
			}
		}
		reader.close();
	System.out.println("A�ĸ�����"+A);
	System.out.println("a�ĸ�����"+a);
	}
	}

