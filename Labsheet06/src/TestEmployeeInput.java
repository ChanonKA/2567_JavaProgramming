import java.util.*;
public class TestEmployeeInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//input data for first employee
		System.out.println("Enter details for Employee 1: ");
		System.out.print("Name: ");
		String empName1 = scan.nextLine();
		System.out.print("Hours Worked: ");
		int empHourWorked1= scan.nextInt();
		System.out.print("HourlyRate: ");
		double empHourlyRate1 = scan.nextDouble();
		
		emp1.setEmployeeDetails(empName1, empHourWorked1, empHourlyRate1);
		Line('-');
		System.out.println();
		emp1.displayEmployeeDetails();
		Line('+');
		System.out.println();
		
		scan.nextLine();
		
		System.out.println("Enter details for Employee 2: ");
		System.out.print("Name: ");
		String empName2 = scan.nextLine();
		System.out.print("Hours Worked: ");
		int empHourWorked2= scan.nextInt();
		System.out.print("HourlyRate: ");
		double empHourlyRate2 = scan.nextDouble();
		
		
		
		
		emp2.setEmployeeDetails(empName2, empHourWorked2, empHourlyRate2);
		Line('-');
		System.out.println();
		emp2.displayEmployeeDetails();
		Line('+');
		System.out.println();

		
		
		scan.close();
	}
	//Line Method
	public static void Line(char symbol) {
		//System.out.println("-------------------------------");
		for(int i=1;i<50;i++) {
			System.out.print("-");
		}
	}
	
	
	

}
