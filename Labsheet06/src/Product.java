
public class Product {
	private String name;
	private double priceProduct;
	private double vatProduct;
	
	public  void setProductDetails(String nameProduct, double price,double vatRate) {
		
		name= nameProduct;
		priceProduct = price;
		vatProduct = vatRate;
		
		
	}
	public double calculateTotalPrice() {
		
		double totalPrice = priceProduct+(priceProduct * vatProduct/100);
		
		return totalPrice;
	}
	public void displayProductDetails() {
		
		System.out.println("Product Name: "+name);
		System.out.println("Price (Before VAT): "+priceProduct);
		System.out.println("Price (After VAT): "+calculateTotalPrice());
		
		
	}

}
