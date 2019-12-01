public class Car {

	String brank;
	double price;
	String color;

	public void run() {
		System.out.println("车会run");
	}

	public void music() {
		System.out.println("车可以放Music");
	}

	public static void main(String[] args) {

		Car c = new Car();
		c.brank = "兰博基尼";
		c.price = 100;
		c.color = "green";
		c.run();
		c.music();
	}
}