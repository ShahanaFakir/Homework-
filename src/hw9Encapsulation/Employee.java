package hw9Encapsulation;

public class Employee {

	private String employeeName;
	private int employeeAge;
	private char employeeSex;
	private boolean employeeUSCitizen;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public char getEmployeeSex() {
		return employeeSex;
	}

	public void setEmployeeSex(char employeeSex) {
		this.employeeSex = employeeSex;
	}

	public boolean isEmployeeUSCitizen() {
		return employeeUSCitizen;
	}

	public void setEmployeeUSCitizen(boolean employeeUSCitizen) {
		this.employeeUSCitizen = employeeUSCitizen;
	}

}
