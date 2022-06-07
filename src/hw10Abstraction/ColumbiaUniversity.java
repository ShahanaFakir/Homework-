package hw10Abstraction;

/*
 * This is a Regular Class. Two keywords are used for the inheritance in
 * Regular Class which are "extends" and "implements" in Java. A Regular class can inherit only
 * one abstract class or one regular class by extends keyword. A Regular class
 * can't inherit an Interface by extends key word.
 * Implements keyword is used to inherit Interface in regular class.
 * A regular class can inherit more than one Interface. A regular class cannot inherit a regular class or abstract class by implements keyword
 * In below, ColumbiaUniversity is a Regular Class and MedicalSchool is an Abstract Classes. And ColumbiaUniversity inherits MedicalSchool
 * with extends keyword. 
 */

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	// Method is implemented
	// This method is called non abstract method.
	public void chemistry() {
		System.out.println("This method is from ColumbiaUniversity Class");

	}

	/*
	 * Method can't declared in a Regular Class. This method is called abstract
	 * method public abstract void biology(); We can not create an abstract method
	 * in Regular Class. To create an abstract method, we must have an Abstract
	 * Class.
	 */

	/*
	 * MedicalSchool is an Abstract Class and it has method biochemistryLab which is
	 * declared. If we call Abstract Class, then it has an abstract method that will
	 * be converted to an implemented method.
	 */
	@Override
	public void biochemistryLab() {

	}

	/*
	 * MedicalSchool is an Abstract Class and it inherits another Abstract Class
	 * which is NursingSchool. And Nursing School has method caring which is
	 * declared. If we call Abstract Class, then it has an abstract method that will
	 * be converted to an implemented method.
	 */

	@Override
	public void caring() {

	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}

	// We can create a Constructor in Regular Class.
	public ColumbiaUniversity() {

	}

}
