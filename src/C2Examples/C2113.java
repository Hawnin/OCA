package C2Examples;

public class C2113 {
	public static void main(String [] args) {
		Adder a = new Adder();
		int b=37;
		int c = 3;
		System.out.println(a.addThem(b, c));
		System.out.println(a.addThem(22.5, 22.00));
	}
}

class Adder  {
	public int addThem(int x, int y) {
		return x+y;
	}
	public double addThem(double x, double y) {
		return x+y;
	}
}
