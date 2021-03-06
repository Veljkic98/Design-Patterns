package behavioral.abstractFactory.pr1;

public class FactoryProvider {
	public static AbstractFactory getFactory(String choice) {
		
		if ("Animal".equalsIgnoreCase(choice)) {
			return new AnimalFactory();
		} else {
			return null;
		}
	}
}
