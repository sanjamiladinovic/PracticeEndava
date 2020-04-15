package endava.radsadatafileovima;

public class Koncert {

	private String grad;
	private String bend;

	public String getGrad() {

		return grad;
	}

	public String getBend() {

		return bend;
	}

	public void setGrad(String grad) {
		if (grad != null)
			this.grad = grad;
		else
			throw new RuntimeException("Naziv grad ne moze biti null!");

	}

	public void setBend(String bend) {
		if (bend != null)
			this.bend = bend;
		else
			throw new RuntimeException("Naziv benda ne moze biti null!");

	}

	public String toString() {

		return "Ime grada je: " + grad + " Naziv benda je: " + bend;

	}
}
