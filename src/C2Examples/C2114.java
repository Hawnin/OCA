package C2Examples;

public class C2114 {
	public static void main(String[] args) {
		UseAnimalC2114 ua = new UseAnimalC2114();
		AnimalC2114 an=new AnimalC2114();
		HorseC2114 ha=new HorseC2114();
		AnimalC2114 aH = new HorseC2114();
		ua.doStuff(an);
		ua.doStuff(ha);
		ua.doStuff(aH);
	}
}
class AnimalC2114{
	
}
class HorseC2114 extends AnimalC2114{
	
}
class UseAnimalC2114 {
	public void doStuff(AnimalC2114 a) {
		System.out.println("AnimalC2114 Version");
	}
	public void doStuff(HorseC2114 a) {
		System.out.println("HorseC2114 Version");
	}
}