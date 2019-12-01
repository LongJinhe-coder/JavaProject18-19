package com.hqu.io3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class GetAa {

public static void main(String[] args) throws IOException {
	FileInputStream in=new FileInputStream( "d://4.txt");
	int len;
//	int Asum=0,asum=0;
//	byte []b=new byte[1024];
//	String s=null;
	while((len=in.read())>-1){
		
//	 s=new String(b, 0, len);
//	 System.out.println(s);
//	
		System.out.print((char)(len));
	}
	in.close();
//	char c[]=s.toCharArray();
//	for(int i=0;i<=c.length-1;i++){
//		if(c[i]=='A'){
//			Asum++;
//		}
//		else if(c[i]=='a'){
//			asum++;
//		}
//	}
//	
//	System.out.println("A的个数是"+Asum);
//	System.out.println("a的个数是"+asum);
}
}
