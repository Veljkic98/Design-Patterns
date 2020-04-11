package structural.adapter;

public class MovableAdapterImpl implements MovableAdapter {
	
	private Movable superCar;
	
	public MovableAdapterImpl(Movable superCar) {
		super();
		this.superCar = superCar;
	}

	@Override
	public double getSpeed() {
		return superCar.getSpeed() * 1.6;
	}

}
