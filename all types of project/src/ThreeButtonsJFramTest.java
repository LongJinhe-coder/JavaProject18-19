import java.awt.*;
import javax.swing.*;
import java.io.*;
public class ThreeButtonsJFramTest {
    private JFrame frame;
    private JButton btn1,btn2,btn3;          //����3����ť

    public static void main(String args[])
    {
        ThreeButtonsJFramTest that=new ThreeButtonsJFramTest();
        that.go();
        BufferedReader intemp=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press return key to exit.");
        try {
            String s = intemp.readLine();      //�ȴ��û��������Թرմ���

        } catch (IOException e) {
            System.out.println("IOException");
        }
        System.exit(0);          //ǿ���˳����ر�
    }

    void go()
    {
    frame=new JFrame("Border Layout");
    btn1=new JButton("North");
    btn2=new JButton("Center");
    btn3=new JButton("South");
    frame.getContentPane().add(btn1,BorderLayout.NORTH);          //��Ӱ�ťbtn1������
        frame.getContentPane().add(btn2,BorderLayout.CENTER);          //��Ӱ�ťbtn1���в�
        frame.getContentPane().add(btn3,BorderLayout.SOUTH);          //��Ӱ�ťbtn1���ϲ�
       // frame.setSize(350,200);            //���Զ���Frame�Ĵ�С
        frame.pack();;                    //Ҳ����ʹ��Ԥ����chic
        frame.setVisible(true);
    }
}