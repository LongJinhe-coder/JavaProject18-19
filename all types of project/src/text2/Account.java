package text2;

import java.util.Scanner;

public class Account {
	long account;
	String name;
	double money;
	long settime;
	public void savemoney(){
		int a;
		System.out.println("how much do you want to save");
		Scanner scanner =new Scanner(System.in);
		a=scanner.nextInt();
		System.out.println("You have save"+a+"dollars sucessfully!");
		
	}
	public void withdraw(){
		int a;
		System.out.println("how much do you want to take");
		Scanner scanner =new Scanner(System.in);
		a=scanner.nextInt();
		if(a>=100&&a<=money){
		System.out.println("You have take"+a+"dollars sucessfully!");
		}
		else if(a<100)
			System.out.println("You can not take money under 100");
		else
			System.out.println("sorry,your account is not enough");
		
	}
	public void getaccount(long account){
		this.account=account;
	}
	public void getName(String name){
	this.name=name;
	}
	public void getMoney(double money){
	this.money=money;
	}
	public void getSettime(long settime){
	this.settime=settime;
	}
	public static void main(String[] args) {
		Account account=new Account();
		account.getaccount(190202);
		account.getName("Jake");
		account.getMoney(10000);
	System.out.println("your account is"+account.account);
	System.out.println("your name is"+account.name);
	System.out.println("your money is"+account.money);
	System.out.println("what do you want to do?savemoney with1 or withdraw with 0");
	int b;
	Scanner scanner =new Scanner(System.in);
	b=scanner.nextInt();
	
	if(b==1)
	account.savemoney();
	if(b==0)
	account.withdraw();
	
	
		
		
		
	}
}
