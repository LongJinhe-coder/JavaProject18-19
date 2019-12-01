package text2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Button extends MouseAdapter {
	JFrame f;
	JButton bt1,bt2,bt3;
	JPanel p1;
	JTextField tf;
	public void go()
	{
		f=new JFrame("My JFrame");
		p1=new JPanel();
		bt1=new JButton("开始");
		bt1.addMouseListener(this);
		bt2=new JButton("暂停");
		
		bt3=new JButton("结束");
		bt3.addMouseListener(this);
		JLabel label1=new JLabel("标签1");
		JLabel label2=new JLabel("标签2");
		tf=new JTextField(30);
		//f.setLayout(new FlowLayout());
		//p1.setLayout(new FlowLayout(FlowLayout.CENTER) );
		p1.setLayout(new GridLayout(3,2));
		p1.add(bt1);
		p1.add(bt2);
		p1.add(bt3);
		p1.add(label1);
		p1.add(label2);
		p1.add(tf);
		p1.setBackground(Color.CYAN);
	    f.add(p1);
		f.pack();
		//f.setSize(280, 100);
		//p1.setSize(280,100);
		f.setVisible(true);
		
	}
public	void mouseClicked(MouseEvent e){
	String s="Now I will begin";
	tf.setText(s);
		
	}
public static void main(String[] args) {
	Button b=new Button();
	b.go();
}
}
