import java.util.*;
public class MathRandomTest {
    public static void main(String[] args){
        int count=0,MAXof100,MINof100;
        int num,i;

        MAXof100=(int)(100*Math.random()); //���ɵĵ�һ�������
        MINof100=(int)(100*Math.random()); //���ɵĵڶ��������
        System.out.print(MAXof100+" ");
        System.out.print(MINof100+" ");
        if(MAXof100>50) count++;          // ��¼�´���50�ĸ���
        if(MINof100>50) count++;          //  ��¼�´���50�ĸ���

        if(MAXof100>MINof100){           //�Ƚ�ǰ���������

            num=MINof100;
            MINof100=MAXof100;//��С�߼���MINof100
            MAXof100=num;     //�ϴ��߼���MAXof100
        }

        for(i=0;i<98;i++){//���������������98�������
            num=(int)(100*Math.random());
            System.out.print(num+((i+2)%10==9?"\n":" "));
            if(num>MAXof100)
                MAXof100=num;  //�����������MAXof100
            else if(num<MINof100)
                MINof100=num;  //��С��������MINof100
            if(num>50) count++; //��¼�´���50�ĸ���
        }

        System.out.println("The MAX of 100 random integers is: "+MAXof100);
        System.out.println("The MIN of 100 random integers is: "+MINof100);
        System.out.println("The number of random more than 50 is : "+count);


    }
}