package hw10UseOfSuperInChildClass;



public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String FamilyName;
	
	public Father () {
		System.out.println("This is a default constructor from Father Class.");
	}
	public Father (String name,int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		
		System.out.println("This is parameterized constructor from Father Class.");
	}
	
	public void father () {
		System.out.println("This is a regular void type method name father");
	}
	
	public void fatherInfo (String name,int age, char sex, boolean usCitizen) {
		System.out.println("This is a parameterized method from Father Class.");
	}
	
	
	
	
	

}
