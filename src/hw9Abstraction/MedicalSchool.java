package hw9Abstraction;

public abstract class MedicalSchool extends NursingSchool {
	public abstract void anatomyLab ();
	public void biochemistryLab() {
		System.out.println("This is from MedicalSchool Class and non-abstruct class");
	}
	public MedicalSchool () { // Constructor can be made in an Abstract Class. 
		System.out.println("This is Default Constructor from MedicalSchool Class");
	} /* A Constructor can be created inside MedicalSchool Abstract Class because
	abstract class can have variables of all access modifiers.
	*/

}
//One keyword (extends) is used 
//Abstract class can inherit other abstract class and a regular class, not interface by extends keyword.
//Only one at a time.
//
//
//
