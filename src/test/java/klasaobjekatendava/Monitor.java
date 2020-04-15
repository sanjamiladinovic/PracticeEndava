package klasaobjekatendava;

public class Monitor {
	String marka;
	String model;
	int duzinaEkrana;

	String getMarka() {

		return marka;
	}

	String getModel() {

		return model;
	}

	int getDuzinaEkrana() {

		return duzinaEkrana;
	}

	void setMarka(String marka) {

		if (marka != null)
			this.marka = marka;
		else
			System.out.println("Greska!");
	}

	void setModel(String model) {

		if (model != null)
			this.model = model;
		else
			System.out.println("Greska!");
	}

	void setDuzinaEkrana(int duzinaEkrana) {

		if (duzinaEkrana > 12)
			this.duzinaEkrana = duzinaEkrana;
		else
			System.out.println("Greska!");
	}

	public String toString() {
		return "Marka: " + marka + "Model: " + model + "Dijagonala: " + duzinaEkrana;

	}

	public boolean equals(Object o) {
		if (o instanceof Monitor) {
			Monitor m = (Monitor) (o);
			if (marka.equals(m.marka) && model.equals(model) && duzinaEkrana == m.duzinaEkrana)
				return true;
			else
				return false;
		} else {
			System.out.println("Greska!");
			return false;
		}

	}

}
