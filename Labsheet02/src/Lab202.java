import java.util.*;
public class Lab202 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input number : ");
		int number= input.nextInt();
		
		while(true) {
			System.out.print("Input number : ");
			int num= input.nextInt();
			
			if(num<number) {
				break;
			}
			number=num;
		}
		System.out.print("BYE BYE");

   }
}
