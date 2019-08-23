package C1Selfassesment;

interface Gadget{
	void doStuff();
}

abstract class Electronic {
	void getPower() { System.out.println("Plug in ");}
}
public class Number10 extends Electronic implements Gadget{
	void doStuff() { System.out.println("show book "); }
	public static void main(String[] args) {
		new Number10().getPower();
		new Number10().doStuff();
	}
}
