package text2;

import java.util.Scanner;

public class project5 {
	public static void main(String[] args) {
		int a,b,c,x;
		for(x=100;x<=1000;x++){
			a=x%10;
			b=(x-a)/10%10;
			c=(x-b)/100%10;
			if(a*a*a+b*b*b+c*c*c==x)
				System.out.println(x+"是水仙花数");
			
		}
	}
}
