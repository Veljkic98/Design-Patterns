package behavioral.abstractFactory.pr1;

public interface AbstractFactory<T> {
	T create(String animalType);
}
