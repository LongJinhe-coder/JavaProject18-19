import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.concurrent.Callable;

public class FrameWithPanelTest {
    public static void main(String args[])
    {
        JFrame frame=new JFrame("MyFrame");            //����һ��Jfram��ʵ��
        frame.setSize(280,300);             //����JFrame�Ĵ�С
        frame.getContentPane().setBackground(Color.RED);      //����Jframe�ı�����ɫ
        frame.setVisible(true);                         //��ʾJframe
        JPanel contentPane=new JPanel();         //����һ��JPanl��ʵ��
        contentPane.setSize(100,100);  //����JPanl�Ĵ�С
      contentPane.setBackground(Color.yellow);       //����JPanl�ı�����ɫ
        frame.add(contentPane);                 //��JPanl��ӵ�JFrame��
        BufferedReader intemp=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press return key to exit.");
        try {
            String s = intemp.readLine();      //�ȴ��û��������Թرմ���

        } catch (IOException e) {
            System.out.println("IOException");
        }
        System.exit(0);          //ǿ���˳����ر�
    }
}