package hw5Q3Constructor;

public class Student {

	public String stName; // variables declared
	public int stID;
	public char sex;
	public float grade;
	public boolean isProgrammer;

	// declared default Constructor
	public Student() {
		System.out.println("This is from default Construtor of Student class");

	}

	// Parameterized Constructor01 declared
	public Student(String stName, int stID, char sex, float grade, boolean isProgrammer) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.grade = grade;
		this.isProgrammer = isProgrammer;
		System.out.println("\nMy Name is: " + stName + ". \nMy ID is: " + stID + ". \nMy Sex Is: " + sex
				+ ". \nMy Grade Is: " + grade + ". \nAm I Java Programmer? Ans: " + isProgrammer);
	}

}
