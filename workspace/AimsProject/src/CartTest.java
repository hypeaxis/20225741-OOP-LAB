
public class CartTest {

	public static void main(String[] args) {
		// create a new cart
		Cart cart = new Cart();
		
		//Create new dvd object and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc( "The Lion Kings", "Animation", "Roger Allers", 87,19.95f);
		cart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc( "Star Wars", "Scient Fiction", "George Lucas", 87,24.95f);
		cart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc( "Aladin", "Animation", 19.95f);
		cart.addDigitalVideoDisc(dvd3);
		
		//Test the print method
		cart.print();
		
	}

}
