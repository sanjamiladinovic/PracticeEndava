package endava.liste;

import java.util.LinkedList;

public class ReliRangLista {

	private LinkedList<ReliEkipa> reliLista = new LinkedList<ReliEkipa>();

	public void unesiReliEkipePoOpadajucemPoretku(ReliEkipa re) {

		if (!reliLista.contains(re) && re != null) {
			for (int i = 0; i < reliLista.size(); i++)
				if (reliLista.get(i).getBrojPoena() < re.getBrojPoena()) {
					reliLista.add(i, re);// zauzima mesto ispred onoga od koga ima vise poena, ostali se pomeraju za
											// jedno mesto
					break;
				}
			if (!reliLista.contains(re))// proverava da li je tim prethodno ubacen, ako je imao manje poena od drugih
										// kandidata, nije, tako da se ovde ubacuje
				reliLista.addLast(re);
		} else
			System.out.println("Greska!");
	}

	public void ispisiRangListu() {

		for (int i = 0; i < reliLista.size(); i++)
			System.out.println((i + 1) + ". " + reliLista.get(i));

	}

	public void ispisiPrvoNajslabije() {
		for (int i = reliLista.size() - 1; i >= 0; i--)
			System.out.println((i + 1) + ". " + reliLista.get(i));
	}

	public void ispisiPrvihDeset() {
		for (int i = 0; i < 10; i++)
			System.out.println((i + 1) + ". " + reliLista.get(i));
	}

	public void noviPoeniZaEkpuPromenaMesta(ReliEkipa re) {
		if (re != null && reliLista.contains(re)) {
			reliLista.remove(re);
			unesiReliEkipePoOpadajucemPoretku(re);
		} else
			System.out.println("Greska!");
		// Vec gor imam metodu za unos tako da sam ovo dzabe pravila
//		for (int i = 0; i < reliLista.size(); i++)
//			if (reliLista.get(i).getBrojPoena() < re.getBrojPoena()) {
//				reliLista.add(i, re);
//				break;
//			}
//		reliLista.addLast(re);

	}

}
