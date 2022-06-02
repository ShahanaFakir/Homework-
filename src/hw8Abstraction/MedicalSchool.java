package hw8Abstraction;

public abstract class MedicalSchool {

	// Method is implemented
	// This method is called non abstract method.
	public void anatomyLab() {
		System.out.println("This method is from MedicalSchool Class");

	}

	// Method is declared.
	// This method is called abstract method
	public abstract void biochemistryLab();

	// Yes, we can create a Constructor inside Abstract Class.
	public MedicalSchool() {
		System.out.println("This default constructor is from MedicalSchool Class");

	}

}
