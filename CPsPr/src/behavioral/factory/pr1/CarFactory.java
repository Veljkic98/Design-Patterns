package behavioral.factory.pr1;

/*
 * Creator class
 */
public class CarFactory {
	
	/*
	 * Factory method
	 */
	public Car getCar(String carName) {
		if (carName == null) {
			return null;
		}

		if (carName.equalsIgnoreCase("ferrari")) {
			return new Ferrari();
		}else if (carName.equalsIgnoreCase("porsche")) {
			return new Porsche();
		}else {
			return null;
		}
	}
}
