package com.hqu.frame;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame {
    private JButton[] btnAry;  //声明按钮数组

    public GridLayoutDemo() {
        btnAry = new JButton[9];             //创建有9个按钮引用的数组
        Container me = getContentPane();
        me.setLayout(new GridLayout(3, 3));  //将内容面板设置为3行3列的网格布局
        //循环实例化按钮，并逐一将按钮添加到内容面板上
        for (int i = 0; i < 7; i++) {
            btnAry[i] = new JButton("按钮" + (i + 1));
            me.add(btnAry[i]);
        }
        setTitle("网格布局示例");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
     }
     
     public static void main(String[] args) {
        new GridLayoutDemo();
     }
}