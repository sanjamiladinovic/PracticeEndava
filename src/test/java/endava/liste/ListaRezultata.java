package endava.liste;

import java.util.LinkedList;

public class ListaRezultata {

	private LinkedList<Takmicar> takmicari;

	public ListaRezultata() {

		takmicari = new LinkedList<Takmicar>();
	}

	public void unesiTakmicara(Takmicar t) {
		if (t != null && !takmicari.contains(t))
			if (t.getVreme() == 0)
				takmicari.addLast(t);// ako je diskvalifikovan ide na kraj liste
			else {
				for (int i = 0; i < takmicari.size(); i++)
					if (takmicari.get(i).getVreme() > t.getVreme() || takmicari.get(i).getVreme() == 0) {// ako nadje
																											// takmicare
																											// sa
																											// vecim
																											// vremenom
																											// ili
																											// diskvalifikovane,
																											// ubacuje
																											// se
																											// pre njih,
																											// tj
																											// na
																											// njihovo
																											// mesto,
																											// oni se
																											// pomeraju
						takmicari.add(i, t);
						break;
					}

				if (!takmicari.contains(t))
					takmicari.addFirst(t);
			}
		else
			System.out.println("Greska!");

	}

	public void ispisi() {

		for (int i = 0; i < takmicari.size(); i++)
			System.out.println("Na mestu broj " + (i + 1) + ". " + takmicari.get(i));
	}

	public void ispisiPrvihOsamFinalista() {
		int max = 8;
		if (max > takmicari.size())
			max = takmicari.size();// za slucaj da ima manje od 8 takmicara u listi i da ne bi pucalo ako trazi i
									// od 5, a ima 4 takmicara

		for (int i = 0; i < max; i++)
			if (takmicari.get(i).getVreme() != 0)
				System.out.println("Prvih 8 finalista je: " + ". " + takmicari.get(i));

	}

	public void ispisiReprezentativce(String zemlja) {
		for (int i = 0; i < takmicari.size(); i++)
			if (takmicari.get(i).getZemlja().equalsIgnoreCase(zemlja))
				System.out.println("Reprezentacija: " + (i + 1) + ". " + takmicari.get(i));

	}

	public boolean daLiJeOborenRekord(double svetskiRekotdVreme) {

		if (takmicari.getFirst().getVreme() < svetskiRekotdVreme)
			return true;
		else
			return false;
	}

}
