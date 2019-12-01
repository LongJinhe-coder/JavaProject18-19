package text2;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Gra extends JFrame{
	
	int width;int height;
	
	public Gra(int width, int height) throws HeadlessException {
		 setSize(width, height);
	        setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void paint(Graphics g) {
		Image image=null;
		image = Toolkit.getDefaultToolkit().getImage(
                Panel.class.getResource("/img/tankL.gif"));
		g.drawImage(image, 30, 40, this);
		
	}
	
	}

