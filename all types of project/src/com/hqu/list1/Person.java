package com.hqu.list1;
public class Person {

	private int id;
	private String name;
	private String sex;
	private int age;

	public Person(int id, String name, String sex, int age) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public Person() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", age=" + age + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getSex()=" + getSex() + ", getAge()="
				+ getAge() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}