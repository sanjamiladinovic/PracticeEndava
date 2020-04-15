package endava;

public class Passenger {

	private int freeBags;
	private int checkedBags;
	private double perBagFee;

	public int getCheckedBags() {
		// TODO Auto-generated method stub
		return checkedBags;
	}

	public void setCheckedBags(int checkedBags) {
		this.checkedBags = checkedBags;
	}

	public Passenger() {
		// konstruktor koji ne zahteva parametar, ovakav jedan pravi java kada
		// inicijalizujemo objekat, mi ga ne vidimo(kada jedan mi napravimo, moramo sve
		// ostale)
	}

	public Passenger(int freeBags) {
		this(freeBags > 1 ? 25.0d : 50.0d);// da bi troskovi bili sakriveni; ako je freeBags veci od jedan da plati 25
											// po prtljagu, u suprotnom 50
		this.freeBags = freeBags;
	}

	public Passenger(int freeBags, int checkedBags) {
		this(freeBags);// da se ne bi ponavljalo, povezacemo sa prethdnim konstruktorom, called
						// constructor mora biti na prvoj liniji
		this.checkedBags = checkedBags;
	}

	private Passenger(double perBagFee) {
		this.perBagFee = perBagFee;
	}

	public static void main(StringVezba args) {

		Passenger jane = new Passenger(2, 3);// free je 2 komada, cekirala 3
		//jane.setCheckedBags(3);
		System.out.println("Jane is cheched: "+ jane.getCheckedBags());

	}

}
