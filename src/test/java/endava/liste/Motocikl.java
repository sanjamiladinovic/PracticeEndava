package endava.liste;

public class Motocikl {

	private String marka;
	private String model;
	private int kubikaza;

	public String getMarka() {
		return marka;
	}

	public String getModel() {
		return model;
	}

	public int getKubikaza() {
		return kubikaza;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}

	public String toString() {
		return "Marka: " + marka + " Model: " + model + " Kubikaza: " + kubikaza;
	}

	public boolean equals(Object o) {
		Motocikl mot = (Motocikl) (o);
		if (mot.getMarka().equals(marka) && mot.getModel().equals(model) && mot.getKubikaza() == kubikaza)
			return true;
		else
			return false;
	}
}
