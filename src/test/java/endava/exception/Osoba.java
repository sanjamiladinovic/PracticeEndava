package endava.exception;

public class Osoba {

	private String ime;
	private String prezime;
	private int visina;
	private double tezina;
	private int godine;

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getVisina() {
		return visina;
	}

	public double getTezina() {
		return tezina;
	}

	public int getGodine() {
		return godine;
	}

	public void setIme(String ime) {
		if (ime == null || ime=="")
			throw new RuntimeException("Ime ne moze biti null.");
		else
			this.ime = ime;
	}

	public void setPrezime(String prezime) {
		if (prezime == null)
			throw new RuntimeException("Ime ne moze biti null.");
		else
			this.prezime = prezime;
	}

	public void setVisina(int visina) {
		if (visina < 50 || visina > 250)
			throw new RuntimeException("Visina mora biti izmedju 50 i 250 cm.");
		else
			this.visina = visina;
	}

	public void setTezina(double tezina) {
		if (tezina < 2 || tezina > 250)
			throw new RuntimeException("Tezina mora biti izmedju 2 i 250 kg.");
		else
			this.tezina = tezina;

	}

	public void setGodine(int godine) {
		if (godine < 0 || godine > 125)
			throw new RuntimeException("Unete godine moraju biti u rasponu od 0 do 125 godina.");
		else
			this.godine = godine;
	}

	public String toString() {
		return "Ime: " + ime + " Prezime: " + prezime + " Visina: " + visina + " Tezina: " + tezina + " Godine: "
				+ godine;
	}

	public boolean equals(Object o) {

		if (!(o instanceof Osoba))
			throw new RuntimeException("Nije unet objekat klase osoba, a zahtevan je.");
		else {
			Osoba osob = (Osoba) (o);
			if (ime.equals(osob.getIme()) && prezime.contains(osob.getPrezime()))
				return true;
			else
				return false;
		}

	}

}
