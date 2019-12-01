
public class MultipleTable
{      public static void main(String[] arges)
{   MultipleTable mt=new MultipleTable();

    int initNum=9;                                                //输出共九行
    int res=0;                                                    //计算乘法结果
    for(int i=1;i<=initNum;i++)                                   //行的控制
    {     for(int j=1;j<=i;j++)                                   //列的控制
    {      res=i*j;                                             //乘积
        mt.printFormula(i,j,res);

    }
        System.out.print("\n");
    }
}
    public void printFormula(int i,int j,int res)
    {       System.out.print(i+"*"+j+"="+res+" ");

    }
}