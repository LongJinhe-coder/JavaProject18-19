import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseControl implements MouseMotionListener, KeyListener {
   // MouseControl��ͬʱʵ��MouseMotionListener, KeyListener�����ӿ�
    private JFrame frame;
    private JLabel tf;
    String ch="";             //���ô���ʾ���ַ�
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
//ע���������
        frame.addMouseMotionListener(this);
        frame.addKeyListener(this);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    //ʵ��MouseMotionListener�ӿ��еķ���
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
    //ʵ��KeyListener�ӿ��еķ���
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
        ch="D";                                   //��������ʾ"D
        if (charcode==KeyEvent.VK_SHIFT) ch="S"; //Shift��ʾ"S
        if (charcode==KeyEvent.VK_CONTROL) ch="C";//Ctrl��ʾ"C
    }
    public void keyReleased(KeyEvent evt)    //�ɿ�ʱ��ʾ"U
    {
        ch="U";
    }

}