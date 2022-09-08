package hw9Abstraction;

public interface Hospital {
	public void emmergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public default void morgue() {

	}

	public static void pharmacy() {

	}

}
