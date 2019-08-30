package C2Examples;

public class C2109 {
	Horse01 a = new Horse01();
	Animal01 b = new Horse01();
	a.eat();
	b.eat();
}
class Animal01 {
	public void eat() {
		System.out.println("Test cases of animal");
	}
}
class Horse01 extends Animal01 {

}
