/**
 * 
 */
package structural.decorator;

/**
 * @author Veljko
 *
 */
public class BubbleLights extends TreeDecorator {
	
	public BubbleLights(ChristmasTree tree) {
		super(tree);
	}
	
	public String decorate() {
		return super.decorate() + decorateWithBuubleLights();
	}
	
	private String decorateWithBuubleLights() {
		return " with bubble lights.";
	}
}
