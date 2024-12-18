import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fullname; //the input line entered by the user.
		String firstname;//the first name, extracted from the input.
		
		System.out.println("Please enter your name, seperated by a space.");
		System.out.print(":");
		fullname = input.nextLine();
		
		int space = fullname.indexOf(' '); //find space
		firstname = fullname.substring(0,space);
		
		//System.out.println(firstname);
		
		//to get the middle name
		System.out.println(abbreviatName(fullname)+firstname);
		
        input.close();
	}//end main() Method
	
	public static String abbreviatName (String fName) {
		String initialLetter = "";
		
		for(int i=0;i<fName.length();i++) {
			if(fName.charAt(i)==' ') {
				initialLetter = (initialLetter+fName.charAt(i+1)).toUpperCase();
				initialLetter = initialLetter+".";
			}
		}//end of for
		return initialLetter;
	}

}
