package nasledjivanjeendava;

public class Proizvod {

	String naziv;
	double cena;

	Proizvod() {

		this.naziv = "nepoznat";
		this.cena = 0.0;

	}

	Proizvod(String naziv, double cena) {

		if (naziv != null && cena > 0.0) {
			this.naziv = naziv;
			this.cena = cena;
		}

		else {
			this.naziv = "nepoznat";
			this.cena = 0.0;
			System.out.println("Greska!");
		}
	}

	String getNaziv() {
		return naziv;
	}

	void setNaziv(String naziv) {
		if (naziv != null)
			this.naziv = naziv;
		else
			System.out.println("Greska!");

	}

	double getCena() {
		return cena;
	}

	void setCena(double cena) {
		if (cena > 0)
			this.cena = cena;
		else
			System.out.println("Greska!");

	}

}
