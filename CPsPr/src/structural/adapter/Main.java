package structural.adapter;

public class Main {

	public static void main(String[] args) {
		Movable lambo = new Lamborghini();
		System.out.println(lambo.getSpeed());
		
		MovableAdapter lamboAdapter = new MovableAdapterImpl(lambo);
		System.out.println(lamboAdapter.getSpeed());
	}

}
