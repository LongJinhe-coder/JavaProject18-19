package com.hqu.class2;

public class E {
	void print(SubCar c) {
		System.out.println("������Ʒ����" + c.mark);
		System.out.println(c.mark + "���ļ۸���" + c.price);
		System.out.println(c.mark + "�����ٶ���" + c.speed);
		System.out.println("�������ڼ�ʻ");
		c.speedChange(120);
		System.out.println(c.mark + "�����ڵ��ٶ���" + c.speed);
	}

	public static void main(String[] args) {
		SubCar aodi = new SubCar("�µ�", 50, 80);
		SubCar benchi = new SubCar("����", 100, 90);
		E e = new E();
		e.print(aodi);
		System.out.println();
		e.print(benchi);

	}
}
