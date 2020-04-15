package abstraktnaklasaendava;

public class Menadzer extends Zaposleni {

	@Override
	void izracunajPlatu(int sati) {
		// TODO Auto-generated method stub
		plata = 1000 * sati;
	}

}
