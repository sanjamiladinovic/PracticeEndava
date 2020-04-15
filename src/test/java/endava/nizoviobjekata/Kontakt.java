package endava.nizoviobjekata;

public class Kontakt {

	private String imePrezime = null;
	private String adresa = null;
	private int telefon = 0;

	public String getImePrezime() {
		return imePrezime;
	}

	public String getAdresa() {
		return adresa;
	}

	public int getTelefon() {
		return telefon;
	}

	public void setImePrezime(String imePrezime) {
		if (imePrezime != null)
			this.imePrezime = imePrezime;
		else
			System.out.println("Greska! Ime i Prezime mora imati neku vrednost.");
	}

	public void setAdresa(String adresa) {
		if (adresa != null)
			this.adresa = adresa;
		else
			System.out.println("Greska! Adresa mora imati neku vrednost.");
	}

	public void setTelefon(int telefon) {
		if (telefon >= 0)
			this.telefon = telefon;
		else
			System.out.println("Greska! Telefon mora imati vise od 0 cifara.");
	}

	public String toString() {

		return "Ime i prezime: " + imePrezime + "Adresa: " + adresa + "Telefon: " + telefon;
	}

}
