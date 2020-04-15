package endava.nizoviobjekata;

public class Adresar {
	private Kontakt[] kontakti;

	public Adresar() {
		kontakti = new Kontakt[250];

//		for (int i = 0; i < kontakti.length; i++)
//			kontakti[i] = new Kontakt();
	}

	public boolean imaSlobodnih() {

		for (int i = 0; i < kontakti.length; i++)
			if (kontakti[i] == null)
				return true;

		return false;
	}

	public void unesiUAdresar(Kontakt o) {
		for (int i = 0; i < kontakti.length; i++)
			if (kontakti[i] == null) {
				kontakti[i] = o;
				break;
			} else
				System.out.println("Nema slobodnih mesta u adresaru. ");

	}

	public void unesiUAdresar(String imePrezime, String adresa, int telefon) {
		if (imaSlobodnih())
			for (int i = 0; i < kontakti.length; i++) {
				if (kontakti[i] == null) {
					kontakti[i] = new Kontakt();
					kontakti[i].setImePrezime(imePrezime);
					kontakti[i].setAdresa(adresa);
					kontakti[i].setTelefon(telefon);
					break;
				}
			}
		else
			System.out.println("Nema slobodnih mesta u adresaru. ");
	}

	public void izbaciIzAdresara(String imePrezime) {
		if (!imaSlobodnih())
			for (int i = 0; i < kontakti.length; i++)
				if (kontakti[i].getImePrezime().equalsIgnoreCase(imePrezime)) {
					kontakti[i] = null;
					break;

				}
	}

	public void ispisi() {
		for (int i = 0; i < kontakti.length; i++)
			if (kontakti[i] != null)
				System.out.println("Svi podaci o kontaktu: " + kontakti[i]);
	}

}
