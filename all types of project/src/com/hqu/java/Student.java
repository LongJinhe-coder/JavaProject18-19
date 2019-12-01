package com.hqu.java;

public class Student {
private String sNo;
private String sName;
public Student(String sNo, String sName) {

	this.sNo = sNo;
	this.sName = sName;
}
public String getsNo() {
	return sNo;
}
public void setsNo(String sNo) {
	this.sNo = sNo;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public static void main(String[] args) {
	Student s=new Student("0110", "Wang");
	System.out.println(s.getsNo());
	System.out.println(s.getsName());
}
}
