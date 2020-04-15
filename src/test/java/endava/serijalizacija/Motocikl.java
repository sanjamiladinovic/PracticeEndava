package endava.serijalizacija;

import java.io.Serializable;

public class Motocikl implements Serializable {

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
		if (marka != null)
			this.marka = marka;
		else
			throw new RuntimeException("Marka ne moze biti null!");

	}

	public void setModel(String model) {
		if (model != null)
			this.model = model;
		else
			throw new RuntimeException("Model ne moze biti null!");

	}

	public void setKubikaza(int kubikaza) {
		if (kubikaza > 0)
			this.kubikaza = kubikaza;
		else
			throw new RuntimeException("Kubikaza mora biti veca od 0!");

	}

	public String toString() {

		return "Marka je: " + marka + " Model je: " + model + " Kubikaza je: " + kubikaza;

	}

	public boolean equals(Object o) {
		Motocikl k = (Motocikl) (o);
		if (o instanceof Motocikl)
			throw new RuntimeException("Objekat nije objekat klase Motocikl.");
		if (marka.equals(k.getMarka()) && model.equals(k.getMarka()) && kubikaza == k.getKubikaza())
			return true;
		else
			return false;
	}

}
