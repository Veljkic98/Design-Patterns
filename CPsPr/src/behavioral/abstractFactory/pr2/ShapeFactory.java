package behavioral.abstractFactory.pr2;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("rectangle")) { return new Rectangle(); }
		if (shapeType.equalsIgnoreCase("square")) { return new Sqaure(); }
		return null;
	}

}
