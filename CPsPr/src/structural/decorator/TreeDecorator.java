/**
 * 
 */
package structural.decorator;

/**
 * @author Veljko
 *
 */
public abstract class TreeDecorator implements ChristmasTree {
	private ChristmasTree tree;
	
	/**
	 * Constructor.
	 * 
	 * @param tree (required) interface
	 */
	public TreeDecorator(ChristmasTree tree) {
		this.tree = tree;
	}

	/* (non-Javadoc)
	 * @see decorator.ChristmasTree#decorate()
	 */
	@Override
	public String decorate() {
		return tree.decorate();
	}

}
