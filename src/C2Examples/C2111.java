package C2Examples;

import java.io.IOException;

public class C2111 {

}
class Animal04{
	public void eat() {
		
	}
}

class override01 extends Animal04  {
	private void eat() {
		//visibility smaller then super class
	}
}
class override02 extends Animal04 {
	public void eat() throws IOException {
		//exception not defined by super class
	}
}
class override03 extends Animal04 {
	public void eat(String Food) {
		//legal overload since the args changd for the method
	}
}
class override04 extends Animal04 {
	public String eat() {
		//return type changed not an override
	}
}