package endava.ucitavanjesatastature;

import java.util.Scanner;

public class NizInt {

	private int[] nizCelihBrojeva;

	public void inicijalizujNiz() {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Unesi kapacitet niza za inicijalizaciju.");
			// String unos = sc.nextLine();
			int intUnos = sc.nextInt();
			if (intUnos > 0)
				nizCelihBrojeva = new int[intUnos];
			else
				nizCelihBrojeva = new int[10];
		} catch (Exception e) {
			System.out.println("Greska" + e.getMessage());
			nizCelihBrojeva = new int[10];
		}
	}

	public void ucitajSveElemente() throws Exception {
		Scanner sc = new Scanner(System.in);
		if (nizCelihBrojeva == null)
			throw new Exception("Greska! Niz nije inicijalizovan");
		for (int i = 0; i < nizCelihBrojeva.length; i++) {
			try {

				System.out.println("Unesi " + i + ". element niza: ");
				int intUnos = sc.nextInt();
				nizCelihBrojeva[i] = intUnos;// unos u niz

			} catch (Exception e) {
				System.out.println("Greska pri unosu" + i + ". elementa niza " + e.getMessage());
			}
		}
	}

	public void ispisiElementeNiza() throws Exception {

		if (nizCelihBrojeva == null)
			throw new Exception("Greska! Niz nije inicijalizovan");
		for (int i = 0; i < nizCelihBrojeva.length; i++)

			System.out.println("Elementi niza su: " + nizCelihBrojeva[i]);

	}
}
