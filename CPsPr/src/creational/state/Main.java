package creational.state;

public class Main {

	public static void main(String[] args) {
		Package p = new Package();
		p.previousState();
		p.printStatus();
		
		p.nextState();
		p.printStatus();
		
		
	}

}
