/**
 * 
 */
package structural.proxy;

/**
 * @author Veljko
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExpensiveObjectProxy proxy = new ExpensiveObjectProxy();
		proxy.process();
		proxy.process();
	}

}
