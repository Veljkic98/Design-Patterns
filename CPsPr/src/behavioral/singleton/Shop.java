package behavioral.singleton;

public class Shop {

	private static Shop shop_instance = null;
	
	public double price;
	
	private Shop() {
		price = 2000;
	}
	
	public static Shop getInstance() {
		if (shop_instance == null)
			shop_instance = new Shop();
		
		return shop_instance;
	}
}
