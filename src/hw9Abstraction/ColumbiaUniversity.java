package hw9Abstraction;

public class ColumbiaUniversity extends MedicalSchool {
	/*
	 * public abstract void chemistry (); It's not possible because class is not an
	 * Abstract Class. So method can not be An Abstract.
	 */

	public void biology() {
		System.out.println("This is from Columbia Universityy");
	}

	public ColumbiaUniversity() {
		// Constructor can be created in regular class
	}

	public void mechanicalLab() {
	}

	@Override
	public void anatomyLab() {

	}

	@Override
	public void hygiene() {

	}
}
//Only one keyword (extends) can be used 
//Regular Class can inherit other Abstract Class or a regular class but not interface by extends key word
//Only one inheritances is possible by a regular Class
