package endava.ljudi;

public class Osoba {

	private String ime = "N";
	private String prezime = "N";
	private String JMBG;

	private boolean proveriJMBG(String JMBG) {
		if (JMBG.length() == 13 && JMBG != null)
			return true;
		else
			return false;

	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public String getJMBG() {
		return JMBG;
	}

	public void setIme(String ime) {
		if (ime != null)
			this.ime = ime;
		else
			System.out.println("Greska! ");
	}

	public void setPrezime(String prezime) {
		if (prezime != null)
			this.prezime = prezime;
		else
			System.out.println("Greska! ");
	}

	public void setJMBG(String JMBG) {
		if (proveriJMBG(JMBG))
			this.JMBG = JMBG;
		else
			System.out.println("Greska! ");
	}

	protected void isisi() {

		System.out.println("Ime: " + ime + " Prezime: " + prezime + "JMBG" + JMBG);
	}

}
