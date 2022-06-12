package hw11Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool{

	// Method is implemented
	// This method is called non abstract method.
	public void maths() {
		System.out.println("Math method is from RockefellerUniversity Regular Class");

	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("AeronauticalInfo method from AreonauticalSchool Interface");
		
	}

	@Override
	public void computerLab() {
		System.out.println("ComputerLab method from EngineeringSchool Abstract Class");
		
	}

}
