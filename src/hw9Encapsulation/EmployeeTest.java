package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmployeeName("Shahana Fakir");
		employee.setEmployeeAge(34);
		employee.setEmployeeSex('F');
		employee.setEmployeeUSCitizen(true);

		System.out.println("Employee Name is: " + employee.getEmployeeName() + ". \nEmployee Age is: "
				+ employee.getEmployeeAge() + ". \nEmployee Sex is: " + employee.getEmployeeSex()
				+ ". \nThe Status of Employee USCitizen is: " + employee.isEmployeeUSCitizen());

	}
}
