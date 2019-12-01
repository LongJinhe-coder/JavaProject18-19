package com.hqu.jframe.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.hqu.xuliehua.Student;
public class StudentDao {
	//添加学生的方法
	
	public boolean addStudent(List<Imformation> stu){
		try {
			FileOutputStream out = new FileOutputStream("D://student.txt");
			ObjectOutputStream obs = new ObjectOutputStream(out);
			obs.writeObject(stu);
			obs.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}