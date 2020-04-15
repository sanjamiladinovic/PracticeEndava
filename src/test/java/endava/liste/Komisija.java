package endava.liste;

import java.util.LinkedList;

public class Komisija {

	private LinkedList<ClanKomisije> clanovi;

	public Komisija() {
		clanovi = new LinkedList<ClanKomisije>();
	}

	public void unesiUListu(ClanKomisije ck) {

		if (!clanovi.contains(ck))
			clanovi.add(ck);
		else
			System.out.println("Vec postoji clan komisije sa istim imenom i prezimenom.");

	}

	public void sprovediPopis() {
		if (clanovi.size() > 5) {
			System.out.println("Komisija je nevazeca, ima vise od 5 clanova.");
			clanovi.clear();
		}

	}

	public void razresiClanaKomisije(ClanKomisije ck) {

		clanovi.remove(ck);

	}

	public void ispisiSastavKomisije() {

		for (int i = 0; i < clanovi.size(); i++)
			System.out.println(clanovi.get(i));

	}

}
