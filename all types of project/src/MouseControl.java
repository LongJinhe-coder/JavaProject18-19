import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseControl implements MouseMotionListener, KeyListener {
   // MouseControl类同时实现MouseMotionListener, KeyListener两个接口
    private JFrame frame;
    private JLabel tf;
    String ch="";             //放置带显示的字符
    public static void main(String args[])
    {
        MouseControl two=new MouseControl();
        two.go();
    }
    public void go()
    {
        frame=new JFrame("Mouse Concrol");
        Container contentPane=frame.getContentPane();
        contentPane.add(new JLabel("get mouse and keyboard event"),
        BorderLayout.NORTH);
tf=new JLabel();
contentPane.add(tf,BorderLayout.SOUTH);
//注册监听程序
        frame.addMouseMotionListener(this);
        frame.addKeyListener(this);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    //实现MouseMotionListener接口中的方法
    public void mouseDragged(MouseEvent e)
    {
        String s="Mouse dragging; X="+e.getX()+"Y="+e.getY()+"key;"+ch;
        tf.setText(s);
    }
    public void mouseMoved(MouseEvent e)
    {
        String s="Mouse dragging; X="+e.getX()+"Y="+e.getY()+"key;"+ch;
        tf.setText(s);
    }
    //实现KeyListener接口中的方法
    public void keyTyped(KeyEvent evt)
    {
        int charcode=evt.getKeyCode();
        ch="D";
        if (charcode==KeyEvent.VK_SHIFT) ch="S";
        if (charcode==KeyEvent.VK_CONTROL) ch="C";
    }
    public void keyPressed(KeyEvent evt)
    {
        int charcode=evt.getKeyCode();
        ch="D";                                   //其他键显示"D
        if (charcode==KeyEvent.VK_SHIFT) ch="S"; //Shift显示"S
        if (charcode==KeyEvent.VK_CONTROL) ch="C";//Ctrl显示"C
    }
    public void keyReleased(KeyEvent evt)    //松开时显示"U
    {
        ch="U";
    }

}