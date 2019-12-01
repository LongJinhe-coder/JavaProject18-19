package cn.matianhe.tankwar;

import javax.swing.JPanel;



public class Tank {

	int x = 0;
	int y = 0;
	int speed = 12;
	int Direct = 0;
	int color;
	boolean isLive = true;

	//set tank property
	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getDirect() {
		return Direct;
	}

	public void setDirect(int direct) {
		Direct = direct;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Tank(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	//判断坦克是否撞墙，若是普通墙，铁块或水则返回true，表示相撞
	  public boolean isCrashWall(int x, int y) {
		  
		  for (int i = 0; i < WallSetting.MAP.length-1; i++) {
				for (int j = 0; j < 25; j++) {
					if (WallSetting.MAP[i][j] == WallSetting.BRICK     
							||WallSetting.MAP[i][j] == WallSetting.WATER
							||WallSetting.MAP[i][j] == WallSetting.BORDER) {
						
						switch (this.Direct) {
						case 0:if(x>i*28-34&&x<i*28+28
								&&y>j*28&&y<j*28+28){
							return true;}
						
							break;
						case 1:if(x>i*28-34&&x<i*28+28
								&&y<j*28&&y>j*28-34){
							return true;}
							break;
						case 2:if(x<i*28+28&&x>i*28
								&&j*28-34<y&&y<j*28+28){
							return true;}
							break;
						case 3:if(x+34>i*28&&x+34<i*28+28
								&&j*28-34<y&&y<j*28+28){
							return true;}
							break;
						
						}
					}
				}
			}
		return false;

	}
}
