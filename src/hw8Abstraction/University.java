package hw8Abstraction;
public interface University {
	// Interface does not allow implemented method but only declared. 
	public void classSize(); 
	/* A constructor is not allowed in interface because interfaces are static final
	 by default.*/
	public void playGround();
	public void teacher();
	}
