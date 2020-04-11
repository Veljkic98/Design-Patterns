package behavioral.abstractFactory.pr1;

public class Main {

	public static void main(String[] args) {
		AbstractFactory abstractFactory = FactoryProvider.getFactory("Animal");
		
		Animal an = (Animal) abstractFactory.create("dog");
		System.out.println(an.makeSound());
	}

}
