package com.hqu.xuliehua;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObDemo {
	public static void main(String[] args) {
		try {
			FileOutputStream out=new FileOutputStream("d://obj.object");
				ObjectOutputStream obj=new ObjectOutputStream(out);
				Student stu=new Student("ÄÐ","ÕÅÈý");
				obj.writeObject(stu);
				obj.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
