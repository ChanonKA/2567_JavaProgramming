
public class TestProduct {
	
	public static void main(String[] args) {
        Product product = new Product();
		
		product.setProductDetails("smartphone", 30000.0, 7.0);
		
		System.out.println("Product Detail");
		product.displayProductDetails();
		

	}

}
