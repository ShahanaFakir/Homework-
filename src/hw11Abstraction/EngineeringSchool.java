package hw11Abstraction;

public abstract class EngineeringSchool extends NYUniversity {

	// Method is implemented
	// This method is called non abstract method.
	public void mechanicalLab() {
		System.out.println("MechanicalLab method is from EngineeringSchool Abstract Class");

	}

	// Method is declared.
	// This method is called abstract method
	public abstract void computerLab();

}
