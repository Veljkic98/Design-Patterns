/**
 * 
 */
package structural.decorator;

/**
 * @author Veljko
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
		System.out.println(tree1.decorate());
		
		ChristmasTree tree2 = new ChristmasTreeImpl();
		System.out.println(tree2.decorate());
	}

}
