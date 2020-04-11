/**
 * 
 */
package structural.proxy;

/**
 * @author Veljko
 *
 */
public class ExpensiveObjectImpl implements ExpensiveObject {

	/**
	 * Constructor.
	 */
	public ExpensiveObjectImpl() {
		heavyInitialConfiguration();
	}
	
	@Override
	public void process() {
		System.out.println("Proccessing complete.");
	}

	private void heavyInitialConfiguration() {
		System.out.println("Loading initial configuration...");
	}
}
