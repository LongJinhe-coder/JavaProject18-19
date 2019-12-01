import java.awt.*;
import javax.swing.*;
import java.io.*;
public class MyFrame {
    public static void main(String args[]) {
        JFrame frame = new JFrame("My Frame");           //创建一个JFrame的实例
        frame.setSize(280, 300);              //创建JFrame的大小
        frame.getContentPane().setBackground(Color.RED);
        //设置JFrame的背景颜色
        frame.setVisible(true);         //显示JFrame
        BufferedReader intemp = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press return key to exit.");
        try {
            String s = intemp.readLine();      //等待用户的输入以关闭窗口

        } catch (IOException e) {
            System.out.println("IOException");
        }
        System.exit(0);          //强行退出并关闭
    }
}