package endava.liste;

public class ClanKomisije {

	private String imePrezime;
	private String funkcija = null;

	public String getImePrezime() {
		return imePrezime;
	}

	public String getFunkcija() {
		return funkcija;
	}

	public void setImePrezime(String imePrezime) {
		if (imePrezime != null && !imePrezime.equals(""))
			this.imePrezime = imePrezime;
		else
			System.out.println("Greska!");
	}

	public void setFja(String funkcija) {
		this.funkcija = funkcija;
	}

	public String toString() {
		if (funkcija == null)
			return "Clan komisije: " + imePrezime;
		else
			return "Clan komisije: " + imePrezime + " Funkcija: " + funkcija;
	}

	public boolean equals(Object o) {
		ClanKomisije ck = (ClanKomisije) (o);
		if (imePrezime.equals(ck.getImePrezime()))
			return true;
		else
			return false;
	}

}
