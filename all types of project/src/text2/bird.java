package text2;

public class bird {
String name;
String color;
char sex;
public void sing(){
	System.out.println("bird can sing");
}
public void fly(){
	System.out.println("bird can fly");
}
public void setName(String name){
	this.name=name;
}
public void setColor(String color){
	this.color=color;
}
public char getSex(){
	return sex;
}
public static void main(String[] args) {
	bird bird1=new bird();
	bird1.setName("owl");
	System.out.println("bird name is"+bird1.name);
	bird1.sing();
	bird1.fly();
	bird1.setColor("white");
	System.out.println("bird color is"+bird1.color);
	bird1.sex='ал';
	System.out.println("bird sex is"+bird1.getSex());
	Dog dog1=new Dog();
	dog1.getName("jake");
	
	System.out.println(dog1.name);
	
	
	
}
}
