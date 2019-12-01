package text2;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Flybird {
	public static void main(String[] args) {
		JFrame jfram=new JFrame("flybird");
		
		JPanel panel=new JPanel();
		JButton button=new JButton("按钮");
		JTextField field=new JTextField(10);
		JLabel lable=new JLabel("我是lable");
		Font font=new Font("楷体",Font.BOLD ,24);
		lable.setFont(font);
		JTextArea area=new JTextArea(10,10);
		
		panel.add(button);
		panel.add(field);
		panel.add(lable);
		panel.add(area);
		jfram.add(panel);
		
		jfram.setSize(300, 400);
		jfram.setLocationRelativeTo(null);
		jfram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfram.setVisible(true);
		jfram.setResizable(false);
	}

}
