package behavioral.abstractFactory.pr1;

public class Duck implements Animal {

	@Override
	public String getAnimal() {
		return "Duck";
	}

	@Override
	public String makeSound() {
		return "Kua Kua";
	}

}
