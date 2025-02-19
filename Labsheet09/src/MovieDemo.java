import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input movie id    : ");
		String id = input.nextLine();
		System.out.print("Input movie name  : ");
		String name = input.nextLine();
		System.out.println();
		System.out.print("Input Director name    : ");
		String dname = input.nextLine();
		System.out.print("Input Director email   : ");
		String demail = input.nextLine();
		System.out.print("Input Director gender  : ");
		char gender=Character.toLowerCase(input.nextLine().charAt(0));
		
		while(!(gender=='m')||(gender=='f')) {
			System.out.print("Input Director gender, again : ");
			gender=Character.toLowerCase(input.nextLine().charAt(0));
			
		}
		System.out.println();
		Director director = new Director(dname,demail,gender) ;
		System.out.print("Input movie theater no. : ");
		int movieT=input.nextInt();
		while (!(movieT>=1)&&(movieT<=15)) {
			System.out.print("Please input 1 - 15 only : ");
			 movieT=input.nextInt();
		}
		System.out.println();
		
		Theater theater = new Theater (id,name,director,movieT);
		System.out.println(theater.toString());
		
		input.close();
		
				
			
		
		
		

	}

}