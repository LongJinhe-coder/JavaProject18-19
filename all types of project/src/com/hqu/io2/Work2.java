package com.hqu.io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Work2 {
public static void main(String[] args) throws IOException {
	FileInputStream in=new FileInputStream("d://1.txt");
	int len;
	byte b[]=new byte[1024];
	FileOutputStream out=null;
	int count=1;
	File dir=new File("d://temp");
	if(!dir.exists()){
		dir.mkdirs();
	}
	while((len=in.read(b))>-1){
		out=new FileOutputStream(new File(dir,(count++)+".part"));
		out.write(b, 0, len);
	}
	out.close();
	in.close();
}
}
