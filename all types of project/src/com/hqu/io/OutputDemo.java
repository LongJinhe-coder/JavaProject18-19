package com.hqu.io;

import java.io.FileOutputStream;

public class OutputDemo {
	public static void main(String[] args) throws Exception {
		//1.创建对象
		FileOutputStream out = new FileOutputStream("d://2.txt");
		//2.写数据
		//将字符串-->byte数组 
		out.write("小可爱，好可爱".getBytes());
		//3.关闭
		out.close();
	}
}