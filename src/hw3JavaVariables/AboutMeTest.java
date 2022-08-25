package hw3JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe info1 = new AboutMe(); // creating an objected (info1)
		System.out.println("My namer is " + info1.name + ". My born year is " + info1.bornYear + ". My sex is "
				+ info1.sex + ". My overall GPA at The City College is " + info1.GPA + "."
				+ " \nMy desired yearly salary is " + info1.salary + "k" + ". But I am not a citizen : "
				+ info1.US_citizen + ".");

	}

}
