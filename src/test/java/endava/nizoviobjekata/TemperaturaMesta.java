package endava.nizoviobjekata;

public class TemperaturaMesta {

	private String nazivMesta = "nepoznat";
	private int temperatura;

	public String getNazivMesta() {
		return nazivMesta;
	}

	public int gettemperatura() {
		return temperatura;
	}

	public void setNazivMesta(String nazivMesta) {
		if (nazivMesta != null)
			this.nazivMesta = nazivMesta;
		else
			System.out.println("Greska!");
	}

	public void setTemperatura(int temperatura) {

		this.temperatura = temperatura;

	}

}
