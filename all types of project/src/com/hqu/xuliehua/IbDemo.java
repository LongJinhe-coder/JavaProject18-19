package com.hqu.xuliehua;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IbDemo {
	public static void main(String[] args) {
		try {
			FileInputStream in=new FileInputStream("d://obj.object");
			ObjectInputStream ob=new ObjectInputStream(in);

Student stu=(Student)ob.readObject();
System.out.println(stu);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
