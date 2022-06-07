package hw10UseOfSuperInChildClass;

public class Father {

	// These are 5 variables which declared
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	// Default Constructor declared
	public Father() {
		System.out.println("This is a default constructor from Father Class");
	}

	// Parameterized Constructor declared
	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("My father name is: " + name + ". His age is: " + age + ". His sex is " + sex
				+ ". Is he usCitizen? " + usCitizen);
	}

	// Void type method declared
	public void father() {
		System.out.println("This is a void type method from Father Class");
	}

	// Parameterized method declared
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("My father name is: " + name + ". His age is: " + age + ". His sex is " + sex
				+ ". Is he usCitizen? " + usCitizen);
	}

}
