package com.hqu.tanke;

import java.util.Vector;

public class Hero extends Tank{
	public Hero(int x, int y) {
		super(x, y);
		this.color=5;
	}
	Shot shot=null;
	Vector<Shot> shotm=new Vector<>();
	
	//坦克具有一个打击敌人的方法
	public void shotenemy(int x,int y,int direct){
		switch (direct) {
		case 0:
			shot=new Shot(this.x+10,this.y,0);
			shotm.add(shot);
			break;

		case 1:
			shot=new Shot(this.x+30,this.y+10,1);
			shotm.add(shot);
			break;
			
		case 2:
			shot=new Shot(this.x+10,this.y+30,2);
			shotm.add(shot);
			break;
			
		case 3:
			shot=new Shot(this.x,this.y+10,3);
			shotm.add(shot);
			break;
		default:
			break;
		}
		Thread th=new Thread(shot);
		th.start();
	}
	
	//调整速度
	public void moveup() {
		y-=speed;
	}
	
	public void moveright() {
		x+=speed;
	}
	public void movedown() {
		y+=speed;
	}
	public void moveleft() {
		x-=speed;
	}
}
