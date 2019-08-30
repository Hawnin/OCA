package C2Examples;

public class C2110 {
	public void eat() {
	};

	public static void main(String[] args) {
		Animal03 a = new Animal03();
		Animal03 b = new Dog();
		Dog c = new Dog();
		a.eat();
		b.eat();
		c.eat();
	}
}

class Animal03 {
	public void eat() throws Exception {

	}
}

class Dog extends Animal03 {
	@Override
	public void eat() {
		System.out.println("Compile error due to missing exception");
	}
}