package endava;

public class TrkackoVozilo141 extends Vozilo141 {

	double maximalnaBrzina = 0.0;

	void postaviMaxBrzinu(double maximalnaBrzina) {

		this.maximalnaBrzina = maximalnaBrzina;
	}

	@Override
	void ispisi() {
		super.ispisi();
		System.out.println("maximalnaBrzina" + maximalnaBrzina);
	}
}
