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
	
	//2.д���죺�ڹ��캯������д����
	
	//3.�����ؼ�
	private JLabel lab1;
	private JLabel lab2;
	private JTextField txt;
	private JPasswordField pwd;
	private JButton btn1;
	private JButton btn2;
	public  LoginDemo1(){
		//4.ȡ��Ĭ�ϲ��֣����þ��Զ�λ
		setLayout(null);
		setBounds(50, 50, 250, 240);
		//5.ʵ�����ؼ�
		lab1 = new JLabel("�û���");
		//Font(String name, int style, int size)
		/*	name ����
		 * 	style����ʽ  ��0����   1 ����  2 б�� 3 ��б�壩
		 * 	size�������С
		 */
		lab1.setFont(new Font("����",3, 16));
		lab2 = new JLabel("��  ��");
		txt = new JTextField();
		pwd = new JPasswordField();
		btn1 = new JButton("��¼");
		btn2 = new JButton("ȡ��");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String username=txt.getText();
				String pwd_=pwd.getText();
				if("С�ɰ�".equals(username)&&"123".equals(pwd_)
					){
					JOptionPane.showMessageDialog(null, "��¼�ɹ�");
				}
				else {
					JOptionPane.showMessageDialog(null, "��¼ʧ��");
				}
				
			}
		});
		//6.���ÿؼ�λ��
		lab1.setBounds(40, 40, 60, 40);
		lab2.setBounds(40, 80, 60, 40);
		txt.setBounds(100, 44, 90, 30);
		pwd.setBounds(100, 84, 90, 30);
		btn1.setBounds(50, 135, 60, 30);
		btn2.setBounds(130, 135, 60, 30);
		//7.��ӵ�����
		add(lab1);
		add(lab2);
		add(txt);
		add(pwd);
		add(btn1);
		add(btn2);
		//8.���ÿɼ���Ϊtrue
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//ʵ����
		new LoginDemo1();
	}	
}