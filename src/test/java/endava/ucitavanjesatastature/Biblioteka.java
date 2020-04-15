package endava.ucitavanjesatastature;

import java.util.LinkedList;
import java.util.Scanner;

public class Biblioteka {
	private LinkedList<Knjiga> listaKnjiga = new LinkedList<Knjiga>();

	public void dodajNovuKnjigu() {

		Scanner sc = new Scanner(System.in);

		try {
			Knjiga k = new Knjiga();

			System.out.println("Dodaj novu knjigu - ISBN: ");
			k.setISBN(sc.nextLine());
			System.out.println("Dodaj novu knjigu - Naziv: ");
			k.setNaslov(sc.nextLine());
			System.out.println("Dodaj novu knjigu - Autora");
			k.setAutor(sc.nextLine());
			if (listaKnjiga.contains(k)) {
				throw new RuntimeException("Knjiga sa tim ISBN-om vec postoji.");
			}
			listaKnjiga.add(k);

		} catch (Exception e) {
			System.out.println("Greska! " + e.getMessage());
		}
	}

	public void unesiViseKnjiga() {
		Scanner sc = new Scanner(System.in);

		boolean kraj = true;
		try {
			while (kraj == true) {
				System.out.println("Da li zelite da unesete knjigu: ");
				String porukaDa = sc.nextLine();
				if (porukaDa.equalsIgnoreCase("da")) {

					Knjiga k = new Knjiga();
					System.out.println("Dodaj novu knjigu - ISBN: ");
					String dodajIsbn = sc.nextLine();
					k.setISBN(dodajIsbn);
					System.out.println("Dodaj novu knjigu - Naziv: ");
					String dodajNaziv = sc.nextLine();
					k.setNaslov(dodajNaziv);
					System.out.println("Dodaj novu knjigu - Autora");
					String dodajAutora = sc.nextLine();
					k.setAutor(dodajAutora);
					listaKnjiga.add(k);
				} else
					kraj = false;
			}
		} catch (Exception e) {
			System.out.println("Greska! " + e.getMessage());
		}
	}

	public void ispisiSadrzaj() {

		for (int i = 0; i < listaKnjiga.size(); i++) {
			System.out.println(listaKnjiga.get(i));

		}
	}

}
