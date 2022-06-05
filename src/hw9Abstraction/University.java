package hw9Abstraction;

/*
 * This is an Interface Class.
 * One keyword is used for the inheritance in Interface which is "extends".
 * Interface can inherit an other Interface but It cannot inherit a Regular
 * Class or an Abstract Class. Interface can inherit more than one Interface. In
 * above, University, College, Hospital are Interface Classes. And University
 * inherits College and Hospital with extends keyword.
 */

public interface University extends College, Hospital {

	public void classSize();

	public void playGround();

	public void teacher();

	/*
	 * This default is not access modifier. From Java 1.8, JAVA implemented default
	 * type method in interface which is implemented
	 */

	public default void gymnasium() {
		System.out.println(" Gymnasium is from University Interface ");

	}

	// static type method in interface which is implemented
	public static void library() {
		System.out.println(" Library is from University Interface ");
	}

	/*
	 * public University() {} In Java, we can not create a Constructor inside
	 * Interface. All data members in interfaces are public static final by default,
	 * They are constant. They are abstract by nature. In Interface, methods don't
	 * have a body. So, there is no need for calling the methods in an Interface.
	 * Since we cannot call the methods, there is no need to create an object for an
	 * Interface and there is no need of having a constructor in it.
	 */

}
