package com.hqu.class1;

public class G {
void makeCry(CanCry c){
	c.cry();
}
public static void main(String[] args) {
	Dog dog=new Dog();
	Cat cat=new Cat();
	G g=new G();
	g.makeCry(dog);
	g.makeCry(cat);
}
}
