package hw10UseOfSuperInChildClass;

//Here Father is a Parent Class and Daughter is a child Class
public class Daughter extends Father {

	// These are 2 variables which declared
	public String birthMonth;
	public int age;

	// Default Constructor declared
	public Daughter() {
		//super method is used to call the constructor of super (parent) class
		super("Mohammad Fakir", 56, 'M', true);

		// super keyword is used to initialize the methods of super (Parent) class
		super.father();
		super.fatherInfo("Md Ayub", 50, 'M', false);

		// super keyword is used to initialize the variables from super (Parent) class.
		super.familyName = "Fakir";
		System.out.println("The family name is: " + familyName);
		System.out.println("This is a default Constructor from Daughter Class");

	}

	// Parameterized Constructor declared
	public Daughter(String birthMonth, int age) {
		super("Moh Ali", 45, 'M', true);
		super.father();
		super.fatherInfo("Ali Ahmed", 40, 'M', false);
		super.familyName = "Chowdhury";
		System.out.println("The name of the family is: " + familyName);
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("My daughter born on: " + birthMonth + ". Her age is: " + age);
	}

	// void type method declared
	public void daughter() {
		// we can't call constructor of super class inside a method of child class.
		super.father();
		super.fatherInfo("Md Sadek", 65, 'M', false);
		super.familyName = "Sardar";
		System.out.println("Family name is: " + familyName);
		System.out.println("This is a void type method from Daughter Class");
	}

	// parameterized method declared
	public void daughterInfo(String birthMonth, int age) {
		// we can't call constructor of super class inside a method of child class.
		super.father();
		super.fatherInfo("Mohd Sardar ", 55, 'M', true);
		super.familyName = "Akond";
		System.out.println("The name of the family is: " + familyName);
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("My daughter born on: " + birthMonth + ". Her age is: " + age);
	}

}
