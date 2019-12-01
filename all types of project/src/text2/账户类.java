package text2;

import java.util.Scanner;

public class ÕË»§Àà {
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
	if(a>=100){
	System.out.println("You have take"+a+"dollars sucessfully!");
	}
	else System.out.println("sorry,your account is not enough");
	
}
public void getAccount(long account){
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
	
}

}
