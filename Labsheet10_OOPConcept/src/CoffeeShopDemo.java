import javax.swing.*;
public class CoffeeShopDemo {

	public static void main(String[] args) {
		
		Barista staff1 = new Barista("Leon",'M');
		Barista staff2 = new Barista("Claire",'F');
		
		int typeDrink = Integer.parseInt(JOptionPane.showInputDialog(null,"Drink type"));
		int typeCoffee = Integer.parseInt(JOptionPane.showInputDialog(null,"Coffe Type"));
		char sizeCoffee = JOptionPane.showInputDialog(null,"Coffee Size").toUpperCase().charAt(0);
		int numBaris = Integer.parseInt(JOptionPane.showInputDialog(null,"Barista number"));
		
		Barista staff = switch (numBaris) { case 1 -> staff1;
		                                    case 2 -> staff2;
		                                    default -> staff1;
		};
		
		Coffee coffee = new Coffee(typeDrink,typeCoffee);
		JOptionPane.showMessageDialog(null, coffee+"\nBarista"+staff);
		
		
	}
	

}