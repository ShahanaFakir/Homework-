package hw11Abstraction;

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public default void morgue() {
		System.out.println("Morgue is from Hospital Interface ");
	}

	public static void pharmacy() {
		System.out.println(" Pharmacy is from Hospital Interface ");
	}

}
