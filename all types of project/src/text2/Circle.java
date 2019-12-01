package text2;

public class Circle {
double rade=5;

public double getRade() {
	return rade;
}

public void setRade(double rade) {
	this.rade = rade;
}
public double area(double a){
	return a*a*3.14;
	
}
public double grith(double b){
	return 2*b*3.14;
}
public Circle(){
	
}
public static void main(String[] args) {
	Circle circle=new Circle();
	circle.setRade(10);
	System.out.println("面积="+circle.area(10));
	System.out.println("周长="+circle.grith(10));
	
	
	
}
}
