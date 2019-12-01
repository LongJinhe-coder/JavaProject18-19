package text2;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyPanel extends JPanel{
	Hero hero=new Hero(250, 400);
//	public MyPanel() {
//		// TODO Auto-generated constructor stub
//	 //Hero hero=new Hero(250, 400);
//	 addKeyListener(new KeyAdapter() {
//		 public void keyPressed(KeyEvent e) {
//			switch(e.getKeyCode()){
//				case KeyEvent.VK_W:
//					hero.Direct=0;
//					hero.setY(hero.getY()-5);
//				repaint();
//				case KeyEvent.VK_S:
//					hero.Direct=1;
//					hero.setY(hero.getY()+5);
//				repaint();
//				case KeyEvent.VK_A:
//					hero.Direct=2;
//					hero.setY(hero.getX()-5);
//				repaint();
//				case KeyEvent.VK_D:
//					hero.Direct=3;
//					hero.setY(hero.getX()+5);
//				repaint();
//				
//			}
//		}
//	});
//	 
//		
	//}
	public void getImg(Graphics g,String name){
		Image img = Toolkit.getDefaultToolkit().getImage(
				MyPanel.class.getClassLoader().getResource("images/"+name));
		g.drawImage(img, 100, 100, this);
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		switch (hero.Direct) {
		case 0:this.getImg(g, "tankU.gif");
			break;
		case 1:this.getImg(g, "tankD.gif");
		break;
		case 2:this.getImg(g, "tankL.gif");
		break;
		case 3:this.getImg(g, "tankR.gif");
		break;
		default:
			break;
		}
	}
//	 public void run() {
//	        // ÿ��100���� ���»�ͼ
//	        while (true) {
//	            try {
//	                Thread.sleep(100);
//	            } catch (Exception e) {
//	                e.printStackTrace();
//	            }
//	          //  hitEnemyTank();
//	           // hitMe();
//	            repaint();
//	        }
//	    }

}
