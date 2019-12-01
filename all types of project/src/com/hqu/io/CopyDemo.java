package com.hqu.io;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyDemo {

	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("d://1.txt");
		FileWriter writer = new FileWriter("e://3.txt");
		int len;
		char[] ch = new char[1024];
		while ((len = reader.read(ch)) > -1) {
			System.out.println(new String(ch, 0, len));
			// String s=(new String(ch, 0, len));
			// writer.write(s);
			writer.write(ch, 0, len);
			writer.flush();

		}
		writer.close();
		reader.close();
	}
}
