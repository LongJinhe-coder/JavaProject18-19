import java.awt.*;
import javax.swing.*;
import java.io.*;
public class ThreeButtonsJFramTest {
    private JFrame frame;
    private JButton btn1,btn2,btn3;          //定义3个按钮

    public static void main(String args[])
    {
        ThreeButtonsJFramTest that=new ThreeButtonsJFramTest();
        that.go();
        BufferedReader intemp=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press return key to exit.");
        try {
            String s = intemp.readLine();      //等待用户的输入以关闭窗口

        } catch (IOException e) {
            System.out.println("IOException");
        }
        System.exit(0);          //强行退出并关闭
    }

    void go()
    {
    frame=new JFrame("Border Layout");
    btn1=new JButton("North");
    btn2=new JButton("Center");
    btn3=new JButton("South");
    frame.getContentPane().add(btn1,BorderLayout.NORTH);          //添加按钮btn1到北部
        frame.getContentPane().add(btn2,BorderLayout.CENTER);          //添加按钮btn1到中部
        frame.getContentPane().add(btn3,BorderLayout.SOUTH);          //添加按钮btn1到南部
       // frame.setSize(350,200);            //可以定制Frame的大小
        frame.pack();;                    //也可以使用预定的chic
        frame.setVisible(true);
    }
}