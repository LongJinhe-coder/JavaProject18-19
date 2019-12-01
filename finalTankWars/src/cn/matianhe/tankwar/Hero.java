package cn.matianhe.tankwar;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Vector;

public class Hero extends Tank {
	
	// ����̹��

	Vector<Shot> shotBox = new Vector<Shot>();//����̹���ӵ�����
	Shot shot = null;

	public Hero(int x, int y) {
		super(x, y);
	}
	

	//����̹�˷����ӵ��ķ���
	public void shotEnemy() {

		switch (Direct) {
		case 0:
			
			shot = new Shot(x + 8, y - 4, 0);
			
			shotBox.add(shot);
			break;
		case 1:
			shot = new Shot(x + 9, y + 32, 1);
			shotBox.add(shot);
			break;
		case 2:
			shot = new Shot(x - 8, y + 8, 2);
			shotBox.add(shot);
			break;
		case 3:
			shot = new Shot(x + 32, y + 9, 3);
			shotBox.add(shot);
			break;
		default:
			break;
		}
		Thread t = new Thread(shot);
		t.start();
	}
//����̹���ƶ��ķ���
	public void moveUp() {
		if(!this.isCrashWall(this.x, this.y))
		y -= speed;
	}

	public void moveDown() {
		if(!this.isCrashWall(this.x, this.y))
		y += speed;
	}

	public void moveLeft() {
		if(!this.isCrashWall(this.x, this.y))
		x -= speed;
	}

	public void moveRight() {
		if(!this.isCrashWall(this.x, this.y))
		x += speed;
	}

	
	
}
