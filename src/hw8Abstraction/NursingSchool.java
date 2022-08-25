package hw8Abstraction;

public abstract class NursingSchool {
	
	public abstract void hygiene ();
	public void caring () {
		System.out.println("This is from Nursing School");
	}
	public NursingSchool () { // Constructor can be made in an Abstract Class. 
		System.out.println("This is Default Constructor from Nursingschool Class");
		
	}
	

}
