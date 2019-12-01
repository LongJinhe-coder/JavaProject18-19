
public class Demo1 {
	public double GiveMax(double a, double b) {
		if (a >= b) {
			return a;
		} else
			return b;
	}

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		double c = d.GiveMax(2.0, 3.0);
		// System.out.println(c);
		d.Abc();
	}

	public void Abc() {
		for (int i = 0; i <= 5; i++) {
			if (i <= 3) {
				for (int b = 1; b <= 3 - i; b++) {
					System.out.print(" ");
				}
				for (int c = 1; c <= (2 * i - 1); c++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int d = 1; d <= i - 3; d++) {
					System.out.print(" ");
				}
				for (int e = 1; e <= 11 - 2 * i; e++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}

