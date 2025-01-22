
public class DemoCar {

	public static void main(String[] args) {
		Car car1 = new Car("Chevrolet", "Cruze", 2009,150000.0);
		System.out.println(car1);
		System.out.println("Mileage:"+car1.getmileAge());
		Spacing();
		System.out.println("Update Car Detail: ");
		Car car2 = new Car("Toyota", "Corolla",2015,0.0);
		System.out.println(car2);
		//Error
		car2.setYear(0);
		car2.setModelName(null);
		

	}
	
	public static void Spacing() {
		System.out.println();
	}


}
