import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		inputStudent();

	}//end of Main() method
	public static void inputStudent () {
		Scanner scanner = new Scanner(System.in);
		String studentID, subjectCode;
		boolean isStudentIDvalid, isSubjectCodevalid;
		while(true) {
			//input student ID
			System.out.print("Enter student ID (10 digits): ");
			studentID = scanner.nextLine();
			
			//input subject code
			System.out.print("Enter student ID (7 digits): ");
			subjectCode = scanner.nextLine();
			
			//check lengths or student ID and subject code
			isStudentIDvalid = isLength(studentID,10);
			isSubjectCodevalid = isLength(subjectCode,7);
			
			if (isStudentIDvalid && isSubjectCodevalid) {
				//check student detail
				boolean isITStudent = isITStudent(studentID);
				boolean isITSubject = isITSubject(subjectCode);
				
				//Display data
				displayData(isITStudent,isITSubject);
				break;
				
				}else {
					System.out.println("");
			}
			
		}
				
	}//end of inputStudnt() method
	public static boolean isLength(String input,int len) {
		
    return input.length()==len;
	}
	public static boolean isITStudent(String stuid) {
		return (stuid.substring(0,6)==("211311"));
		
		
	}
	public static boolean isITSubject(String stusub) {
		return (stusub.substring(0,2)==("21") && stusub.charAt(4)=='1');
	}
	public static void displayData(boolean isStu, boolean isSub) {
		if(isStu) {
			System.out.println("Student id; "+ isStu +"1st year");
		}
	}

}
