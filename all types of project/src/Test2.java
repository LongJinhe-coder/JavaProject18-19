
import java.util.*;
class ParentClass
{public ParentClass()                        //����Ĺ��췽��
{
value=0; }
public int getValue()                                //�������ֵ���������ظ�����value��ֵ
{
    return value ;
}
public void setValue(int y)//�o���������value��ֵ
{
    value = y;
}
private int value;
}
class SubClass1 extends ParentClass{
    public SubClass1()                //����1���ҹ��췽����valueֵΪ1
    {
        value=1;
    }
    public int getValue()                    //�����ͬ����ֵ��������������1��value��ֵ
    {
        return value;
    }
    public int getClassValue1()                 //�����������ֵ����������classvalue1��ֵ
    {
        return classvalue1;
    }
    private int value;
    private int classvalue1=11;
}
class SubClass2 extends ParentClass
{
    public SubClass2()                 //����2�Ĺ��췽����va;ueֵΪ2
    {
        value=2;
    }
    public int getValue()                    //�����ͬ����ֵ��������������2��value��ֵ
    {
        return value;
    }
    public int getClassValue2()                 //�����������ֵ����������classvalue2��ֵ
    {
        return classvalue2;
    }
    private int value;
    private int classvalue2=22;
}


public class Test2 {
    public static void main(String[] args)
    {
        ParentClass a=new ParentClass();                    //����ʵ��
        SubClass1 b=new SubClass1();             //����1��ʵ��
        SubClass2 c=new SubClass2();                //����2��ʵ��
        a=b;                   //aָ������1��ʵ��
        System.out.println("a="+a.getValue());              //��������1�е�����ֵ
    }
}