package endava;

public class Djak extends Osoba138 {
	double prosecnaOcena;

	Djak(String ime, String prezime, String jmbg, double prosecnaOcena) {

		super(ime, prezime, jmbg);

		if (prosecnaOcena >= 1 && prosecnaOcena <= 5) {
			this.prosecnaOcena = prosecnaOcena;
		}

		else
			System.out.println();
	}

	@Override
	public void ispisi() {

		super.ispisi();
		System.out.println("Prosecna ocena: " + prosecnaOcena);
	}
}
