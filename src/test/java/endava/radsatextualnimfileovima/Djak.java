package endava.radsatextualnimfileovima;

public class Djak {

	private String ime;
	private String prezime;
	private int ocena;

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;

	}

	public int getOcena() {

		return ocena;
	}

	public void setIme(String ime) {
		if (ime != null)
			this.ime = ime;
		else
			throw new RuntimeException("Greska! Ime ne moze biti null.");

	}

	public void setPrezime(String prezime) {
		if (prezime != null)
			this.prezime = prezime;
		else
			throw new RuntimeException("Greska! Prezime ne moze biti null.");

	}

	public void setOcena(int ocena) {
		if (ocena < 5 || ocena > 1)
			this.ocena = ocena;
		else
			throw new RuntimeException("Greska! Ocena moze biti izmedju 1 i 5.");

	}

	public String toString() {

		return ime + " " + prezime + " " + ocena;
	}

	public boolean equals(Object o) {

		if (!(o instanceof Djak))
			throw new RuntimeException("Greska! Nije objekat klase Djak.");
		Djak dj = (Djak) (o);
		if (ime.equalsIgnoreCase(dj.ime) && prezime.equalsIgnoreCase(dj.prezime))
			return true;
		else
			return false;
	}

}
