package hw9Abstraction;

public interface College {
	public void commonRoom();

	public void labratory();

	public void languageClub();

	public default void dorm() {

	}

	public static void studyRoom() {

	}

}
