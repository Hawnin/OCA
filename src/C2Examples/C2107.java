package C2Examples;

public class C2107 {
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Horse();
		a.eat();
		b.eat();	
	}
}

class Animal{
	public void eat() {
		System.out.println("This is how animal eats");
	}
}
class Horse extends Animal{
	@Override
	public void eat() {
		System.out.println("this is how HORSE eats");
	}
}
class BadHorse extends Animal{
	@Override
	private void eat() {
		System.out.println("Cannot change visibility to smaller for inherited method");
	}
}