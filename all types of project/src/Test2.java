
import java.util.*;
class ParentClass
{public ParentClass()                        //父类的构造方法
{
value=0; }
public int getValue()                                //父类的求值方法，返回父类中value的值
{
    return value ;
}
public void setValue(int y)//給父类的属性value赋值
{
    value = y;
}
private int value;
}
class SubClass1 extends ParentClass{
    public SubClass1()                //子类1得我构造方法，value值为1
    {
        value=1;
    }
    public int getValue()                    //子类的同名求值方法，返回子类1中value的值
    {
        return value;
    }
    public int getClassValue1()                 //子类的特殊求值方法，返回classvalue1的值
    {
        return classvalue1;
    }
    private int value;
    private int classvalue1=11;
}
class SubClass2 extends ParentClass
{
    public SubClass2()                 //子类2的构造方法，va;ue值为2
    {
        value=2;
    }
    public int getValue()                    //子类的同名求值方法，返回子类2中value的值
    {
        return value;
    }
    public int getClassValue2()                 //子类的特殊求值方法，返回classvalue2的值
    {
        return classvalue2;
    }
    private int value;
    private int classvalue2=22;
}


public class Test2 {
    public static void main(String[] args)
    {
        ParentClass a=new ParentClass();                    //父类实例
        SubClass1 b=new SubClass1();             //子类1的实例
        SubClass2 c=new SubClass2();                //子类2的实例
        a=b;                   //a指向子类1的实例
        System.out.println("a="+a.getValue());              //返回子类1中的属性值
    }
}