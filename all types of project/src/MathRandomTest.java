import java.util.*;
public class MathRandomTest {
    public static void main(String[] args){
        int count=0,MAXof100,MINof100;
        int num,i;

        MAXof100=(int)(100*Math.random()); //生成的第一个随机数
        MINof100=(int)(100*Math.random()); //生成的第二个随机数
        System.out.print(MAXof100+" ");
        System.out.print(MINof100+" ");
        if(MAXof100>50) count++;          // 记录下大于50的个数
        if(MINof100>50) count++;          //  记录下大于50的个数

        if(MAXof100>MINof100){           //比较前两个随机数

            num=MINof100;
            MINof100=MAXof100;//较小者计入MINof100
            MAXof100=num;     //较大者计入MAXof100
        }

        for(i=0;i<98;i++){//接下来生成其余的98个随机数
            num=(int)(100*Math.random());
            System.out.print(num+((i+2)%10==9?"\n":" "));
            if(num>MAXof100)
                MAXof100=num;  //更大的数计入MAXof100
            else if(num<MINof100)
                MINof100=num;  //更小的数计入MINof100
            if(num>50) count++; //记录下大于50的个数
        }

        System.out.println("The MAX of 100 random integers is: "+MAXof100);
        System.out.println("The MIN of 100 random integers is: "+MINof100);
        System.out.println("The number of random more than 50 is : "+count);


    }
}