package hw8Abstraction;
public abstract class MedicalSchool {
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
