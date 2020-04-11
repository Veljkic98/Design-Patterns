package behavioral.factory.pr2;

/*
 * Client.
 */
public class MainTest {

	private Creator[] creators;
	
	public MainTest(Creator[] c) {
		super();
		this.creators = c;
	}
	
	public void createAndUseProducts() {
		System.out.println("Created Products:");
		for (Creator creator : creators) {
			Product p = creator.factoryMethod();
			System.out.println(p.who());
		}
	}
	
	public static void main(String[] args) {
		Creator[] creators = new Creator[2];
        
        creators[0] = new ConcreteCreator1();
        creators[1] = new ConcreteCreator2();
        
        MainTest test = new MainTest(creators);
        test.createAndUseProducts();
	}

}
