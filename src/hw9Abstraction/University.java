package hw9Abstraction;

public interface University  extends College, Hospital {
	// Interface does not allow implemented method but only declared. 
	public void classSize(); 
	/* A constructor is not allowed in interface because interfaces are static final
	 * by default.*/
	public void playGround();
	public void teacher();
	
	public default void gymnasium () {
		
	}
	public static void library() {
		
	}
}
// Only one (extends) keyword is used between two interface classes. 
// implements keyword is used to inherit an interface in a regular class
//interface can inherit other interfaces but not regular class or abstract class
//multiple interface inheritance is possible
