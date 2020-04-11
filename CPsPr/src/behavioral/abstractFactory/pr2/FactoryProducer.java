package behavioral.abstractFactory.pr2;

public class FactoryProducer {
	public static AbstractFactory getFActory(boolean isRounded) {
		if (isRounded) { return new RoundedShapeFactory(); }
		else { return new ShapeFactory(); }
	}
}
