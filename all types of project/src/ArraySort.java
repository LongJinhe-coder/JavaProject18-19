public class ArraySort
{    public void sortArr(int [] arr,int len)
{     //起泡排序
    int tmp=0;
    for(int i=0;i<len;i++)
    {   for(int j=len-1;j>=i+1;j--)
    {   if(arr[j]<arr[j-1])
    {  tmp=arr[j];                                //arr[j]与arr[i]交换
        arr[j]=arr[j-1];
        arr[j-1]=tmp;
    }
    }
    }
}
    public void print(int [] arr,int len)
    {   for (int i = 1; i <= len; i++)
    {   System.out.print(arr[i - 1] + "\t");
    }
    }


    public static void main(String[] args)
    {      ArraySort as=new ArraySort();
        int arr[]=new int[100];
        System.out.print("随机生成的整数数组的值如下：\n");
        for(int i=0;i<100;i++)
        {   arr[i]=(int)(100*Math.random());
            System.out.print(arr[i] + "\t");
        }
        //排序
        as.sortArr(arr,100);
        System.out.print("排序后的整数数组的值如下：\n");
        as.print(arr,100);
    }
}
