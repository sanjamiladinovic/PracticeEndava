package endava.zaposleni;

import endava.ljudi.Osoba;

public class Zaposleni extends Osoba {

	private double plata;

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {

		if (plata > 0)
			this.plata = plata;
		else
			System.out.println("Greska! ");

	}

	public void ispisiZaposlenog() {
		super.isisi();
		System.out.println("Plata: " + plata);
	}

}
