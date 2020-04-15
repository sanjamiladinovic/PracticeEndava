package klasaobjekatendava;

public class Osoba {

	String ime = "N";
	String prezime = "N";
	String JMBG;

	String getIme() {
		return ime;
	}

	String getPrezime() {
		return prezime;
	}

	String getJMBG() {
		return JMBG;
	}

	void setIme(String ime) {
		if (ime != null)
			this.ime = ime;
		else
			System.out.println("Greska!");
	}

	void setPrezime(String prezime) {
		if (prezime != null)
			this.prezime = prezime;
		else
			System.out.println("Greska!");
	}

	void setJMBG(String JMBG) {
		if (JMBG != null)
			this.JMBG = JMBG;
		else
			System.out.println("Greska!");
	}

	public String toString() {

		return "Ime: " + ime + " Prezime: " + prezime + "JMBG: " + JMBG;
	}

	public boolean equals(Object o) {

		if (o instanceof Osoba) {
			Osoba osoba = (Osoba) (o);

			if (ime.equals(osoba.getIme()) && prezime.equals(osoba.getPrezime()) && JMBG.equals(osoba.getJMBG()))
				return true;
			else
				return false;
		} else {
			System.out.println("Greska!");
			return false;
		}
	}
}
