package com.hqu.frame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDemo1 extends JFrame{
	
	//2.写构造：在构造函数里面写代码
	
	//3.声明控件
	private JLabel lab1;
	private JLabel lab2;
	private JTextField txt;
	private JPasswordField pwd;
	private JButton btn1;
	private JButton btn2;
	public  LoginDemo1(){
		//4.取消默认布局，采用绝对定位
		setLayout(null);
		setBounds(50, 50, 250, 240);
		//5.实例化控件
		lab1 = new JLabel("用户名");
		//Font(String name, int style, int size)
		/*	name 字体
		 * 	style：样式  （0正常   1 粗体  2 斜体 3 粗斜体）
		 * 	size：字体大小
		 */
		lab1.setFont(new Font("宋体",3, 16));
		lab2 = new JLabel("密  码");
		txt = new JTextField();
		pwd = new JPasswordField();
		btn1 = new JButton("登录");
		btn2 = new JButton("取消");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String username=txt.getText();
				String pwd_=pwd.getText();
				if("小可爱".equals(username)&&"123".equals(pwd_)
					){
					JOptionPane.showMessageDialog(null, "登录成功");
				}
				else {
					JOptionPane.showMessageDialog(null, "登录失败");
				}
				
			}
		});
		//6.设置控件位置
		lab1.setBounds(40, 40, 60, 40);
		lab2.setBounds(40, 80, 60, 40);
		txt.setBounds(100, 44, 90, 30);
		pwd.setBounds(100, 84, 90, 30);
		btn1.setBounds(50, 135, 60, 30);
		btn2.setBounds(130, 135, 60, 30);
		//7.添加到窗体
		add(lab1);
		add(lab2);
		add(txt);
		add(pwd);
		add(btn1);
		add(btn2);
		//8.设置可见性为true
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//实例化
		new LoginDemo1();
	}	
}