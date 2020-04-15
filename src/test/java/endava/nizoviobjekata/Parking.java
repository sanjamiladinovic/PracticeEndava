package endava.nizoviobjekata;

public class Parking {

	private ParkingMesto[] mesta;

	Parking(int brojParkingMesta) {
		if (brojParkingMesta > 0)

			mesta = new ParkingMesto[brojParkingMesta];
		else
			mesta = new ParkingMesto[40];

		for (int i = 0; i < mesta.length; i++) {
			mesta[i] = new ParkingMesto();
			mesta[i].setSlobodno(true);
		}
	}

	public void ispisiRegistarskiBrojKolaNaPrvomParkingMestu() {

		if (!mesta[0].getSlobodno())
			System.out.println("Reg. broj: " + mesta[0].getRegistarskiBroj());
		else
			System.out.println("Parking prvi je slobodan. ");

	}

	public void ispisiRegistarskiBrojKolaNaPoslednjemParkingMestu() {

		if (!mesta[mesta.length - 1].getSlobodno())
			System.out.println("Reg. broj: " + mesta[mesta.length - 1].getRegistarskiBroj());
		else
			System.out.println("Parking poslednji je slobodan. ");

	}

	public boolean imaLiSlobodnihParkingMesta() {
		for (int i = 0; i < mesta.length; i++) {
			if (mesta[i].getSlobodno())
				return true;
		}
		return false;

	}

	public int brojSlobodnihParkingMesta() {

		int brojacMesta = 0;
		for (int i = 0; i < mesta.length; i++)
			if (mesta[i].getSlobodno())
				brojacMesta++;
		return brojacMesta;

	}

	public boolean daLiJeVoziloNaParkingu(String registarskiBroj) {

		for (int i = 0; i < mesta.length; i++)
			if (!mesta[i].getSlobodno())// zaboravila sam bila ovaj uslov
				if (mesta[i].getRegistarskiBroj().equals(registarskiBroj))
					return true;

		return false;
	}

	public void uvediVozilo(String registarskiBroj) {
		if (imaLiSlobodnihParkingMesta()) {
			for (int i = 0; i < mesta.length; i++)
				if (mesta[i].getSlobodno()) {
					mesta[i].setSlobodno(false);// ovo sam zaboravila da stavim
					mesta[i].setRegistarskiBroj(registarskiBroj);
					break;
				}
		} else
			System.out.println("Nema slobodnih mesta.");
	}

	public void izvediVozilo(String registarskiBroj) {
		if (daLiJeVoziloNaParkingu(registarskiBroj))
			for (int i = 0; i < mesta.length; i++)
				if (mesta[i].getRegistarskiBroj().equals(registarskiBroj) && !mesta[i].getSlobodno()) {
					mesta[i].setSlobodno(true);
					mesta[i].setRegistarskiBroj(null);
				}

		System.out.println("Vozilo sa tim tablicama se ne nalazi na parkingu.");

	}

	public void ispisi() {
		for (int i = 0; i < mesta.length; i++)
			if (!mesta[i].getSlobodno())
				System.out.println("Vozilo registarskih tablica: " + mesta[i].getRegistarskiBroj()
						+ " je parkirano na mestu: " + i);
	}

	public void ispisiBGTablice() {
		for (int i = 0; i < mesta.length; i++)
			if (!mesta[i].getSlobodno() && mesta[i].getRegistarskiBroj().substring(0, 2).equalsIgnoreCase("bg"))
				System.out.println("Vozilo registarskih tablica: " + mesta[i].getRegistarskiBroj()
						+ " je parkirano na mestu: " + i);
	}
}
