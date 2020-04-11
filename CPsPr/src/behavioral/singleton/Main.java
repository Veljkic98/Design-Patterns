package behavioral.singleton;

public class Main {

	public static void main(String[] args) {
		Shop r1 = Shop.getInstance();
		System.out.println("Price r1: " + r1.price);
		
		Shop r2 = Shop.getInstance();
		System.out.println("Price r2: " + r2.price);
		
		r1.price = 3000;
		
		System.out.println("Price r1: " + r1.price);
		System.out.println("Price r2: " + r2.price);
	}

}
