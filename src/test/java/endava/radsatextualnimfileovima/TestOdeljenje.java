package endava.radsatextualnimfileovima;

import java.io.IOException;

public class TestOdeljenje {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Odeljenje o=new Odeljenje();
		  o.ucitajIzFajla();
		  o.odlicniDjaci();
		  o.losiDjaci();
		  o.ispisiSveODjacima();
	}

}
