package com.hqu.tanke;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

//游戏开始面板
class MyStartPanel extends JPanel implements Runnable

{
	int times = 0;

	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(0, 0, 400, 300);
		if (times % 2 == 0) {
			Font myfont = new Font("行楷", Font.BOLD, 30);
			g.setFont(myfont);
			g.setColor(Color.yellow);
			g.drawString("第一关", 130, 130);
		}
		this.repaint();
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(300);
				times++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
