import javax.swing.*;
public class Lab401 {

	//main Method
	public static void main(String[] args) {
		inputEmail();
		
		

	}//end of main Method
	
	public static void inputEmail() {
		String ans;
		String varEmail;
		do {
			varEmail= JOptionPane.showInputDialog("Input your e-mail: ");
			if(varEmail!=null && !varEmail.isEmpty()) {
				checkEmailError(varEmail);
			}
			else {
				JOptionPane.showMessageDialog(null, "Email cannot be empty!!!");
			}
			ans = JOptionPane.showInputDialog("Do you want to input email address[Y/y]: ");
			
			
		}while(ans!=null && ans.equalsIgnoreCase("ydadasdtdy"));
		}//end of inputEmail() Method
	
	//checkEmailError() Method
	public static void checkEmailError(String email) {
		while(email.startsWith("@")||email.contains(" ")) {
			email = JOptionPane.showInputDialog("Invalid e-mail. Input your e-mail again:");
			
		}
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null,
				checkEmail(email)
			    ?"Your e-mail is "+email
			    :"Your e-mail is not a hotmail or gmail adress.");
		
	}//end of checkEmailError() Method
	
	public static boolean checkEmail(String email) {
		if(email.endsWith("@gmail.com")||email.endsWith("@hotmail.com")) {
			return true;
		}
		else {
			return false;
		}
			
	}//end of checkEmail() Method

}
