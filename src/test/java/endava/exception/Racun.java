package endava.exception;

public class Racun {

	private int brojRacuna;
	private String proizvod;
	private double iznosRacuna;

	public int getBrojRacuna() {
		return brojRacuna;
	}

	public String getProizvod() {
		return proizvod;
	}

	public double getIznosRacuna() {
		return iznosRacuna;
	}

	public void setBrojRacuna(int brojRacuna) {
		if (brojRacuna > 0)
			this.brojRacuna = brojRacuna;
		else
			throw new RacunException("Greska, racun ne moze biti manje od 0.");
	}

	public void setProizvod(String proizvod) {
		if (proizvod != null)
			this.proizvod = proizvod;
		else
			throw new RacunException("Greska, ne moze biti null.");
	}

	public void setIznosRacuna(double iznosRacuna) {
		if (iznosRacuna > 0)
			this.iznosRacuna = iznosRacuna;
		else
			throw new RacunException("Greska, iznos ne moze biti manje od 0.");
	}

	public String toString() {
		return "Broj racuna: " + brojRacuna + " Proizvod: " + proizvod + " Iznos racuna: " + iznosRacuna;
	}

}
