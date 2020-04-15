package endava.liste;

import java.util.LinkedList;

public class IspitnaLista {

	private LinkedList<Student> studenti;

	public IspitnaLista() {

		studenti = new LinkedList<Student>();
	}

	public boolean laLiJeUListe(Student s) {

		return studenti.contains(s);

	}

	public void dodajStudenta(Student s) {

		if (s != null && !studenti.contains(s))
			studenti.add(s);
		else
			System.out.println("Greska!");

	}

	public void dodajStudentaNaPocetak(Student s) {
		if (s != null && !studenti.contains(s))
			studenti.addFirst(s);
		else
			System.out.println("Greska!");

	}

	public void dodajStudentaNaKraj(Student s) {
		if (s != null && !studenti.contains(s))
			studenti.addLast(s);
		else
			System.out.println("Greska!");

	}

	public void dodajStudentaNaMesto(Student s, int redniBrMesta) {
		if (s != null && !studenti.contains(s) && redniBrMesta >= 0 && redniBrMesta < studenti.size() - 1)
			studenti.add(redniBrMesta, s);
		else
			System.out.println("Greska!");
	}

	public void izbrisiStudenta(Student s) {
		if (s != null && studenti.contains(s))
			studenti.remove(s);
		else
			System.out.println("Greska!");
	}

	public void izbrisiStudentaSaPocetka() {
		if (studenti.size() > 0)
			studenti.removeFirst();
		else
			System.out.println("Greska!");
	}

	public void izbrisiStudentaSaKraja() {
		if (studenti.size() > 0)
			studenti.removeLast();
		else
			System.out.println("Greska!");
	}

	public void izbrisiStudentaSaMesta(int rBroj) {
		if (studenti.size() > 0 && rBroj >= 0 && rBroj < studenti.size())
			studenti.remove(rBroj);
		else
			System.out.println("Greska!");
	}

	public void obrisiListu() {

		studenti.clear();

	}

	public void ispisiPrvog() {
		if (studenti.size() > 0)
			System.out.println(studenti.getFirst());
		else
			System.out.println("Greska!");
	}

	public void ispisiPoslednjeg() {
		if (studenti.size() > 0)
			System.out.println(studenti.getLast());
		else
			System.out.println("Greska!");
	}

	public void ispisiSveOStudentima() {

		for (int i = 0; i < studenti.size(); i++)
			System.out.println(studenti.get(i));

	}

	public void ispisiDesetke() {
		for (int i = 0; i < studenti.size(); i++)
			if (studenti.get(i).getOcena() == 10)
				System.out.println("Desetke: " + studenti.get(i));
	}

	public double prosek() {
		int sumaOcena = 0;

		for (int i = 0; i < studenti.size(); i++)
			sumaOcena = sumaOcena + studenti.get(i).getOcena();
		return sumaOcena / studenti.size();

	}

	public void ispisiStareStudente() {

		for (int i = 0; i < studenti.size(); i++)
			if (studenti.get(i).getBrojIndexa().substring(5).equals("99"))
				System.out.println(studenti.get(i));

	}
}
