import java.util.*;
public class TestProductInput {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		ProductandVat product = new ProductandVat();
		
		System.out.print("Enter product name: ");
		String pName = scan.nextLine();
		System.out.print("Enter product price: ");
		double pPrice  = scan.nextDouble();
		System.out.print("Enter VAT rate(%): ");
		double pVatrate= scan.nextDouble();
		
		
		product.setProductDetails(pName, pPrice, pVatrate);
		System.out.println();
		product.displayProductDetails();

	}

}
