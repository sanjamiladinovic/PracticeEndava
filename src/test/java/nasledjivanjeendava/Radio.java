package nasledjivanjeendava;

public class Radio extends KucniAparat {

	double frekvencija = 87.5;

	Radio(String marka, String model, boolean ukljucen, double frekvencija) {
		super(marka, marka, ukljucen);
		if (frekvencija > 87.5 && frekvencija < 108.0)

			this.frekvencija = frekvencija;
		else
			System.out.println("Greska, uneti podaci za radio nisu zadovoljili uslove. ");
	}

	double getFrekvencija() {

		return this.frekvencija;
	}

	void setFrekvencija(double frekvencija) {
		if (frekvencija > 87.5 && frekvencija < 108.0)
			this.frekvencija = frekvencija;
		else
			System.out.println("Greska, frekvencija nije u dozvoljenom rasponu. ");
	}

	void ispisi() {
		if (ukljucen == true)
			System.out.println("Radio je na frekvenciji: " + frekvencija);
		else
			System.out.println("Radio je iskljucen. ");
	}
}
