import java.awt.*;
import javax.swing.*;
import java.io.*;
public class MyFrame {
    public static void main(String args[]) {
        JFrame frame = new JFrame("My Frame");           //����һ��JFrame��ʵ��
        frame.setSize(280, 300);              //����JFrame�Ĵ�С
        frame.getContentPane().setBackground(Color.RED);
        //����JFrame�ı�����ɫ
        frame.setVisible(true);         //��ʾJFrame
        BufferedReader intemp = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press return key to exit.");
        try {
            String s = intemp.readLine();      //�ȴ��û��������Թرմ���

        } catch (IOException e) {
            System.out.println("IOException");
        }
        System.exit(0);          //ǿ���˳����ر�
    }
}