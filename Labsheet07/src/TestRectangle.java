
public class TestRectangle {

	public static void main(String[] args) {
		
		//Test constructors an toString()
		Rectangle r1 = new Rectangle();
		System.out.println(r1.showData());
		Spacing();
		System.out.println("Display data using toString() method");
		System.out.println(r1); //SySystem.out.println(r1.toString());
		Spacing();
		Rectangle r2 = new Rectangle(1.2f,3.4f);
		System.out.println(r2);
        Spacing();
		//Test method getter and setter method
		r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);
        System.out.println("length is "+ r1.getLength());
        System.out.println("width  is "+ r1.getWidth());
        
        //Test getArea and getPerimeter()
        Spacing();
        System.out.printf("area is %.2f%n",r1.getArea());
        System.out.printf("perimeter is %.2f",r1.getPerimeter());
        Spacing();
        System.out.printf("area is %.2f%n",r2.getArea());
        System.out.printf("perimeter is %.2f",r2.getPerimeter());
        
        

	}
	public static void Spacing() {
		System.out.println();
	}

}
