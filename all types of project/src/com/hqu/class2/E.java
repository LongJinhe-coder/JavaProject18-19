package com.hqu.class2;

public class E {
	void print(SubCar c) {
		System.out.println("本车的品牌是" + c.mark);
		System.out.println(c.mark + "车的价格是" + c.price);
		System.out.println(c.mark + "车的速度是" + c.speed);
		System.out.println("本车正在驾驶");
		c.speedChange(120);
		System.out.println(c.mark + "车现在的速度是" + c.speed);
	}

	public static void main(String[] args) {
		SubCar aodi = new SubCar("奥迪", 50, 80);
		SubCar benchi = new SubCar("奔驰", 100, 90);
		E e = new E();
		e.print(aodi);
		System.out.println();
		e.print(benchi);

	}
}
