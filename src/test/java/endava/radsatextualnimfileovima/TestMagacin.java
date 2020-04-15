package endava.radsatextualnimfileovima;

import java.io.IOException;

public class TestMagacin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Magacin mag = new Magacin();
		mag.ucitajProizvode();
		mag.listaNabavke();
		mag.dopuniIzFajla();
		mag.ispisi();
	}

}
