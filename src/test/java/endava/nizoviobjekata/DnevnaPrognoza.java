package endava.nizoviobjekata;

public class DnevnaPrognoza {

	private TemperaturaMesta[] temperature;

	DnevnaPrognoza(int maxBrMesta) {
		if (maxBrMesta > 0)
			temperature = new TemperaturaMesta[maxBrMesta];// inicijalizacija kapaciteta atributa niza
		else {
			temperature = new TemperaturaMesta[10];// inicijalizacija kapaciteta atributa niza
			System.out.println("Greska! ");
		}

		// Pojedinacna inicijalizacija svakog objekta niza
		for (int i = 0; i < temperature.length; i++)
			temperature[i] = new TemperaturaMesta();
	}

	public boolean imaSlobodnihMesta() {
		for (int i = 0; i < temperature.length; i++) {
			if (temperature[i].getNazivMesta().equals("nepoznat"))
				return true;
		}
		return false;
	}

	public void unesi(String nazivMesta, int temperatura) {
		if (imaSlobodnihMesta())
			for (int i = 0; i < temperature.length; i++) {
				if (temperature[i].getNazivMesta().equals("nepoznat")) {
					temperature[i].setNazivMesta(nazivMesta);
					temperature[i].setTemperatura(temperatura);
					break;
				}

			}
		else
			System.out.println("Nema slobodnih mesta. ");

	}

	public void izbaci(String nazivMesta) {

		for (int i = 0; i < temperature.length; i++)
			if (!temperature[i].getNazivMesta().equals("nepoznat")
					&& temperature[i].getNazivMesta().equals(nazivMesta)) {
				temperature[i].setNazivMesta("nepoznat");
				temperature[i].setTemperatura(0);
				break;
			}

	}

	public void ispisi() {
		for (int i = 0; i < temperature.length; i++)
			System.out.println("U mestu: " + temperature[i].getNazivMesta() + ", je trenutna temperatura: "
					+ temperature[i].gettemperatura());
	}

}
