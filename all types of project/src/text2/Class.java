package text2;

import java.nio.DoubleBuffer;

public class Class<Type> {
int a;
double b;
<Integer> void setName(int b){
	this.b=b;
}
public double getName(){
	return b;
}
public static void main(String[] args) {
	Class<Integer> x=new Class<Integer>();
	Class<Double> y=new Class<Double>();
	x.setName(2);
	System.out.println(x.getName());
}
}
