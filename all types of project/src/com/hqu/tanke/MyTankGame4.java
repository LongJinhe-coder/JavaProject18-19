package com.hqu.tanke;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;
import java.io.*;
import javax.swing.*;
import javax.imageio.*;

public class MyTankGame4 extends JFrame implements ActionListener {
	MyPanel mp = null;
	MyStartPanel msp = null;
	// 菜单定义
	JMenuBar jmb = null;
	JMenu jm1 = null;
	JMenuItem jmi1 = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTankGame4 mtg = new MyTankGame4();
	}

	// 构造函数
	public MyTankGame4() {
		// 创建菜单
		jmb = new JMenuBar();
		jm1 = new JMenu("Game(G)");
		jm1.setMnemonic('G');
		jmi1 = new JMenuItem("New Game(N)");
		jmi1.setMnemonic('N');
		jmi1.addActionListener(this);
		jmi1.setActionCommand("New Game");
		jm1.add(jmi1);
		jmb.add(jm1);
		this.setJMenuBar(jmb);
		msp = new MyStartPanel();
		Thread st = new Thread(msp);
		st.start();
		this.add(msp);
		this.setTitle("坦克大战");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getActionCommand().equals("New Game")) {
			this.remove(msp);
			mp = new MyPanel();
			Thread mt = new Thread(mp);
			mt.start();
			this.add(mp);
			this.addKeyListener(mp);
			this.setVisible(true);
		}
	}
}
