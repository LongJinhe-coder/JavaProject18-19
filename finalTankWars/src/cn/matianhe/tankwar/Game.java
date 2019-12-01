package cn.matianhe.tankwar;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

/**
 * @author matianhe
 *
 */

public class Game extends JFrame {

	/**
	 * @param args
	 */
	MyPanel mainPanel = null;
	
	protected static int width=1030,height=740;
    
	public Game() {
    	Sound.doBack();//播放主音乐
        mainPanel = new MyPanel(); //自动调用重画方法
        Thread t = new Thread(mainPanel);
        t.start();//启动面板线程
        add(mainPanel);
        setSize(width, height);//设置界面的大小
        setVisible(true);//设置可见
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(getOwner());//设置居中
        addKeyListener(mainPanel);
        
        
    }
    
    
    

    public static void main(String[] args) {
               new Game();//创建窗口
    }
}
