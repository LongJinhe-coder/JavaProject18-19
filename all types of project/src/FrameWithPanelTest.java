import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.concurrent.Callable;

public class FrameWithPanelTest {
    public static void main(String args[])
    {
        JFrame frame=new JFrame("MyFrame");            //创建一个Jfram的实例
        frame.setSize(280,300);             //设置JFrame的大小
        frame.getContentPane().setBackground(Color.RED);      //设置Jframe的背景颜色
        frame.setVisible(true);                         //显示Jframe
        JPanel contentPane=new JPanel();         //创建一个JPanl的实例
        contentPane.setSize(100,100);  //设置JPanl的大小
      contentPane.setBackground(Color.yellow);       //设置JPanl的背景颜色
        frame.add(contentPane);                 //将JPanl添加到JFrame中
        BufferedReader intemp=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press return key to exit.");
        try {
            String s = intemp.readLine();      //等待用户的输入以关闭窗口

        } catch (IOException e) {
            System.out.println("IOException");
        }
        System.exit(0);          //强行退出并关闭
    }
}