package hw9Abstraction;

public class ColumbiaUniversity extends MedicalSchool{
	/* public abstract void chemistry ();   It's not possible because class is not an Abstract Class. 
	 * So method can not be An Abstract. */
	
	public void biology () {
		System.out.println("This is from Columbia Universityy");
		
	}
	
	public ColumbiaUniversity () {
		// Constructor can be created in regular class
	}

	@Override
	public void mechanicalLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}
}
//Only one keyword (extends) can be used 
//Regular Class can inherit other Abstract Class or a regular class but not interface by extends key word
//Only one inheritances is possible by a regular Class
//