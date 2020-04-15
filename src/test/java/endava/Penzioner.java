package endava;

public class Penzioner extends Osoba138 {

	double penzija;

	Penzioner(String ime, String prezime, String jmbg, double penzija) {

		super(ime, prezime, jmbg);
		if (penzija > 0) {
			this.penzija = penzija;
		} else
			System.out.println("Greska!");
	}

	@Override
	public void ispisi() {

		System.out.println("Ime: " + ime);
		System.out.println("prezime: " + prezime);
		System.out.println("penzija: " + penzija);
	}

}
