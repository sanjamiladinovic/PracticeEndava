package endava.radsatextualnimfileovima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestRadSaTextom {

	public static void ucitajText() throws IOException {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\tekstzaucitavanje.txt"));
			boolean kraj = false;
			String ucitavanje = "";
			while (!kraj) {

				String ucitajText = br.readLine();
				if (ucitajText == null)
					kraj = true;
				else
					ucitavanje = ucitavanje + ucitajText + " ";
			}
			br.close();
			System.out.println(ucitavanje);
		} catch (Exception e) {
			System.out.println("Greska - ucitajText" + e.getMessage());
		}

	}

	public static void ucitajIzFileaIzParametra(String imeFilea) {
		if (imeFilea == null)
			throw new RuntimeException("Greska, naziv file-a ne moze biti null string.");
		try {
			BufferedReader br = new BufferedReader(new FileReader(imeFilea));
			boolean kraj = false;
			String ucitavanje = "";

			while (!kraj) {
				String ucitaj = br.readLine();
				if (ucitaj != null)
					ucitavanje = ucitavanje + ucitaj + " ";
				else
					kraj = true;

			}
			br.close();
			System.out.println(ucitavanje);
		} catch (Exception e) {
			System.out.println("Greska! ucitajIzFileaIzParametra" + e.getMessage());

		}
	}

	public static void izbrojReciUfajlu() {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\nadjirec.txt"));
			boolean kraj = false;
			String ucitano = "";
			while (!kraj) {
				String ucitaj = br.readLine();
				if (ucitaj == null)
					kraj = true;
				else
					ucitano = ucitano + ucitaj + " ";

			}
			br.close();
			String[] nizReci = ucitano.split(" ");
			// int brojac = 0;
			// for (int i = 0; i < nizReci.length; i++)
			// brojac++;

			System.out.println("Broj reci u textu je: " + nizReci.length);

		} catch (Exception e) {

			System.out.println("Greska! izbrojReciUfajlu" + e.getMessage());
		}
	}

	public static boolean nadjiRecUfajlu(String trazenaRec) {

		try {
			BufferedReader br = new BufferedReader(
					new FileReader("C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\nadjirec.txt"));
			boolean kraj = false;
			String ucitano = "";
			while (!kraj) {
				String ucitaj = br.readLine();
				if (ucitaj == null)
					kraj = true;
				else
					ucitano = ucitano + ucitaj + " ";

			}
			br.close();

			String[] nizUcitanog = ucitano.split(" ");
			for (int i = 0; i < nizUcitanog.length; i++)
				if (nizUcitanog[i].equalsIgnoreCase(trazenaRec) || nizUcitanog[i].equalsIgnoreCase(trazenaRec + "."))
					return true;

			return false;

		} catch (Exception e) {

			System.out.println("Greska! nadjiRecUfajlu" + e.getMessage());
			return false;
		}

	}

	public static void izbrojRecenice(String izbrojRecenice) {
		try {

			BufferedReader br = new BufferedReader(new FileReader(izbrojRecenice));
			if (izbrojRecenice == null)
				throw new RuntimeException("Fajl ne moze biti null.");

			boolean kraj = false;
			String ucitano = "";
			while (!kraj) {
				String ucitaj = br.readLine();
				if (ucitaj == null)
					kraj = true;
				else
					ucitano = ucitano + ucitaj + " ";
			}
			br.close();

			int brojac = 0;
			for (int i = 0; i < ucitano.length(); i++) {
				if (ucitano.charAt(i) == '.' || ucitano.charAt(i) == '?' || ucitano.charAt(i) == '!')
					// razdvojRecenice = ucitano.split(ucitano, ucitano.charAt(i));

					brojac++;
			}
			System.out.println("Broj recenica je: " + brojac);

		} catch (Exception e) {
			System.out.println("Greska! izbrojRecenice" + e.getMessage());
		}

	}

	public static void upisiUFile(String zaUpisati) throws FileNotFoundException {

		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(
					new FileWriter("C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\upisistring.txt")));

			pw.print(zaUpisati);
			pw.close();

		} catch (Exception e) {
			System.out.println("Greska! upisiUFile" + e.getMessage());
		}
	}

	public static void upisiUFileSamoReciSaViseOd5Slova(String zaUpisati) throws FileNotFoundException {

		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(
					new FileWriter("C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\upisistring.txt")));
			String[] nizReci = zaUpisati.split(" ");
			for (int i = 0; i < nizReci.length; i++)
				if (nizReci[i].length() > 5)
					pw.print(nizReci[i] + " ");
			pw.close();

		} catch (Exception e) {
			System.out.println("Greska! upisiUFileSamoReciSaViseOd5Slova" + e.getMessage());
		}
	}

	public static void upisiUFileSamoReciKojePocinjuVelikimA(String zaUpisati) throws FileNotFoundException {

		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\upisistringpocinjevelikimA.txt")));
			String[] nizReci = zaUpisati.split(" ");
			for (int i = 0; i < nizReci.length; i++)
				if (nizReci[i].startsWith("A"))
					pw.print(nizReci[i] + " ");
			pw.close();

		} catch (Exception e) {
			System.out.println("Greska! upisiUFileSamoReciKojePocinjuVelikimA" + e.getMessage());
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ucitajText();
		ucitajIzFileaIzParametra(
				"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\ucitajIzFileaIzParametra.txt");
		izbrojReciUfajlu();
		if (nadjiRecUfajlu("sanja"))
			System.out.println("Rec 'sanja' se nalazi u tekstu.");
		else
			System.out.println("Rec 'sanja' se ne nalazi u tekstu.");

		izbrojRecenice("C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\izbrojrecenice.txt");
		upisiUFile("Upisi u file text");
		upisiUFileSamoReciSaViseOd5Slova(
				"U file upisi samo reci sa vise od pet slova. Do sada nisam imala nijednu tako dugu rec, kao sto je Rampapilovicperlolamatipikovski :-)");
		upisiUFileSamoReciKojePocinjuVelikimA(
				"Ahmed, aladin, ako videcemo da li ce biti Alal. Anita Antonije Anja AnaMarija");
	}

}
