package behavioral.abstractFactory.pr2;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("roundedrectangle")) { return new RoundedRecktangle(); }
		if (shapeType.equalsIgnoreCase("roundedsquare")) { return new RoundedSquare(); }
		return null;
	}

}
