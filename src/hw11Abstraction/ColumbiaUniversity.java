package hw11Abstraction;

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
	public static void chemistry() {
		System.out.println("Chemistry method is from ColumbiaUniversity Regular Class");

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
		System.out.println("BiochemistryLab method from MedicalSchool Abstract Class");

	}

	/*
	 * MedicalSchool is an Abstract Class and it inherits another Abstract Class
	 * which is NursingSchool. And Nursing School has method caring which is
	 * declared. If we call Abstract Class, then it has an abstract method that will
	 * be converted to an implemented method.
	 */

	@Override
	public void caring() {
		System.out.println("Caring method from NursingSchool Abstract Class");

	}

	@Override
	public void lawInfo() {
		System.out.println("LawInfo method from LawSchool Interface");

	}

	@Override
	public void commonRoom() {
		System.out.println("CommonRoom method from College Interface");

	}

	@Override
	public void laboratory() {
		System.out.println("Laboratory method from College Interface");

	}

	@Override
	public void languageClub() {
		System.out.println("LanguageClub method from College Interface");

	}

	@Override
	public void emergencyRoom() {
		System.out.println("EmergencyRoom method from Hospital Interface");

	}

	@Override
	public void surgeryRoom() {
		System.out.println("SurgeryRoom method from Hospital Interface");

	}

	@Override
	public void cafeteria() {
		System.out.println("Cafeteria method from Hospital Interface");

	}

	@Override
	public void vocationalInfo() {
		System.out.println("VocationalInfo method from VocationalSchool Interface");

	}

	@Override
	public void classSize() {
		System.out.println("ClassSize method from University Interface");

	}

	@Override
	public void playGround() {
		System.out.println("PlayGround method from University Interface");

	}

	@Override
	public void teacher() {
		System.out.println("Teacher method from University Interface");

	}

	// We can create a Constructor in Regular Class.
	public ColumbiaUniversity() {
		System.out.println("ColumbiaUniversity Constructor is from ColumbiaUniversity Regular Class");

	}

	/*
	 * public default void columbiaUniversity01() { } Default method is not allowed
	 * in Regular Class.
	 */

}
