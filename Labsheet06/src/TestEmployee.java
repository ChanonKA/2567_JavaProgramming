
public class TestEmployee {

	public static void main(String[] args) {
		//create two Employee object
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//set employee details
		emp1.setEmployeeDetails("Natcha", 45, 20.0);
		emp2.setEmployeeDetails("Attakorn", 38, 25.0);
		
		//Display employee detail
		System.out.println("Employee 1 detail");
		emp1.displayEmployeeDetails();
		
		System.out.println("\nEmployee 2 detail");
		emp2.displayEmployeeDetails();

	}

}
