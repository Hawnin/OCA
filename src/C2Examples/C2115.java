package C2Examples;

public class C2115 {
	public static void main(String [] args) {
		AnimalC2115 a=new AnimalC2115();
		HorseC2115 h=new HorseC2115();
		AnimalC2115 ah=new HorseC2115();
		HorseC2115 he=new HorseC2115();
		AnimalC2115 a2=new AnimalC2115();
		AnimalC2115 ah2=new HorseC2115();
		a.eat();
		h.eat();
		ah.eat();
		he.eat("apples");
		a2.eat("Treats");
		ah2.eat("Carrots");
	}
}

class AnimalC2115 {
	public void eat() {
		System.out.println("Animal eatin");
	}
}

class HorseC2115 extends AnimalC2115 {
	public void eat() {
		System.out.println("Horse eatin");
	}

	public void eat(String s) {
		System.out.println("Overloaded Horse eatin" + s);
	}
}