package com.hqu.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("e://3.txt");

		writer.write("��˧��");
		writer.append("�ó�");
		writer.flush();//����
		writer.close();
	}

}
