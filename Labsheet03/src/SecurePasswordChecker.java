import java.util.*;
public class SecurePasswordChecker {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter your password(type 'exit' to quit) : ");
			String password = input.nextLine();
			
			if(password.equalsIgnoreCase("exit")) {
				System.out.println("Program terminated.");
				break;
			}
			
			//validate password
			String errors ="";
			//check for minimun length
			if(password.length()<8) {
				errors += "- Password must be at least 8 characters long.\n";
			}
			//check for at least one digit,uppercase,lowercase
			boolean hasUppercase = false;
			boolean hasLowercase = false;
			boolean hasDigit = false;
			
			for(int i =0;i<password.length();i++) {
				char ch = password.charAt(i);
				if (ch>= 'A'&& ch<'Z') {
					hasUppercase= true;
				}
				else if (ch>= 'a'&& ch<'z'){
					hasLowercase=true;
				}
				else if (ch>= '0'&& ch<'9'){
					hasDigit = true;
				}
			}//end of for
			
			//Concatenate errors base on missing criteria
			if(!hasUppercase) {
				errors += "- Password must contain at lease one uppercase letter(A-Z).\n";
			}
			if(!hasLowercase) {
				errors += "- Password must contain at lease one lowercase letter(a-z).\n";
			}
			if(!hasDigit) {
				errors += "- Password must contain at lease one digit(0-9).\n";
			}
			
			//Display error or success message
			if(errors.isEmpty()) {
				System.out.println("Your password is secure");
				break;
			}
			else {
				System.out.println("Password valodation error.");
				System.out.println(errors);
			}
			
		}//end of while
		
		
		
		
		
		input.close();

	}

}
