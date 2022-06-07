package hw10Abstraction;

/*
 * This is an Abstract Class. Two keywords are used for the inheritance in
 * Abstract Class which is "extends" and "implements" in Java. An abstract class can inherit only
 * one abstract class or one regular class by extends key word. An abstract class
 * can't inherit an Interface by extends key word.
 * Implements keyword is used to inherit Interface in Abstract Class
 * an abstract class can inherit more than one Interface
 * An Abstract class can not inherit a regular class or abstract class by implements keyword.
 * In below, MedicalSchool and NursingSchool are Abstract Class and LawSchool is an Interface. 
 * And MedicalSchool inherits NursingSchool with extends keyword and inherits LawSchool with implements key word.
 */

public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	// Method is implemented
	// This method is called non abstract method.
	public void anatomyLab() {
		System.out.println("This method is from MedicalSchool Class");

	}

	// Method is declared.
	// This method is called abstract method
	public abstract void biochemistryLab();

	// We can create a Constructor inside Abstract Class.
	public MedicalSchool() {
		System.out.println("This default constructor is from MedicalSchool Class");

	}

}
