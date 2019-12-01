package text2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;
import java.nio.charset.MalformedInputException;

import javax.swing.*;
public class BorderLayoutDemo {
Frame frame;
JButton b1,b2,b3,b4;
JLabel l1;
JPanel contentPane;
//JPanel contentPane;
void go()
{
	frame=new Frame("BorderLayoutDemo");
	b1=new JButton("按钮1");
	b2=new JButton("按钮2");
	b3=new JButton("按钮3");
	b4=new JButton("按钮4");
	l1=new JLabel("标签");
	contentPane=new JPanel();
	//contentPane=frame.getContentPane();
	contentPane.setLayout(new BorderLayout());
	//frame.setLayout(new BorderLayout());
	contentPane.add(b1,BorderLayout.NORTH);
	contentPane.add(b2,BorderLayout.WEST);
	contentPane.add(b3,BorderLayout.EAST);
	contentPane.add(b4,BorderLayout.SOUTH);
	contentPane.add(l1,BorderLayout.CENTER);
	contentPane.setBackground(Color.CYAN);
	frame.add(contentPane);
	//frame.setSize(350, 200);
	frame.pack();
	frame.setVisible(true);
	
	
	
}
public static void main(String[] args) {
	BorderLayoutDemo demo=new BorderLayoutDemo();
	demo.go();
}
}
