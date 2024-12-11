import javax.swing.*;
public final class Lab203 {

	public static void main(String[] args) {

		double weight = Integer.parseInt(JOptionPane.showInputDialog("Input Weight:"));
		double height = Integer.parseInt(JOptionPane.showInputDialog("Input Height:"));
		
		double bmi = weight/((height/100))*((height/100));
		
		if(bmi<18.5) {
			
		}
		else if(bmi>=18.5&&bmi<=24.9) {
			
		}
		

	}

}
