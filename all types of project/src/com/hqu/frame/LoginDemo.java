package com.hqu.frame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.omg.CORBA.PUBLIC_MEMBER;

public class LoginDemo {
	JFrame frame = new JFrame();
	Container cp;
	public JLabel lab1, lab2;
	public JButton btn1, btn2;
	public JTextField tf;
	public JPasswordField pwd;
	public JPanel p1, p2;

	void go() {
		cp = frame.getContentPane();
		cp.setLayout(new GridLayout(0,1));
		p1 = new JPanel();
		p2 = new JPanel();
		p1.setLayout(new GridLayout(2, 2));
		p2.setLayout(new FlowLayout());
		lab1 = new JLabel("用户名");
		lab2 = new JLabel("密 码");
		tf = new JTextField();
		pwd = new JPasswordField();
		p1.add(lab1);
		p1.add(tf);
		p1.add(lab2);
		p1.add(pwd);
		btn1 = new JButton("登录");
		btn2 = new JButton("取消");
		p2.add(btn1);
		p2.add(btn2);
		cp.add(p1);
		cp.add(p2);
		frame.setSize(240, 220);
		frame.setVisible(true);

	}
	public static void main(String[] args) {
		LoginDemo d=new LoginDemo();
		d.go();
	}

}
