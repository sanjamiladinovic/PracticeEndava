package endava.provera;

import endava.ljudi.Osoba;
import endava.zaposleni.Zaposleni;

public class TestOsoba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Osoba oso = new Osoba();
		Zaposleni zap = new Zaposleni();
		oso.setIme("Pera");
		oso.setPrezime("Peric");
		oso.setJMBG("3112979710089");
		zap.setIme("Mika");
		zap.setPrezime("Lazic");
		zap.setJMBG("3110970710111");
		zap.setPlata(40000);
		System.out.println("Ime: " + oso.getIme() + " Prezime: " + oso.getPrezime() + " JMBG: " + oso.getJMBG());
		System.out.println("Ime: " + zap.getIme() + " Prezime: " + zap.getPrezime() + " JMBG: " + zap.getJMBG()
				+ " Plata: " + zap.getPlata());
		zap.ispisiZaposlenog();
	}

}
