package endava.ucitavanjesatastature;

public class ParkingMesto {

	private boolean slobodno;
	private String registarskiBroj;

	public boolean getSlobodno() {
		return slobodno;
	}

	public String getRegistarskiBroj() {
		return registarskiBroj;
	}

	public void setSlobodno(boolean slobodno) {
		this.slobodno = slobodno;
	}

	public void setRegistarskiBroj(String registarskiBroj) {
		this.registarskiBroj = registarskiBroj;
	}

	public String toString() {
		if (slobodno)
			return " Slobodno. ";
		else
			return " Registarski broj: " + registarskiBroj;
	}

}
