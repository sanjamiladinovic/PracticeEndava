package interfaceendava;

public abstract class MuzickiUredjaj {

	boolean ukljucen;
	int jacinaTona = 0;

	void ukljuci() {

		ukljucen = true;
	}

	void iskljuci() {

		ukljucen = false;
	}

	void pojacajTon() {

		if (jacinaTona < 40)
			jacinaTona++;
	}

	void smanjiTon() {

		if (jacinaTona < 0)
			jacinaTona--;
	}

	abstract void ispisi();

}
