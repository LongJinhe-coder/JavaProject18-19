public class Car {

	String brank;
	double price;
	String color;

	public void run() {
		System.out.println("����run");
	}

	public void music() {
		System.out.println("�����Է�Music");
	}

	public static void main(String[] args) {

		Car c = new Car();
		c.brank = "��������";
		c.price = 100;
		c.color = "green";
		c.run();
		c.music();
	}
}