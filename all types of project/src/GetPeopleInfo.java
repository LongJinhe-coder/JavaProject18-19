import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class NameInformation
{
    private String name,infor;
    public NameInformation(String n,String i)
    {
        name=n;
        infor=i;
    }
    public String getName()
    {
        return name;
    }
    public String getInfor()
    {
        return infor;
    }
}


public class GetPeopleInfo extends WindowAdapter implements ActionListener, ItemListener {
    JFrame f;            //定义框架
    JButton bClose;                   //定义按钮
    JLabel lInformation,lSelectName;     //定义两个标签
    JLabel lSpace1=new JLabel("");    //定义4个占位空标签
    JLabel lSpace2=new JLabel("");
    JLabel lSpace3=new JLabel("");
    JLabel lSpace4=new JLabel("");
    JTextArea tTarget;     //定义文本组件
    //人名及对应的信息
    NameInformation [] classNameInfor=new NameInformation[4];
    JComboBox cName;            //定义组合框（下拉菜单）

    public static void main(String args [])
    {
        GetPeopleInfo be=new GetPeopleInfo();
        //初始化人名及对应的信息
        be.classNameInfor[0]=new NameInformation("Tom","Tom is a good boy.");
        be.classNameInfor[1]=new NameInformation("Jack","Jack is the best student of his class.");
        be.classNameInfor[2]=new NameInformation("Mary","Mary is a nice girl.");
        be.classNameInfor[3]=new NameInformation("Linda","Linda is the teacher of this class.");
        be.go();
    }

    public void go()
    {
        f=new JFrame("My JFram");      //创建框架
        f.setLayout(new GridLayout(1,2));          //设置框架的布局管理器
        f.setSize(300,250);    //设置框架的尺寸

        lInformation=new JLabel("Information");
        lSelectName=new JLabel("Select Nmae");
        JPanel pan1=new JPanel();           //创建两个面板
        JPanel pan2=new JPanel();

        pan1.setLayout(new FlowLayout(FlowLayout.LEFT));    //面板1的布局管理器
        GridBagLayout pan2Layout=new GridBagLayout();         //面板2的布局管理器
        pan2.setLayout(pan2Layout);
        GridBagConstraints c=new GridBagConstraints();     //对应于GridBagLayout
        c.anchor=GridBagConstraints.NORTH;                   //在网格中如何显示组件
        c.gridx=0;
        c.gridy=0;

        tTarget=new JTextArea("",8,10);     //创建文本组件
        //创建带滚卷条的显示区
        JScrollPane jsp1=new JScrollPane(tTarget,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        pan1.add(lInformation);        //左侧面板中组件的加入
        pan1.add(jsp1);
        pan2Layout.setConstraints(lSelectName,c);           //右侧面板的组件放置方式
        pan2.add(lSelectName);

        cName=new JComboBox();   //创建组合框
        for (int i=0;i<4;i++)
        {
            cName.addItem(classNameInfor[i].getName()); //加入名字
        }
        cName.addItemListener(this);   //添加监听器

        c.gridx=0;
        c.gridy=10;
        pan2Layout.setConstraints(cName,c);         //名字的显示方式
        pan2.add(cName,c);

        c.gridx=0;
        c.gridy=30;
        pan2Layout.setConstraints(lSpace1,c);
        pan2.add(lSpace1,c);

        c.gridx=0;
        c.gridy=50;
        pan2Layout.setConstraints(lSpace2,c);
        pan2.add(lSpace2,c);

        c.gridx=0;
        c.gridy=80;
        pan2Layout.setConstraints(lSpace3,c);
        pan2.add(lSpace3,c);

        c.gridx=0;
        c.gridy=100;
        pan2Layout.setConstraints(lSpace4,c);
        pan2.add(lSpace4,c);

        bClose=new JButton("Close");
        bClose.addActionListener(this);               //监听

        c.gridx=0;
        c.gridy=170;
        c.anchor=GridBagConstraints.CENTER;
        pan2Layout.setConstraints(bClose,c);
        pan2.add(bClose,c);

        f.add(pan1);
        f.add(pan2);

        f.addWindowFocusListener(this);            //对窗口的监听
        f.setVisible(true);




    }
    //实现ActionListener接口中的actionPerformed()方法
    public void actionPerformed(ActionEvent e)
    {
        //bClose JButton
        if(e.getSource()==bClose)
        {
            System.exit(0);
        }
    }

    //实现ItemListener接口中的ItemStateChanged方法
    public void itemStateChanged(ItemEvent e)
    {
        tTarget.replaceRange(classNameInfor [((JComboBox)(e.getSource())).getSelectedIndex()].getInfor(),0,tTarget.getText().length());
    }

    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}