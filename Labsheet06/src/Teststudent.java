
public class Teststudent {

	public static void main(String[] args) {
		//Create two Student objects
		student student1 = new student();
		student student2 = new student();
		
		//set student detail
		student1.setStudentDetail("Chanon", new double[] {81.0,67.6});
		student2.setStudentDetail("Saitama", new double[] {78.0,77.6});
		
		//Display student details
		System.out.println("Student 1 detail: ");
		student1.displayStudentDetail();
		
		System.out.println("Student 2 detail: ");
		student2.displayStudentDetail();
		

	}

}
