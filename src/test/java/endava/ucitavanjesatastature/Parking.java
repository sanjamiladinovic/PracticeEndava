package endava.ucitavanjesatastature;

import java.util.Scanner;

public class Parking {

	private ParkingMesto[] mesta;

	public void inicijalizujMesta() throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesi broj za inicijalizaciju kapaciteta. ");
		int kapacitet = sc.nextInt();
		try {
			if (kapacitet <= 0) {
				mesta = new ParkingMesto[20];
				throw new Exception("Greska, broj za inicijalizaciju mora biti veci od 0.");

			} else {

				mesta = new ParkingMesto[kapacitet];

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		for (int i = 0; i < mesta.length; i++) {
			mesta[i] = new ParkingMesto();
			mesta[i].setSlobodno(true);
		}

	}

	public void parking() throws Exception {
		Scanner sc = new Scanner(System.in);
		if (mesta == null)
			throw new Exception("Niz nije inicijalizovan");

		for (int i = 0; i < mesta.length; i++) {
			try {
				System.out.println("Unesite podatke za " + i + ". parking mesto.");
				String podatak = sc.nextLine();

				if (podatak.equalsIgnoreCase("slobodno")) {
					mesta[i].setSlobodno(true);
					mesta[i].setRegistarskiBroj(null);
				} else {
					mesta[i].setSlobodno(false);
					mesta[i].setRegistarskiBroj(podatak);
				}
			} catch (Exception e) {
				System.out.println("Greska pri unosu" + i + ". parking mesta." + e.getMessage());
			}

		}

	}

	public void ispisiParkingMesta() throws Exception {
		if (mesta == null)
			throw new Exception("Niz nije inicijalizovan");
		else
			for (int i = 0; i < mesta.length; i++)
				System.out.println("Parking mest: " + i + mesta[i]);
	}

}
