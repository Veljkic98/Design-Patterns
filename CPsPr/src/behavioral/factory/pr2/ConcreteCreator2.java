package behavioral.factory.pr2;

public class ConcreteCreator2 implements Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProduct2();
	}

}
