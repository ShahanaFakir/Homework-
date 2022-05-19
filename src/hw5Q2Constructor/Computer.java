package hw5Q2Constructor;

public class Computer {

	public String brandName; // variables declared
	public String myCompModel;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public Computer() { // Declare default constructor
		System.out.println("This is from default Constructor of Computer class");

	}

	// Parameterized Constructor 01 declared
	public Computer(String brandName) {
		this.brandName = brandName;
		System.out.println("This Computer Name Is: " + brandName);

	}

	// Parameterized Constructor 02 declared
	public Computer(String brandName, String myCompModel) {
		this.brandName = brandName;
		this.myCompModel = myCompModel;
		System.out.println("This Computer Name Is: " + brandName + ". The model of this Computer is: " + myCompModel);
	}

	// Parameterized Constructor 03 declared
	public Computer(String brandName, String myCompModel, String operatingSystem) {
		this.brandName = brandName;
		this.myCompModel = myCompModel;
		this.operatingSystem = operatingSystem;
		System.out.println("This Computer Name is: " + brandName + ". The model of this Computer is: " + myCompModel
				+ ". The Name of Operating System is " + operatingSystem);

	}

	// Parameterized Constructor 04 declared
	public Computer(String brandName, String myCompModel, String operatingSystem, int price) {
		this.brandName = brandName;
		this.myCompModel = myCompModel;
		this.operatingSystem = operatingSystem;
		this.price = price;
		System.out.println("This Computer Name is: " + brandName + ". The model of this Computer is: " + myCompModel
				+ ". The Name of Operating System is " + operatingSystem);

	}

	// Parameterized Constructor 05 declared
	public Computer(String brandName, String myCompModel, String operatingSystem, int price, char grade,
			boolean madeInUSA) {
		this.brandName = brandName;
		this.myCompModel = myCompModel;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;

		System.out.println("\nThis Computer Name is: " + brandName + ". The model of this Computer is: " + myCompModel
				+ ". The Name of Operating System is " + operatingSystem + ". The Grade of this Computer is: " + grade
				+ ". Made in USA: " + madeInUSA);
	}

}
