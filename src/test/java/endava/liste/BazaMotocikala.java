package endava.liste;

import java.util.LinkedList;

public class BazaMotocikala {

	private LinkedList<Motocikl> motocikl;

	public BazaMotocikala() {

		motocikl = new LinkedList<Motocikl>();
	}

	public boolean daLiJeUBazi(Motocikl m) {

		if (motocikl.contains(m))
			return true;
		else
			return false;

	}

	public void unesiUBazu(Motocikl m) {
		if (m != null && !motocikl.contains(m))
			motocikl.add(m);
		else
			System.out.println("Motocikl se vec nalazi u bazi.");
	}

	public void izbaciIzBaze(Motocikl m) {
		if (motocikl.contains(m))
			motocikl.remove(m);
		else
			System.out.println("Motocikl ne postoji u bazi.");
	}

	public void ispisi() {
		for (int i = 0; i < motocikl.size(); i++)
			System.out.println(motocikl.get(i));

	}

	public void ispisiKawasaku() {
		for (int i = 0; i < motocikl.size(); i++)
			if (motocikl.get(i).getMarka().equalsIgnoreCase("kawasaki"))
				System.out.println("Kawasaki podaci: " + motocikl.get(i));
	}

	public int maxKubikaza() {
		int maxKubikaza = motocikl.get(0).getKubikaza();
		for (int i = 0; i < motocikl.size(); i++)
			if (motocikl.get(i).getKubikaza() > maxKubikaza)
				maxKubikaza = motocikl.get(i).getKubikaza();
		return maxKubikaza;
	}

	public int prosecnaKubikaza() {
		int sumaKubikaza = 0;
		for (int i = 0; i < motocikl.size(); i++)

			sumaKubikaza = sumaKubikaza + motocikl.get(i).getKubikaza();
		return sumaKubikaza / motocikl.size();
	}

	public void ispisiMotociklSaNajvecomKubikazom() {
		int maxKubikaza = maxKubikaza();
		for (int i = 0; i < motocikl.size(); i++) {
			if (motocikl.get(i).getKubikaza() == maxKubikaza)
				System.out.println(motocikl.get(i));
			break;
		}

	}

}
