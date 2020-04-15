package nasledjivanjeendava;

public class KucniAparat {

	String marka;
	String model;
	boolean ukljucen;

	KucniAparat(String marka, String model, boolean ukljucen) {

		if (marka != null && model != null) {
			this.marka = marka;
			this.model = model;
			this.ukljucen = ukljucen;
		} else
			System.out.println("Greska!");

	}

	String getMarka() {

		return this.marka;
	}

	void setMarka(String proizvodjac) {
		if (proizvodjac != null)
			this.marka = proizvodjac;
		else
			System.out.println("Greska, nije upisan proizvodjac. ");
	}

	String getModel() {

		return this.model;
	}

	void setModel(String model) {
		if (model != null)
			this.model = model;
		else
			System.out.println("Greska, nije upisan proizvodjac. ");
	}

	void ukljuciAparat() {
		this.ukljucen = true;
	}

	void iskljuciAparat() {
		this.ukljucen = false;
	}

	void ispisi() {

		System.out.println("Model: " + model + "Marka: " + marka + "Ukljucen: " + ukljucen);
	}

}
