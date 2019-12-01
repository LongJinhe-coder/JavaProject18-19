package com.hqu.java;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		Square squ=new Square();
		Cirle cir=new Cirle();
	 squ.a=sc.nextDouble();
		cir.r=sc.nextDouble();
		System.out.println(squ.area(squ.a));
		System.out.println(cir.area(cir.r));
	}
	
}

