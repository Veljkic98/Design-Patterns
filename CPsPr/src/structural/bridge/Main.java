package structural.bridge;

public class Main {

	public static void main(String[] args) {
		Shape square = new Square(new Red());
		System.out.println(square.draw());
	}

}
