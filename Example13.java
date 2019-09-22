
public class Example13{
	public static void main(String[] args ) {
		Animal an1 = new Cat();
		Animal an2 = new Dog();
		animalShout(an1);
		animalShout(an2);
		
		
	}
	public static void animalShout(Animal an){
		an.shout();
	}
		
	}