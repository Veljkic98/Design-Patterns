/**
 * 
 */
package structural.proxy;

/**
 * @author Veljko
 *
 */
public class ExpensiveObjectProxy implements ExpensiveObject {
	private static ExpensiveObject object;
	
	/* (non-Javadoc)
	 * @see proxy.ExpensiveObject#process()
	 */
	@Override
	public void process() {
		if (object == null) {
			object = new ExpensiveObjectImpl();
		}
		object.process();
	}
}
