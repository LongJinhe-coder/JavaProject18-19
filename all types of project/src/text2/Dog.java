package text2;

public class Dog {
String breed;
String name;
double age;
long number;
public void bark(){
	System.out.println("This dog can bark!");
}
public int sum(int a,int b){
	return a+b;
}
public void getBreed(String breed){
	this.breed=breed;
	
}
public void getName(String name){
	this.name=name;
	
}
public Dog(){
	System.out.println("hillo");
}
public Dog(String breed,String name,double age){
	this.breed=breed;
	this.name=name;
	this.age=age;
}
public static void main(String[] args) {
	Dog dog=new Dog("Ì©µÏ","ºÎÔó¾ü",18);
	System.out.println(dog.breed);
	System.out.println(dog.name);
	System.out.println(dog.age);
	dog.bark();
	System.out.println(dog.sum(10,20));
}

}
