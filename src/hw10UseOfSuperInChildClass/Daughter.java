package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;
	public Daughter(String birthMonth, int age) {
		this.birthMonth= birthMonth;
		this.age=age;
	System.out.println("This is Parameterized constructor from Daughter Class");
	}
	public Daughter () {
		super();
		super.
		super.fatherInfo(birthMonth, age, sex, usCitizen);
		System.out.println("This is default constructor from Daughter Class");
	}
	
	public void daughter () {
		System.out.println("This is from a regular method daughter");
	}
	
	public void daughterInfo (String birthMonth, int age) {
		System.out.println("This is Parameterized method from Daughter Class");
	}
	

}
