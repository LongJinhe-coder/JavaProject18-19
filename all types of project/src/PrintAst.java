
import java.util.*;
public class PrintAst {
    public static void main (String[] args) {
        PrintAst pa = new PrintAst();
        int initNum = 7;                  //�ܹ����7��

        for (int i = 1; i <= initNum; i++) {
            if (i <= (initNum + 1) / 2)           //ǰ�벿��
            {
                for (int m = 1; m <= 3 * (i - 1); m++) {
                    pa.printSpace();               //����ո�
                }
                for(int k=1;k<=initNum-2*(i-1);k++)
                {
                    pa.printAstar();               //����Ǻ�
                }
            }
            else                                     //��벿��
            {
                for (int m = 21 - 3 * i; m > 0; m--) {
                    pa.printSpace();
                }
                for (int k = 1; k <= 2 * i - initNum; k++) {
                    pa.printAstar();
                }
            }
            System.out.print("\n");
        }
    }
    public  void printAstar()
    {  System.out.print(" * ");
    }
    public  void printSpace()
    {
        System.out.print(" ");
    }
}