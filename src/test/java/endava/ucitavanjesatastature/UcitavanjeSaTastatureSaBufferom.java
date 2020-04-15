package endava.ucitavanjesatastature;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UcitavanjeSaTastatureSaBufferom {

	public static void ucitajText() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.println("Upisi tekst kako bismo prebrojali recenice. ");
			String poruka = br.readLine();

			int brojac = 0;
			for (int i = 0; i < poruka.length(); i++) {
				if (poruka.charAt(i) == '.')
					brojac++;

			}
			System.out.println("Broj recenica u textu je: " + brojac);

		} catch (Exception e) {
			System.out.println("Greska: " + e.getMessage());
		}

	}

	public static void ucitajRecenicuIIzbrojReci() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.println("Upisi recenicu kako bih prebrojala reci. ");
			String poruka = br.readLine();

			int brojac = 0;
			for (int i = 0; i < poruka.length(); i++) {
				if (poruka.charAt(i) == ' ')
					brojac++;

			}
			System.out.println("Broj reci u recenici je: " + (brojac + 1));

		} catch (Exception e) {
			System.out.println("Greska: " + e.getMessage());
		}

	}

	public static void ucitajTextIPrebrojRecSneg() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.println("Upisi tekst kako bismo prebrojali rec sneg koliko se puta pojavljuje: ");
			String poruka = br.readLine();
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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.println("Upisi koliko metara zelis da pretvoris u kilometre: ");
			String zaDouble = br.readLine();
			double metri = Double.parseDouble(zaDouble);

			System.out.println("Metara: " + metri + " u kilometrima je: " + (metri / 1000));

		} catch (Exception e) {
			System.out.println("Greska: " + e.getMessage());
		}

	}

	public static void ucitajRedomBrojeveISumirajNakonReciKraj() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double suma = 0;

		try {
			while (true) {
				System.out.println("Unesi realan broj: ");
				String zaDouble = br.readLine();
				suma = suma + Double.parseDouble(zaDouble);
			}

		} catch (Exception e) {
			System.out.println("Kraj ucitavanja.");
		}
		System.out.println("Suma brojeva je: " + suma);
	}

	public static void ucitajCeoBrojIIzracunajFaktorijel() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int faktorijel = 1;

		try {
			System.out.println("Upisi broj za faktorijal: ");
			String brozZaInt = br.readLine();
			int brojZaFaktorijel = Integer.parseInt(brozZaInt);
			if (brojZaFaktorijel > 0) {
				for (int i = 1; i <= brojZaFaktorijel; i++) {
					faktorijel = faktorijel * i;
				}
				System.out.println("Faktorijel broja " + brojZaFaktorijel + " je: " + faktorijel);
			} else
				System.out.println("1");
		} catch (Exception e) {
			System.out.println("Greska: " + e.getMessage());
		}

	}

	public static void proizvodUnosaCelihBrojeva() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int proizvod = 1;

		try {
			while (true) {
				System.out.println("Unesi ceo broj: ");
				String brozZaInt = br.readLine();
				proizvod = proizvod * Integer.parseInt(brozZaInt);

			}
		} catch (Exception e) {
			System.out.println("Kraj ucitavanja.");
		}
		System.out.println("Proizvod brojeva je: " + proizvod);

	}

}
