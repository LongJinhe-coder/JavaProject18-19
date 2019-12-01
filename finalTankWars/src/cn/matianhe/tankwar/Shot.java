package cn.matianhe.tankwar;

import java.awt.Color;
import java.awt.Graphics;

public class Shot implements Runnable {
	int x;
	int y;
	int Direct;
	int speed = 12;
	boolean isLive = true;

	public Shot(int x, int y, int Direct) {
		this.x = x;
		this.y = y;
		this.Direct = Direct;
	}

//子弹类的run方法
	public void run() {
		while (true) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
			// 0 up  2 left
			switch (Direct) {
			case 0:
				y -= speed;
				break;
			case 1:
				y += speed;
				break;
			case 2:
				x -= speed;
				break;
			case 3:
				x += speed;
				break;
			default:
				break;
			}

			//如果子弹出边界，则失活
			if (x < 0 || x > Game.width || y < 0 || y > Game.height) {
				this.isLive = false;
				break;
			}
		}
	}
}
