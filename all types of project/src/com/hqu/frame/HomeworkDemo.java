package com.hqu.frame;

import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.io.FileWriter;
public class HomeworkDemo {
	
	JFrame f=new JFrame("通讯录");
	Container cp;
	JLabel lb1;
	JLabel lb2;
	JLabel lb3;
	JLabel lb4;
	JLabel lb5;
	JLabel lb6;
	JLabel lb7;
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;
	JTextField tf4;
	JTextField tf5;
	JTextField tf6;
	JButton bt1;
	JButton bt2;
	JButton bt3;
	JButton bt4;

	void go() throws IOException{
	
		
	
		f.setLayout(null);
		f.setBounds(50,50,350,330);
		cp=f.getContentPane();
		cp.setLayout(null);
		lb1=new JLabel("姓名");
		lb2=new JLabel("邮政编码");
		lb3=new JLabel("通信地址");
		lb4=new JLabel("电话");
		lb5=new JLabel("手机");
		lb6=new JLabel("email");
		lb7=new JLabel("个人通信录");
		lb7.setFont(new Font("个人通信录", Font.ITALIC, 30));
		lb1.setBounds(50, 70, 100, 40);
		lb2.setBounds(50, 100, 100, 40);
		lb3.setBounds(50, 130, 100, 40);
		lb4.setBounds(50, 160, 100, 40);
		lb5.setBounds(50, 190, 100, 40);
		lb6.setBounds(50, 220, 100, 40);
		lb7.setBounds(80,10,180,60);
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		tf4=new JTextField();
		tf5=new JTextField();
		tf6=new JTextField();
		tf1.setBounds(120, 80, 80, 25);
		tf2.setBounds(120, 110, 80, 25);
		tf3.setBounds(120, 140, 180, 25);
		tf4.setBounds(120, 170, 180, 25);
		tf5.setBounds(120, 200, 120, 25);
		tf6.setBounds(120, 230, 120, 25);
		
		bt1=new JButton("添加");
		bt2=new JButton("查找");
		bt3=new JButton("清空");
		bt4=new JButton("退出");
		//bt4.addActionListener(e);
		//bt1.addActionListener(e);
		//FileReader reader =new FileReader("d://1.txt");
//		FileOutputStream out=new FileOutputStream("d://1.txt");
//		ObjectOutputStream obj=new ObjectOutputStream(out);
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				FileOutputStream out=new FileOutputStream("d://个人信息.txt");
				ObjectOutputStream obj=new ObjectOutputStream(out);
				Imformation ifm=new Imformation(tf1.getText(),tf2.getText(),tf3.getText(),tf4.getText(),
						tf5.getText(),tf6.getText());
				//if(e.getSource()==bt1){
//				try {
//					obj.writeBytes(tf1.getText()+tf2.getText()+tf3.getText()
//							+tf4.getText()+tf5.getText()+tf6.getText());
//					obj.close();
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
				
					obj.writeObject(ifm);
					obj.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "添加成功");
		}
			//}
		});
		bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf1.getText().equals("龙金河")){
				try {
					FileInputStream in=new FileInputStream("d://个人信息.txt");
					ObjectInputStream ob=new ObjectInputStream(in);
					Imformation im=(Imformation)ob.readObject();
					System.out.println(im);
					tf1.setText(im.getNametext());
					tf2.setText(im.getZiptext());
					tf3.setText(im.getAddtext());
					tf4.setText(im.getTeltext());
					tf5.setText(im.getMobiltext());
					tf6.setText(im.getEmailtext());
					ob.close();
				} catch (ClassNotFoundException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
			}
		});
		bt3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
				tf4.setText(null);
				tf5.setText(null);
				tf6.setText(null);
				
			}
		});
		
		bt4.addActionListener(new ActionListener() {
			
			@Override
		public void actionPerformed(ActionEvent e) {

				System.exit(0);
				}
		
		});

		bt1.setBounds(40,260,60,25);
		bt2.setBounds(105,260,60,25);
		bt3.setBounds(170,260,60,25);
		bt4.setBounds(235,260,60,25);
	
		cp.add(lb1);
		cp.add(lb2);
		cp.add(lb3);
		cp.add(lb4);
		cp.add(lb5);
		cp.add(lb6);
		cp.add(lb7);
		cp.add(tf1);
		cp.add(tf2);
		cp.add(tf3);
		cp.add(tf4);
		cp.add(tf5);
		cp.add(tf6);
		cp.add(bt1);
		cp.add(bt2);
		cp.add(bt3);
		cp.add(bt4);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) throws IOException  {
		HomeworkDemo d=new HomeworkDemo();
		d.go();
	}
}
