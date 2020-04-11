package behavioral.builder;

public class Main {

	public static void main(String[] args) {
		Computer com = new Computer.ComputerBuilder("1000", "16").setBluetoothEnabled(true).build();
		System.out.println(com);
		
	}

}
