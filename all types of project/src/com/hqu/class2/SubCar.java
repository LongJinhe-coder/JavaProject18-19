package com.hqu.class2;

public class SubCar extends Car{
int price;
int speed;

public SubCar( String mark,int price, int speed) {
	super(mark);
	this.price = price;
	this.speed = speed;
}


void speedChange(int newspeed){
	speed=newspeed;
}
}
