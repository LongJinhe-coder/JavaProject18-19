package com.hqu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStream {
	public static void main(String[] args) throws IOException {

		FileInputStream in = new FileInputStream("d://java基础.txt");

		FileOutputStream out = new FileOutputStream("e://copy_java基础.txt");
		// 如何把所有的内容都获取出来（循环读取 while）
		int lenth;
		byte[] b = new byte[1024];
		while ((lenth = in.read(b)) > -1) { // 结果大于-1，说明里面有内容
			out.write(b, 0, lenth);
			System.out.println(new String(b, 0, lenth));
			//String s = new String(b, 0, lenth);
			// 将字符串--》byte数组
			//out.write(s.getBytes());
			out.close();
		}
		in.close();
	}
}
