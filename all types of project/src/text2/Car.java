package text2;

public class Car {
String name;
int number;
String color;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
Car(String name,int number,String color)
{this.color=color;
this.number=number;
this.name=name;
	}

void print()
{System.out.println("the car'name is"+this.getName());
System.out.println("the car'number is"+this.getNumber());
System.out.println("the car'color is"+this.getColor());
}
public static void main(String[] args) {
	Car car=new Car("Car1", 12345, "white");
	car.print();
}

}