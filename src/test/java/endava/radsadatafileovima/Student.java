package endava.radsadatafileovima;

public class Student {

	private String imePrezime;
	private double brojPoena;

	public String getImePrezime() {

		return imePrezime;
	}

	public double getBrojPoena() {

		return brojPoena;
	}

	public void setImePrezime(String imePrezime) {
		if (imePrezime != null)
			this.imePrezime = imePrezime;
		else
			throw new RuntimeException("Ime i prezime ne moze biti null!");

	}

	public void setBrojPoena(double brojPoena) {

		if (brojPoena > 0 || brojPoena < 100)
			this.brojPoena = brojPoena;
		else
			throw new RuntimeException("Broj poena moze biti izmedju 0 i 100. ");
	}

	public String toString() {

		return "Ime i prezime studenta je: " + imePrezime + " Broj osvojenih poena je: " + brojPoena;

	}
}
