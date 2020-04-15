package interfaceendava;

public class MuzickiStub extends MuzickiUredjaj implements RadioKomponenta, CDKomponenta {

	double frekvencija = 87.5;
	int brojPesme;
	boolean ukljucenRadio;
	boolean ukljucenCD;

	public void pustiPesmu(int brojPesme) {
		// TODO Auto-generated method stub
		ukljucenCD = true;
		if (brojPesme >= 1 && brojPesme <= 21)
			this.brojPesme = brojPesme;
		else
			this.brojPesme = 1;
	}

	public void promeniStanicu(double frekvencija) {
		// TODO Auto-generated method stub
		ukljucenRadio = true;
		ukljucenCD = true;
		if (frekvencija >= 87.5 && frekvencija <= 108.0)
			this.frekvencija = frekvencija;
		else
			this.frekvencija = 87.5;
	}

	@Override
	void ispisi() {
		// TODO Auto-generated method stub

		if (ukljucen == true)
			System.out.println("Ukljucen" + ukljucen);
		System.out.println("Trenutna jacina tona je: " + jacinaTona);
		if (ukljucenRadio == true)
			System.out.println("Trenutno se pusta: " + frekvencija + " frekcencija. ");
		else
			System.out.println("Stub je iskljucen.");
	}

}
