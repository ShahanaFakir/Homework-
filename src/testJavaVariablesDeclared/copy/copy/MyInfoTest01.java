package testJavaVariablesDeclared.copy.copy;

public class MyInfoTest01 {

	public static void main(String[] args) {
		MyInfo01 aboutMe = new MyInfo01();
		aboutMe.myFullName = "Shahana Fakir";
		aboutMe.myAge = 34;
		aboutMe.myBankAccount = 23456;
		aboutMe.mySalary = 1234;
		aboutMe.myProperty = 56789;
		aboutMe.myHeight = 5.29f;
		aboutMe.myGrade = 3.75;
		aboutMe.mySex = 'F';
		aboutMe.fullTimeEmployee = false;
		aboutMe.myInfo();
	}

}
