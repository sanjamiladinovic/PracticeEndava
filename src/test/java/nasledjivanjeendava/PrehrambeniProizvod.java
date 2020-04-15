package nasledjivanjeendava;

import java.util.GregorianCalendar;

public class PrehrambeniProizvod extends Proizvod {

	GregorianCalendar rokTrajanjaDatum;

	PrehrambeniProizvod() {
		super();
		this.rokTrajanjaDatum = new GregorianCalendar();
	}

	PrehrambeniProizvod(String naziv, double cena, GregorianCalendar rokTrajanjaDatum) {
		super(naziv, cena);
		if (rokTrajanjaDatum.after(new GregorianCalendar()))
			this.rokTrajanjaDatum = rokTrajanjaDatum;
		else
			rokTrajanjaDatum = new GregorianCalendar();
	}
}
