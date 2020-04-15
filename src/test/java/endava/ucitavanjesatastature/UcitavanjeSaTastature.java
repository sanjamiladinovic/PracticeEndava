package endava.ucitavanjesatastature;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UcitavanjeSaTastature {
//UCITAJ I ISPISI
	public static void ucitajIIspisi() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Unesite poruku: ");
			String s = br.readLine();
			System.out.println("Uneli ste: " + s);

		} catch (Exception e) {
			System.out.println("Greska: " + e.getMessage());
		}
	}

	public static void ucitajIIspisi2() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Unesi poruku: ");
			String poruka = sc.nextLine();
			System.out.println("Uneli ste: " + poruka);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

//UCITAJ REALAN BROJ I NJEGOV KBVADRAT
	public static void ucitajRealanBrojINjegovKvadrat() {
		BufferedReader bread = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Unesi realan broj: ");
			String s = bread.readLine();
			double realanBroj = Double.parseDouble(s);
			System.out.println("Kvadrat broja " + realanBroj + " je: " + (realanBroj * realanBroj));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void ucitajRealanBrojINjegovKvadrat2() {

		try {
			Scanner ucitaj = new Scanner(System.in);
			System.out.println("Unesi realan broj: ");
			double realanBroj = ucitaj.nextDouble();
			System.out.println("Kvadrat broja " + realanBroj + " je: " + (realanBroj * realanBroj));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

//DA LI JE CEO BROJ DELJIV SA DVA, TJ. PARAN
	public static void daLiJeCeoBrojDeljivSaDva() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Unesi broj za deljenje sa dva: ");
			String s = br.readLine();

			int inBroj = Integer.parseInt(s);
			if (inBroj % 2 == 0)
				System.out.println("Broj '" + inBroj + "'" + " je deljiv sa dva, tj. paran je.");
			else
				System.out.println("Broj '" + inBroj + "'" + ", nije deljiv sa dva.");

		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void daLiJeCeoBrojDeljivSaDva2() {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Unesi broj: ");
			int ceoBroj = sc.nextInt();
			if (ceoBroj % 2 == 0)
				System.out.println("Broj '" + ceoBroj + "'" + " je deljiv sa dva, tj. paran je.");
			else
				System.out.println("Broj '" + ceoBroj + "'" + ", nije deljiv sa dva.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {

		// UcitavanjeSaTastature.ucitajIIspisi();
		// UcitavanjeSaTastature.ucitajRealanBroj();
		// UcitavanjeSaTastature.daLiJeCeoBrojDeljivSaDva();
		// UcitavanjeSaTastature.ucitajIIspisi2();
		//UcitavanjeSaTastature.ucitajRealanBrojINjegovKvadrat2();
		UcitavanjeSaTastature.daLiJeCeoBrojDeljivSaDva2();
	}

}
