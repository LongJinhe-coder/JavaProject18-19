package text2;

import java.util.Scanner;
public class project4{
	public static void main(String[] args){
	    Scanner input=new Scanner(System.in);
		  String a=input.nextLine();
		   int b=input.nextInt();
		   int c=input.nextInt();
		   int d=input.nextInt();
		  int Sum=0;
		  double Average=0;
		  Sum=b+c+d;
		  Average=Sum/4.0;
		  System.out.println(a);
	System.out.println("Sum = "+Sum+"; Average = "+Average);
	}
}
