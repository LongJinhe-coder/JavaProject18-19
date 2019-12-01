public class Cat extends Animal{
	private String color;
	
	public void bark(){
		System.out.println("½Ð");
	}
	
	public static void main(String[] args) {
		Cat c = new Cat();
		
		c.age=111;
		c.name="¶ÌÎ²";
	
		c.color="blue";
	
		c.eat();
	
		c.bark();
	}
}