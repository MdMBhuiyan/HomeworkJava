package hw5Q3Constructor;

public class Student {
	
	
	public String stName;
	public int stID;
	public char sex;
	public float grade;
	public boolean isprogrammer;
	
	public Student () {
		System.out.println("This is from default Constructor of Student class.");
	}
	
	public Student(String stName, int stID, char sex, float grade, boolean isprogrammer) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		
		this.grade = grade;
		this.isprogrammer = isprogrammer;
		System.out.println("My name is: " + stName + "," + " Student ID: " + stID + "," + "Sex : " + sex +","
				+ " Grade : " + grade + "," + " Is Java Programmer? " + isprogrammer);
	}

	

}
