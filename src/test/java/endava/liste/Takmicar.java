package endava.liste;

public class Takmicar {

	private String zemlja;
	private String imePrezime;
	private double vreme;

	public String getZemlja() {

		return zemlja;
	}

	public String getImePrezime() {

		return imePrezime;
	}

	public double getVreme() {

		return vreme;
	}

	public void setZemlja(String zemlja) {
		if (zemlja != null)
			this.zemlja = zemlja;
		else
			System.out.println("Greska!");
	}

	public void setImePrezime(String imePrezime) {
		if (imePrezime != null)
			this.imePrezime = imePrezime;
		else
			System.out.println("Greska!");
	}

	public void setVreme(double vreme) {
		if (vreme >= 0)
			this.vreme = vreme;
		else
			System.out.println("Greska!");
	}

	public String toString() {
		if (vreme > 0)
			return "Zemlja: " + zemlja + " Ime i prezime: " + imePrezime + " Vreme: " + vreme;
		else
			return "Zemlja: " + zemlja + " Ime i prezime: " + imePrezime + " diskvalifikovan";
	}

	public boolean equals(Object o) {
		if (o instanceof Takmicar) {
			Takmicar t = (Takmicar) (o);
			if (imePrezime.equals(t.getImePrezime()) && zemlja.equals(t.getZemlja()))
				return true;
			else
				return false;
		} else
			return false;

	}
}
