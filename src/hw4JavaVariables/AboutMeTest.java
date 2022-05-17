package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe(); // Constructor is initialized

		aboutMe.myFullName = "Shahana Fakir"; // Variable is initialized
		aboutMe.myAge = 34;
		aboutMe.myBankAccount = 23456;
		aboutMe.mySalary = 1234;
		aboutMe.myProperty = 56789;
		aboutMe.myHeight = 5.29f;
		aboutMe.myGrade = 3.75;
		aboutMe.mySex = 'F';
		aboutMe.fullTimeEmployee = false;
		aboutMe.aboutMe();// method initialized

		AboutMe alex = new AboutMe(); // Constructor is initialized

		alex.myFullName = "Alex Rodriguez"; // Variable is initialized
		alex.myAge = 35;
		alex.myBankAccount = 12345;
		alex.mySalary = 4567;
		alex.myProperty = 45632;
		alex.myHeight = 5.34f;
		alex.myGrade = 3.50;
		alex.mySex = 'F';
		alex.fullTimeEmployee = true;
		alex.aboutMe();// method initialized

	}

}
