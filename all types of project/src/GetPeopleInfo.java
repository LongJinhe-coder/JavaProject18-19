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
    JFrame f;            //������
    JButton bClose;                   //���尴ť
    JLabel lInformation,lSelectName;     //����������ǩ
    JLabel lSpace1=new JLabel("");    //����4��ռλ�ձ�ǩ
    JLabel lSpace2=new JLabel("");
    JLabel lSpace3=new JLabel("");
    JLabel lSpace4=new JLabel("");
    JTextArea tTarget;     //�����ı����
    //��������Ӧ����Ϣ
    NameInformation [] classNameInfor=new NameInformation[4];
    JComboBox cName;            //������Ͽ������˵���

    public static void main(String args [])
    {
        GetPeopleInfo be=new GetPeopleInfo();
        //��ʼ����������Ӧ����Ϣ
        be.classNameInfor[0]=new NameInformation("Tom","Tom is a good boy.");
        be.classNameInfor[1]=new NameInformation("Jack","Jack is the best student of his class.");
        be.classNameInfor[2]=new NameInformation("Mary","Mary is a nice girl.");
        be.classNameInfor[3]=new NameInformation("Linda","Linda is the teacher of this class.");
        be.go();
    }

    public void go()
    {
        f=new JFrame("My JFram");      //�������
        f.setLayout(new GridLayout(1,2));          //���ÿ�ܵĲ��ֹ�����
        f.setSize(300,250);    //���ÿ�ܵĳߴ�

        lInformation=new JLabel("Information");
        lSelectName=new JLabel("Select Nmae");
        JPanel pan1=new JPanel();           //�����������
        JPanel pan2=new JPanel();

        pan1.setLayout(new FlowLayout(FlowLayout.LEFT));    //���1�Ĳ��ֹ�����
        GridBagLayout pan2Layout=new GridBagLayout();         //���2�Ĳ��ֹ�����
        pan2.setLayout(pan2Layout);
        GridBagConstraints c=new GridBagConstraints();     //��Ӧ��GridBagLayout
        c.anchor=GridBagConstraints.NORTH;                   //�������������ʾ���
        c.gridx=0;
        c.gridy=0;

        tTarget=new JTextArea("",8,10);     //�����ı����
        //����������������ʾ��
        JScrollPane jsp1=new JScrollPane(tTarget,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        pan1.add(lInformation);        //������������ļ���
        pan1.add(jsp1);
        pan2Layout.setConstraints(lSelectName,c);           //�Ҳ�����������÷�ʽ
        pan2.add(lSelectName);

        cName=new JComboBox();   //������Ͽ�
        for (int i=0;i<4;i++)
        {
            cName.addItem(classNameInfor[i].getName()); //��������
        }
        cName.addItemListener(this);   //��Ӽ�����

        c.gridx=0;
        c.gridy=10;
        pan2Layout.setConstraints(cName,c);         //���ֵ���ʾ��ʽ
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
        bClose.addActionListener(this);               //����

        c.gridx=0;
        c.gridy=170;
        c.anchor=GridBagConstraints.CENTER;
        pan2Layout.setConstraints(bClose,c);
        pan2.add(bClose,c);

        f.add(pan1);
        f.add(pan2);

        f.addWindowFocusListener(this);            //�Դ��ڵļ���
        f.setVisible(true);




    }
    //ʵ��ActionListener�ӿ��е�actionPerformed()����
    public void actionPerformed(ActionEvent e)
    {
        //bClose JButton
        if(e.getSource()==bClose)
        {
            System.exit(0);
        }
    }

    //ʵ��ItemListener�ӿ��е�ItemStateChanged����
    public void itemStateChanged(ItemEvent e)
    {
        tTarget.replaceRange(classNameInfor [((JComboBox)(e.getSource())).getSelectedIndex()].getInfor(),0,tTarget.getText().length());
    }

    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}