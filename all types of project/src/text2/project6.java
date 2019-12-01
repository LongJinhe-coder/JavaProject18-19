package text2;

import java.util.Scanner;

public class project6 {
	public static void main(String[] args) {
		int []a=new int [4];int k;
		System.out.println("enter the number");
		for(k=0;k<a.length;k++){
			Scanner scanner =new Scanner(System.in);
			a[k]=scanner.nextInt();
		}
		for(k=0;k<4;k++)
			System.out.println(a[k]);
		}
		

}
