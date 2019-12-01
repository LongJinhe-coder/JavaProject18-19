package com.hqu.frame;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame {
    private JButton[] btnAry;  //������ť����

    public GridLayoutDemo() {
        btnAry = new JButton[9];             //������9����ť���õ�����
        Container me = getContentPane();
        me.setLayout(new GridLayout(3, 3));  //�������������Ϊ3��3�е����񲼾�
        //ѭ��ʵ������ť������һ����ť��ӵ����������
        for (int i = 0; i < 7; i++) {
            btnAry[i] = new JButton("��ť" + (i + 1));
            me.add(btnAry[i]);
        }
        setTitle("���񲼾�ʾ��");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
     }
     
     public static void main(String[] args) {
        new GridLayoutDemo();
     }
}