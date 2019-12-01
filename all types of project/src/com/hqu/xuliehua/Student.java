package com.hqu.xuliehua;

import java.io.Serializable;

public class Student implements Serializable{
	private String sex;
	private String name;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(String sex, String name) {
		super();
		this.sex = sex;
		this.name = name;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [sex=" + sex + ", name=" + name + "]";
	}
	
}
