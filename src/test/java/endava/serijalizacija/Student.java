package endava.serijalizacija;

import java.io.Serializable;

public class Student implements Serializable {

	private String imePrezime;
	private int poeni;

	public String getImePrezime() {

		return imePrezime;
	}

	public int getPoeni() {

		return poeni;
	}

	public void setImePrezime(String imePrezime) {
		if (imePrezime != null)
			this.imePrezime = imePrezime;
		else
			throw new RuntimeException("Ime i prezime ne moze biti null!");

	}

	public void setBrojPoena(int poeni) {

		if (poeni > 0 || poeni < 100)
			this.poeni = poeni;
		else
			throw new RuntimeException("Broj poena moze biti izmedju 0 i 100. ");
	}

	public String toString() {

		return "Ime i prezime studenta je: " + imePrezime + " Broj osvojenih poena je: " + poeni;

	}

}
