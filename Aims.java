package lab2;

public class Aims {

	public static void main(String[] args) {
		Cart order1 = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers", 87, 24.95f);
		order1.addDVD(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 87, 19.95f);
		order1.addDVD(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		
		System.out.print("Total Cost is: ");
		System.out.println(order1.totalCost());

	}

}
