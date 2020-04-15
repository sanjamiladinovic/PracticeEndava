package endava;

public class FlightPassenger {

	int seats = 150, passengers;
	int tolalCheckedBags;
	int maxCarryOns = seats * 2, totalCarryOns;

	public void add1Passenger() {

		if (hasSeating()) {

			passengers += 1;

		} else
			System.out.println("handleTooMany");

	}

	private boolean hasSeating() {
		return passengers < seats;
	}

	private boolean hasSeating(int count) {// za sprovodjenje array-a, proverava slobodna mesta
		return passengers + count <= seats;
	}

	private boolean hasCarryOnSpace(int carryOns) {
		return totalCarryOns + carryOns <= maxCarryOns;
	}

	public void add1Passenger(int bags) {
		if (hasSeating()) {
			add1Passenger();// dodaje putnike ako ima slobodnog mesta
			tolalCheckedBags += bags;// odmah dodaje i prtljag
		}

	}

//	public int getCheckedBags() {
//		return tolalCheckedBags;
//	}

	public void add1Passenger(Passenger p) {
		add1Passenger(p.getCheckedBags());// uzima vrednost ukupnog broja torbi, povezuje sa metodom gde je parametar
											// int bags
											// dodata funkcionalnost
	}

	public void add1Passenger(int bags, int carryOns) {

		if (hasSeating() && hasCarryOnSpace(carryOns)) {// nova funkcionalnost proverava da li imamo mesta i da li imamo
														// mesta za prtljag
			{
				add1Passenger(bags);
				totalCarryOns += carryOns;
			}
		}
	}

	public void add1Passenger(Passenger p, int carryOns) {
		add1Passenger(p.getCheckedBags(), carryOns);
	}

	public void addPassengers(Passenger... list) {
		if (hasSeating(list.length)) {// ako ima slobodnih mesta
			passengers += list.length;// dodaj putnika
			for (Passenger passenger : list) {// za svakog putnika
				tolalCheckedBags += passenger.getCheckedBags();// cekiraj prtljag
			}

		} else {
			System.out.println("handTooMany");
		}
	}

	public static void main(StringVezba[] args) {
		// TODO Auto-generated method stub

		FlightPassenger f = new FlightPassenger();
		Passenger p1 = new Passenger(0, 1);// ima dozvoljeno 0 freeBags, checked 1
		Passenger p2 = new Passenger(0, 2);// ima dozvoljeno 0 freeBags, checked 2
		f.add1Passenger();
		f.add1Passenger(2);// kada unesemo int koristice intiger overload (int bags)
		f.add1Passenger(p1);// pozvace overload koji prihvata Passengera

		short threeBags = 3;
		f.add1Passenger(threeBags, 2);// posto overload nije napravljen za short type, program ce ga konvertovati u
										// int i pronaci koji je overload u pitanju
		f.add1Passenger(p2, 1);
		System.out.println("Passenger p2 is checked: " + p2.getCheckedBags());
		System.out.println("Passenger p1 is checked: " + p1.getCheckedBags());

//		int[] numericals = { 100, 200, 300, 400, 500 };
//		for (int u : numericals) {
//			System.out.print(u);
//			System.out.print(",");
//		}
		Passenger janet = new Passenger(0, 1);
		Passenger john = new Passenger(0, 2);
		f.addPassengers(janet, john);
		Passenger fred = new Passenger(0, 2);
		Passenger sarah = new Passenger(0, 2);
		Passenger susie = new Passenger(0, 0);
		f.addPassengers(fred, sarah, susie);
	}
}
