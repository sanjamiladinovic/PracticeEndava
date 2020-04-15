package abstraktnaklasaendava;

public abstract class Zaposleni {

	double plata;

	double getPlata() {
		return plata;
	}
	
	abstract void izracunajPlatu(int sati);

}
