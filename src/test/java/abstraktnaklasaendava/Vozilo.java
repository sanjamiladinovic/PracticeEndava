package abstraktnaklasaendava;

public abstract class Vozilo {

	String marka;
	String model;

	String getMarku() {
		return marka;
	}

	String getModel() {
		return model;
	}

	void setMarka(String marka) {
		if (marka != null)
			this.marka = marka;
		else
			System.out.println("Greska! ");
	}

	void setModel(String model) {
		if (model != null)
			this.model = model;
		else
			System.out.println("Greska! ");

	}

	abstract boolean daLiIdePoKopnu();

	abstract boolean daLiIdePoVodi();

	abstract boolean daLiIdePoVazduhu();

	void ispisi() {

		System.out.println(marka + " " + model);

		if (daLiIdePoKopnu())
			System.out.println("Vozilo ide po kopnu. ");
		if (daLiIdePoVodi())
			System.out.println("Vozilo ide po vodi. ");
		if (daLiIdePoVazduhu())
			System.out.println("Vozilo ide po vazduhu. ");
	}

}
