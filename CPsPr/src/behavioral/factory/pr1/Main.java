package behavioral.factory.pr1;

public class Main {

	private static void printCars(Car[] cars) {
		System.out.println("Created cars:");
		for (Car car : cars) {
			if (car != null) {
				car.printSpeed();
			}
		}
	}
	
	public static void main(String[] args) {
		CarFactory cf = new CarFactory();
		
		Car[] cars = new Car[3];
		cars[0] = cf.getCar("Ferrari");
		cars[1] = new CarFactory().getCar("Porsche");
		cars[2] = cf.getCar("IUdenio");
		
		printCars(cars);
	}

}
