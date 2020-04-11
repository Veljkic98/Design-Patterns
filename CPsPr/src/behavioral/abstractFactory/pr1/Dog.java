package behavioral.abstractFactory.pr1;

public class Dog implements Animal {

	@Override
	public String getAnimal() {
		return "Dog";
	}

	@Override
	public String makeSound() {
		return "Av av";
	}

}
