package endava.nizoviobjekata;

public class Avion {

	private MestoUAvionu[] mesta;

	Avion() {

		mesta = new MestoUAvionu[120];

		for (int i = 0; i < mesta.length; i++) {
			mesta[i] = new MestoUAvionu();

		}

	}

	public void uvediPutnika(int redniBrojMesta, String imePrezime, int godineStarosti) {

		if (!mesta[redniBrojMesta].getSlobodno() || redniBrojMesta < 0 || redniBrojMesta > 119)
			System.out.println("Greska!");
		else {
			mesta[redniBrojMesta].setSlobodno(false);
			mesta[redniBrojMesta].setImePrezime(imePrezime);
			mesta[redniBrojMesta].setStarost(godineStarosti);
		}

	}

	public void izvediPutnika(int redniBrojMesta) {
		if (mesta[redniBrojMesta].getSlobodno() || redniBrojMesta < 0 || redniBrojMesta > 119)
			System.out.println("Greska!");
		else {
			mesta[redniBrojMesta].setSlobodno(true);
			mesta[redniBrojMesta].setImePrezime(null);
			mesta[redniBrojMesta].setStarost(0);
		}
	}

	public boolean daLiJeUAvionu(String imePrezime, int godineStarosti) {
		for (int i = 0; i < mesta.length; i++)
			if (!mesta[i].getSlobodno())
				if (mesta[i].getImePrezime().equals(imePrezime) && mesta[i].getStarost() == godineStarosti)
					return true;

		return false;

	}

	public double zauzetostSedista() {
		int brojac = 0;
		for (int i = 0; i < mesta.length; i++)
			if (!mesta[i].getSlobodno())
				brojac++;
		return (brojac * 100) / mesta.length;
	}

	public boolean daLiImaSlobodnihMesta() {
		for (int i = 0; i < mesta.length; i++)
			if (mesta[i].getSlobodno())
				return true;
		return false;
	}

	public int prosecnaStarostPutnika() {
		int ukupnaStarost = 0;
		int brojacPutnika = 0;
		for (int i = 0; i < mesta.length; i++) {

			if (!mesta[i].getSlobodno()) {
				brojacPutnika++;
				ukupnaStarost += mesta[i].getStarost();
			}

		}
		return ukupnaStarost / brojacPutnika;

	}

	public int najstarijiPutnikGodine() {

		int maxGodine = mesta[0].getStarost();

		for (int i = 0; i < mesta.length; i++) {

			if (!mesta[i].getSlobodno() && maxGodine < mesta[i].getStarost())
				maxGodine = mesta[i].getStarost();

		}
		return maxGodine;

	}

	public int najmladjiPutnikGodine() {

		int minGodine = mesta[0].getStarost();

		for (int i = 0; i < mesta.length; i++) {

			if (!mesta[i].getSlobodno() && minGodine > mesta[i].getStarost())
				minGodine = mesta[i].getStarost();

		}
		return minGodine;

	}

	public void ispisiSve() {
		for (int i = 0; i < mesta.length; i++)
			System.out.println("Redni broj: " + i + " Ime i prezime: " + mesta[i].getImePrezime() + " Godine putnika: "
					+ mesta[i].getStarost());

	}

	public void ispisiJovanovice() {

		for (int i = 0; i < mesta.length; i++)
			if (!mesta[i].getSlobodno() && mesta[i].getImePrezime().substring(mesta[i].getImePrezime().indexOf(" ") + 1)
					.equalsIgnoreCase("jovanovic"))
				System.out.println("Jovanovici podaci: " + mesta[i]);
	}
}
