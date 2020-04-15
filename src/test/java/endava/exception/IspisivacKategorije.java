package endava.exception;

public class IspisivacKategorije {

	public static void kategorijaPoVIsini(int visina) throws Exception {
		if (visina < 120 || visina > 250)
			throw new Exception("Visina nije u dozvoljenim granicama.");
		else {

			if (visina < 160)
				System.out.println("Niski ljudi.");
			if (visina > 160 && visina < 185)
				System.out.println("Srednja visina ljudi.");
			if (visina > 185)
				System.out.println("Visoki ljudi.");
		}
	}

	public static void kategorijaPoGodinamaLjudi(int godine) throws Exception {
		if (godine < 0 || godine > 125)
			throw new Exception("Godine nisu u dozvoljenim granicama.");
		else {
			if (godine < 29)
				System.out.println("Mladost.");
			if (godine > 30 && godine < 55)
				System.out.println("Zrelost.");
			if (godine > 56)
				System.out.println("Starost.");
		}

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		try {
			IspisivacKategorije.kategorijaPoVIsini(163);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		try {
			IspisivacKategorije.kategorijaPoGodinamaLjudi(150);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
