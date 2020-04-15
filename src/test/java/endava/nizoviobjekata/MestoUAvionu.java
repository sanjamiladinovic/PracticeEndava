package endava.nizoviobjekata;

public class MestoUAvionu {

	private boolean slobodno = true;
	private String imePrezime = null;
	private int starost = 0;

	public boolean getSlobodno() {

		return slobodno;
	}

	public String getImePrezime() {

		return imePrezime;
	}

	public int getStarost() {

		return starost;
	}

	public void setSlobodno(boolean slobodno) {
		this.slobodno = slobodno;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public void setStarost(int starost) {
		this.starost = starost;
	}

	public String toString() {
		if (getSlobodno())
			return "Slobodno";
		else
			return "Ime i prezime putnika: " + imePrezime + ", godine starosti putnika: " + starost;
	}
}
