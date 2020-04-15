package endava.ucitavanjesatastature;

import java.util.Scanner;

public class UcitavanjeSaTastature2 {

	public static void ucitajText() {
		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Upisi tekst kako bismo prebrojali recenice. ");
			String poruka = sc.nextLine();

			int brojac = 0;
			for (int i = 0; i < poruka.length(); i++) {
				if (poruka.charAt(i) == '.')
					brojac++;

			}
			System.out.println("Broj recenica u textu je: " + brojac);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void ucitajRecenicuIIzbrojReci() {
		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Upisi recenicu kako bih prebrojala reci. ");
			String poruka = sc.nextLine();

			int brojac = 0;
			for (int i = 0; i < poruka.length(); i++) {
				if (poruka.charAt(i) == ' ')
					brojac++;

			}
			System.out.println("Broj reci u recenici je: " + (brojac + 1));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void ucitajTextIPrebrojRecSneg() {
		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Upisi tekst kako bismo prebrojali rec sneg koliko se puta pojavljuje: ");
			String poruka = sc.nextLine();
			String[] reci = poruka.split(" ");
			int brojac = 0;
			for (int i = 0; i < reci.length; i++) {
				if (reci[i].equalsIgnoreCase("sneg") || reci[i].equalsIgnoreCase("sneg"))
					brojac++;

			}
			System.out.println("Rec sneg se pojavljuje: " + brojac + " puta.");

		} catch (Exception e) {
			System.out.println("Greska: " + e.getMessage());
		}

	}

	public static void ucitajMetreIIspisiKilometre() {
		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Upisi koliko metara zelis da pretvoris u kilometre: ");
			double metri = sc.nextDouble();

			System.out.println("Metara: " + metri + ", je " + (metri / 1000) + " kilometara.");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void ucitajRedomBrojeveISumirajNakonReciKraj() {
		Scanner sc = new Scanner(System.in);
		double suma = 0;

		try {
			while (true) {
				System.out.println("Unesi realan broj: ");
				suma = suma + sc.nextDouble();
			}

		} catch (Exception e) {
			System.out.println("Kraj ucitavanja.");
		}
		System.out.println("Suma brojeva je: " + suma);
	}

	public static void ucitajCeoBrojIIzracunajFaktorijel() {
		Scanner sc = new Scanner(System.in);

		int faktorijel = 1;

		try {
			System.out.println("Upisi broj za faktorijal: ");
			int brojZaFaktorijel = sc.nextInt();
			if (brojZaFaktorijel > 0) {
				for (int i = 1; i <= brojZaFaktorijel; i++) {
					faktorijel = faktorijel * i;
				}
				System.out.println("Faktorijel broja " + brojZaFaktorijel + " je: " + faktorijel);
			} else
				System.out.println("1");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void proizvodUnosaCelihBrojeva() {
		Scanner sc = new Scanner(System.in);
		int proizvod = 1;

		try {
			while (true) {
				System.out.println("Unesi ceo broj: ");
				proizvod = proizvod * sc.nextInt();

			}
		} catch (Exception e) {
			System.out.println("Kraj ucitavanja.");
		}
		System.out.println("Proizvod brojeva je: " + proizvod);

	}

}
