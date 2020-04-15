package endava.exception;

public class Automobil {

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
		if (marka == null)
			throw new RuntimeException("Marka ne sme biti null.");
		else
			this.marka = marka;
	}

	public void setModel(String model) {
		if (model == null)
			throw new RuntimeException("Model ne sme biti null.");
		else
			this.model = model;
	}

	public void setKubikaza(int kubikaza) {
		if (kubikaza < 500 || kubikaza > 8000)
			throw new RuntimeException("Kubikaza mora biti izmedju 500 i 8000.");
		this.kubikaza = kubikaza;
	}

	public String toString() {

		return "Marka: " + marka + " Model: " + model + " Kubikaza: " + kubikaza;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automobil auto = new Automobil();
		try {
			auto.setMarka(null);
		} catch (Exception e) {
			System.out.println("Greska: " + e.getMessage());
		}
		try {
			auto.setModel("Octavia");
		} catch (Exception e) {
			System.out.println("Greska: " + e.getMessage());
		}
		try {
			auto.setKubikaza(1000);
		} catch (Exception e) {
			System.out.println("Greska: " + e.getMessage());
		}

		System.out.println(auto);
	}

}
