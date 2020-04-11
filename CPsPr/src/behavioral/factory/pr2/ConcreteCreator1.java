package behavioral.factory.pr2;

public class ConcreteCreator1 implements Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProduct1();
	}

}
