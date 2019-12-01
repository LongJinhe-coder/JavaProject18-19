package com.hqu.io;

import java.io.FileInputStream;

public class InputDemo {
	public static void main(String[] args) throws Exception {
		//1.创建对象
		FileInputStream in = new FileInputStream("d://1.txt");
		//2.读取数据（返回的是整数(ASCII码值)）
		//read()  一次只读取一个字节
     // int length = in.read();
	//	System.out.println((char)length);
//		length = in.read();
//		System.out.println((char)length);
//		//如果读到-1 说明文档里面没有内容
	//	length=in.read();
//	System.out.println(length);
		//3.一次读取多个怎么办？
		//read(b) 每次读取定义的byte数组的长度
//		byte [] b = new byte[10];
//		int leng = in.read(b);
//		System.out.println(new String(b,0,leng));
		//4.如何把所有的内容都获取出来(循环读取 while)
		int leng;
		byte [] b = new byte[1024*1024];
		while((leng=in.read(b))>-1){//结果大于-1  说明里面有内容
			System.out.print(new String(b,0,leng));
		}
		in.close();
	}
}