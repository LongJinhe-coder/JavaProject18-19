package text2;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestListener extends JPanel {
	
	//构造方法
	public TestListener() {
		init();
	}
	
	/**
	 * 自定义的初始化的方法
	 */
	public void init(){
		final ImageIcon icon1 = new ImageIcon("image/serverstart.gif");
		final ImageIcon icon2 = new ImageIcon("image/serverstop.gif");
		final JLabel label = new JLabel();
		label.setIcon(icon1);
		//this：指代当前对象：panel。由于继承了JPanel所以panel就是一个面板
		// 把label添加到面板上
		this.add(label);
		//创建监听器  使用适配器
		MouseAdapter adapter = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("鼠标点击事件");
			}
			@Override
			public void mousePressed(MouseEvent e) {
			    System.out.println("鼠标的pressed事件");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("鼠标移入事件");
				label.setIcon(icon2);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("鼠标移出事件");
				label.setIcon(icon1);
			}
		};
		
		//给label绑定监听
		label.addMouseListener(adapter);
	}
	
	
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("监听器");
        TestListener panel = new TestListener();
        jFrame.add(panel);
		// 设置窗体的大小
		jFrame.setSize(500, 500);
		// 设置关闭方式
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置中间显示
		jFrame.setLocationRelativeTo(null);
		// 设置大小不可变
		jFrame.setResizable(false);
		Image image = new ImageIcon("image/face0.gif").getImage();
		jFrame.setIconImage(image);
		// 设置窗体可见
		jFrame.setVisible(true);
	}
}
