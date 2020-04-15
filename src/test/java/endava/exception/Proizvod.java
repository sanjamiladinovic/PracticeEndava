package endava.exception;

public class Proizvod {

	private int sifra;
	private String naziv;
	private double cena;

	public int getSifra() {

		return sifra;
	}

	public String getNaziv() {

		return naziv;
	}

	public double getCena() {
		return cena;
	}

	public void setSifra(int sifra) throws Exception {
		if (sifra > 0)
			this.sifra = sifra;
		else
			throw new Exception("Greska. Sifra ne moze biti null.");
	}

	public void setNaziv(String naziv) throws Exception {
		if (naziv != null)
			this.naziv = naziv;
		else
			throw new Exception("Greska. Naziv ne moze biti null.");
	}

	public void setCena(double cena) throws Exception {
		if (cena > 0)
			this.cena = cena;
		else
			throw new Exception("Greska. Cena ne moze biti null.");
	}

	public String toString() {
		return "Sifra: " + sifra + " Naziv: " + naziv + " Cena: " + cena;
	}

}
