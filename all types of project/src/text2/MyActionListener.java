package text2;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.MissingFormatArgumentException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MyActionListener implements ActionListener {
JFrame frame;
JButton bt1,bt2,bt3;
JTextField tf;
JCheckBox ck;
Container contentPane;
void go(){
	frame=new JFrame("My Frame");
	contentPane=frame.getContentPane();
	contentPane.setLayout(new GridLayout(0,1));
	contentPane.setBackground(Color.CYAN);
	bt1=new JButton("开始");
	bt2=new JButton("暂停");
	bt3=new JButton("退出");
	ck=new JCheckBox("选择按钮");
	JPanel pl1=new JPanel();
	JPanel pl2=new JPanel();
	pl2.setBackground(Color.CYAN);
	pl1.setLayout(new FlowLayout(FlowLayout.CENTER));
	pl2.setLayout(new FlowLayout(FlowLayout.CENTER));
	pl1.add(bt1);
	pl1.add(bt2);
	pl1.add(bt3);
	tf=new JTextField(30);
	String []a={"a","b","c"};
	JComboBox cbx=new JComboBox<>(a);
	bt1.addActionListener(this);
	bt3.addActionListener(this);
	pl2.add(ck);
	pl2.add(tf);
	pl2.add(cbx);
	contentPane.add(pl1);
	contentPane.add(pl2);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton bt=(JButton)e.getSource();
	if(bt==bt1){
		String s="Now let's begin ";
		tf.setText(s);
	}
	else{
		System.exit(0);
	}
	
}
public static void main(String[] args) {
	MyActionListener p=new MyActionListener();
	p.go();
}
}
