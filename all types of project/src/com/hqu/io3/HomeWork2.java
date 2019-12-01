package com.hqu.io3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HomeWork2 {
public static void main(String[] args) throws IOException {
	FileReader reader=new FileReader("d://1.txt");
	int len;
	int a=0;int A=0;
	while((len=reader.read())>-1){
		if(len=='A'){
			A++;
		}
		else if(len=='a'){
			a++;
		}
	}
	reader.close();
	System.out.println("A的个数是"+A);
	System.out.println("a的个数是"+a);
}
}
