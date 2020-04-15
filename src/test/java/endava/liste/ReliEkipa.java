package endava.liste;

public class ReliEkipa {

	private String imeEkipe;
	int brojPoena;

	public String getImeEkipe() {

		return imeEkipe;
	}

	public int getBrojPoena() {
		return brojPoena;
	}

	public void setImeEkipe(String imeEkipe) {
		if (imeEkipe != null)
			this.imeEkipe = imeEkipe;
		else
			System.out.println("Greska!");
	}

	public void setBrojPoena(int brojPoena) {
		if (brojPoena >= 0)
			this.brojPoena = brojPoena;
		else
			System.out.println("Greska!");
	}

	public String toString() {

		return "Ime ekipe: " + imeEkipe + " Broj podena: " + brojPoena;
	}

	public boolean equals(Object o) {

		if (o instanceof ReliEkipa) {
			ReliEkipa re = (ReliEkipa) (o);
			if (imeEkipe.equals(re.getImeEkipe()))
				return true;
			else
				return false;
		} else
			return false;

	}
}
