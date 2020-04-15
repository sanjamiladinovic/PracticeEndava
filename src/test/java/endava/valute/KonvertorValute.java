package endava.valute;

public class KonvertorValute {

	private double kursEvra;
	private double kursDolara;

	public void setKursEvra(double kursEvra) {
		if (kursEvra > 0)
			this.kursEvra = kursEvra;
		else
			System.out.println("Greska!");
	}

	public void setKursDolara(double kursDolara) {
		if (kursDolara > 0)
			this.kursDolara = kursDolara;
		else
			System.out.println("Greska!");
	}

	public double konvertujDinareUEvre(double iznosURsd) {

		double iznosUEur = iznosURsd / kursEvra;
		return iznosUEur;
	}

	public double konvertujDinareUDolare(double iznosURsd) {

		double iznosUDol = iznosURsd / kursDolara;
		return iznosUDol;
	}

	void ispisiKursnuListu() {
		System.out.println("Kurs EUR je: " + kursEvra + " Kurs DOL je: " + kursDolara);
	}

}
