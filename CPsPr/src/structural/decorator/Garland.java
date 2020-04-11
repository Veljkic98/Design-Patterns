/**
 * 
 */
package structural.decorator;

/**
 * @author Veljko
 *
 */
public class Garland extends TreeDecorator {

	/**
	 * Constructor.
	 * 
	 * @param tree
	 */
	public Garland(ChristmasTree tree) {
		super(tree);
	}
	
	public String decorate() {
		return super.decorate() + decorateWithGarland();
	}

	private String decorateWithGarland() {
		return " with garland.";
	}
}
