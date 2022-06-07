package hw10UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("-----------default constructor initialized from Daughter Class---------");
		Daughter daughter01 = new Daughter();

		System.out.println("\n-----------parameterized constructor initialized from Daughter Class---------");
		Daughter daughter02 = new Daughter("November", 30);

		System.out.println("\n-----------void type method initialized from Daughter Class---------");
		daughter02.daughter();

		System.out.println("\n-----------parameterized method initialized from Daughter Class---------");
		daughter02.daughterInfo("March", 31);

		System.out.println("\n-----------default constructor initialized from Father Class---------");
		Father father01 = new Father();

		System.out.println("\n-----------parameterized constructor initialized from Father Class---------");
		Father father02 = new Father("Md Fakir", 68, 'M', false);

		System.out.println("\n-----------void type method initialized from Father Class---------");
		father02.father();

		System.out.println("\n-----------parameterized method initialized from Father Class---------");
		father02.fatherInfo("Ayub Sardar", 48, 'M', true);

	}

}
