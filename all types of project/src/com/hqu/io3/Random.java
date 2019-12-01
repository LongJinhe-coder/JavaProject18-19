package com.hqu.io3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Random {
public static void main(String[] args) throws IOException {
	RandomAccessFile random=new RandomAccessFile("d://1.txt", "rw");
	int len ;
	byte []b=new byte[1024];
	String s=null;
	while((len=random.read(b))>-1){
		 s=new String(b,0,len);
		System.out.println(s);
	}
 
	char c[]=s.toCharArray();
	for(int i=c.length-1;i>=0;i--){
		System.out.print(c[i]);
	}
	
}

}
