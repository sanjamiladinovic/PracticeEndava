package endava;

public class Osoba138 {
	String ime = "N";
	String prezime = "N";
	String jmbg;

	Osoba138(String ime, String prezime, String jmbg) {
		if (ime != null && prezime != null && jmbg != null) {

			this.ime = ime;
			this.prezime = prezime;
			this.jmbg = jmbg;

		} else
			System.out.println("Greska!");
	}

	void ispisi() {
		System.out.println("Ime: " + ime);
		System.out.println("prezime: " + prezime);
		System.out.println("jmbg: " + jmbg);
	}

}
