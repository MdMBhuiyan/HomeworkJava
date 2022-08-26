package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;
	
	public Computer () { // Default constructor
		System.out.println("This is from default Constructor of Computer class.");
	}
	public Computer (String brand) { // parameterized constructor
		this.brand = brand;
		System.out.println("The brand name is : " + brand);
		
	}
	public Computer (String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		
		System.out.println("My Brand: " + brand + "," + " Model: " + model +"," + " Operating system : " + operatingSystem +","+ " Price : " + '$'+ price + ","+ " Grade : " + grade + "," + " Made in USA? " + madeInUSA);
	}
	

}
