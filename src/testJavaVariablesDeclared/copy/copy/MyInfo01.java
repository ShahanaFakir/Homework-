package testJavaVariablesDeclared.copy.copy;


public class MyInfo01 {

	public int myFirstName; // public is an access modifier; int is a type of variable; myFirstName is the
							// name of variable. And here variable is declared because it has no value.

	public String myFullName; // Here String is a type of variable and it initialized because it has
													// value.
	public byte myAge;
	public short myBankAccount;
	public int mySalary;
	public long myProperty;
	public float myHeight;
	public double myGrade;
	public char mySex;
	public boolean fullTimeEmployee;
	
	public MyInfo01() {
		System.out.println("This is all about me");
		
	}
	
	public void myInfo() {
		System.out.println("\nMy Name Is " + myFullName + "\nMy Age Is " + myAge + "\nMy Height Is " + myHeight);
		
		
	}
	
	}

