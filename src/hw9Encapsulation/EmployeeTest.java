package hw9Encapsulation;



public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee ();
		employee.setName("Md Bhuiyan");
		employee.setAge(25);
		employee.setSex('M');
		employee.setUsCitizen(false);
		
		String name = employee.getName();
		int age = employee.getAge();
		char sex= employee.getSex() ;
		boolean usCitizen=employee.isUsCitizen();
		
		System.out.println("The employee information is given below:\n\tEmployee name                   :  " + name + "\n\tEmployee age  			:  " +
		age +"\n\tEmployee sex\t\t        :  " + sex + "\n\tEmployee US Citizenship Status  :  " + usCitizen);
		//new comment
	}
}
