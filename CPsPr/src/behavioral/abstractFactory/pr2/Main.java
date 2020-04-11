package behavioral.abstractFactory.pr2;

public class Main {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFActory(false);
		Shape s1 = shapeFactory.getShape("square");
		s1.draw();
	}

}
