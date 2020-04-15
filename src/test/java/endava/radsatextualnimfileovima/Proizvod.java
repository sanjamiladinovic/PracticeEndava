package endava.radsatextualnimfileovima;

public class Proizvod {

	private int sifra;
	private String naziv;
	private int kolicina;

	public int getSifra() {

		return sifra;
	}

	public String getNaziv() {

		return naziv;
	}

	public int getKolicina() {

		return kolicina;
	}

	public void setSifra(int sifra) {
		if (sifra >= 0)
			this.sifra = sifra;
		else
			throw new RuntimeException("Sifra mora biti >=0!");
	}

	public void setNaziv(String naziv) {
		if (naziv != null)
			this.naziv = naziv;
		else
			throw new RuntimeException("Naziv mora biti != null!");

	}

	public void setKolicina(int kolicina) {
		if (kolicina >= 0)
			this.kolicina = kolicina;
		else
			throw new RuntimeException("Kolicina mora biti >=0!");
	}

	public String toString() {

		return sifra + " " + naziv + " " + kolicina;

	}

	public boolean equals(Object o) {

		Proizvod p = (Proizvod) (o);
		if (!(o instanceof Proizvod))
			throw new RuntimeException("Objekat nije objekat klase Proizvod.");

		if (sifra == p.getSifra())
			return true;
		else
			return false;

	}

}
