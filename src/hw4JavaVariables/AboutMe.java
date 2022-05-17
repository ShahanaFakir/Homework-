package hw4JavaVariables;

public class AboutMe {

	public String myFullName; // Variable is declared
	public byte myAge;
	public short myBankAccount;
	public int mySalary;
	public long myProperty;
	public float myHeight;
	public double myGrade;
	public char mySex;
	public boolean fullTimeEmployee;

	public AboutMe() { // Constructor is declared
		System.out.println("\nThis is all about us ---\n");
	}

	public void aboutMe() { // method implemented
		System.out.println("My Name Is: " + myFullName + "\nMy Age Is: " + myAge + "\nMy Account Number Is: "
				+ myBankAccount + "\nMy Salary Is: " + mySalary + "\nMy Property Is: " + myProperty + "\nMy Height Is: "
				+ myHeight + "\nMy Grade Is: " + myGrade + "\nMy Gender Is: " + mySex
				+ "\nThe Status Of My Employee Is: " + fullTimeEmployee);
	}

}
