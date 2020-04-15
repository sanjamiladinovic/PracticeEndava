package endava.radsatextualnimfileovima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class IOAnalizatorTeksta {

	public static String ucitajPomocnaMetoda(String putanjaFilea) throws Exception {

		BufferedReader in = new BufferedReader(new FileReader(putanjaFilea));
		String ucitano = "";
		boolean kraj = false;
		while (!kraj) {
			String ucitaj = in.readLine();
			if (ucitaj == null)
				kraj = true;
			else
				ucitano = ucitano + ucitaj + " ";
		}
		in.close();
		return ucitano;

	}

	public static void ucitajIzFilea(String putanjaFilea) throws Exception {
		if (putanjaFilea == null)
			throw new Exception("Naziv filea ne moze biti null.");

		try {
			String ucitano = ucitajPomocnaMetoda(putanjaFilea);
			String[] nizUcitano = ucitano.split(" ");
			for (int i = 0; i < nizUcitano.length; i++)
				for (int j = 0; j < nizUcitano[i].length(); j++)
					System.out.print(nizUcitano[i].charAt(j) + " ");
			System.out.println();

		} catch (Exception e) {

			System.out.println("Greska! ucitajIzFilea " + e.getMessage());
		}
	}

	public static void ucitajIIspisi10ReciURedu(String putanjaFilea) throws Exception {
		if (putanjaFilea == null)
			throw new Exception("Naziv filea ne moze biti null.");

		String ucitano = ucitajPomocnaMetoda(
				"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\tekstzaucitavanje.txt");

		String[] nizUcitano = ucitano.split(" ");
		try {
			for (int i = 0; i < nizUcitano.length; i++)
				if ((i + 1) % 10 == 0)
					System.out.println(nizUcitano[i]);
				else
					System.out.print(nizUcitano[i] + " ");
		} catch (Exception e) {
			System.out.println("Greska! ucitajIIspisi10ReciURedu " + e.getMessage());
		}
	}

	public static void ucitajIIspisiReciDaImaju5Slova(String putanjaFilea) throws Exception {
		if (putanjaFilea == null)
			throw new Exception("Naziv filea ne moze biti null.");
		try {
			String ucitaj = ucitajPomocnaMetoda(putanjaFilea);

			String[] nizReci = ucitaj.split(" ");
			int duzinaReci;
			for (int i = 0; i < nizReci.length; i++) {
				duzinaReci = nizReci[i].length();

				if (duzinaReci == 5)
					System.out.println("Stara rec: " + nizReci[i] + " -> " + " Nova rec: " + nizReci[i]);
				else if (duzinaReci < 5) {
					String oRec = nizReci[i];
					String nRec = "";
					while (nRec.length() <= 5) {
						nRec = oRec + oRec.substring(oRec.length() - 1) + oRec.substring(oRec.length() - 1)
								+ oRec.substring(oRec.length() - 1) + oRec.substring(oRec.length() - 1)
								+ oRec.substring(oRec.length() - 1);

					}
					System.out.println("Stara rec: " + oRec + " -> " + " Nova rec: " + nRec.substring(0, 5));
				} else {
					String o1Rec = nizReci[i];
					String n1Rec = "";
					if (duzinaReci > 5)
						for (int j = 0; j < 5; j++)
							n1Rec = n1Rec + o1Rec.charAt(j);
					System.out.println("Stara rec: " + o1Rec + " -> " + " Nova rec: " + n1Rec);
				}
			}
		} catch (Exception e) {
			System.out.println("Greska! ucitajIIspisiReciDaImaju5Slova " + e.getMessage());
		}

	}

	public static int ucitajIIzbrojZadatuRec(String text, String rec) throws Exception {

		int brojac = 0;

		String[] nizText = text.split(" ");

		for (int i = 0; i < nizText.length; i++)
			if (nizText[i].equalsIgnoreCase(rec) || nizText[i].equalsIgnoreCase(rec + "."))
				brojac++;

		return brojac;
	}

	public static void ucitajIzFileaIUcitajUfile() throws Exception {
		try {
			String ucitano = ucitajPomocnaMetoda(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\tekstzaucitavanje.txt");

			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\samorecikojeseponavljaju.txt")));
			String[] nizUcitano = ucitano.split(" ");

			for (int i = 0; i < nizUcitano.length; i++) {
				ucitajIIzbrojZadatuRec(ucitano, nizUcitano[i]);
				out.print(nizUcitano[i] + " ");

				out.close();
			}
		} catch (Exception e) {
			System.out.println("Greska! ucitajIzFileaIUcitajUfile " + e.getMessage());
		}

	}

	public static void upisiStatistikuUIzvestaj() throws Exception {
		try {
			String ucitaj = ucitajPomocnaMetoda(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\tekstzaucitavanje.txt");
			PrintWriter out = new PrintWriter(new BufferedWriter(
					new FileWriter("C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\izvestaj.txt")));
			String[] nizUcitaj = ucitaj.split(" ");
			out.println("Ukupan broj reci: " + nizUcitaj.length + "\n");
			String najduzaRec = nizUcitaj[0];
			String najkracaRec = nizUcitaj[0];
			for (int i = 0; i < nizUcitaj.length; i++) {

				if (najduzaRec.length() < nizUcitaj[i].length())
					najduzaRec = nizUcitaj[i];
				if (najkracaRec.length() > nizUcitaj[i].length())
					najkracaRec = nizUcitaj[i];

			}

			out.println("Najduza rec: " + najduzaRec);
			out.println("Najkraca rec: " + najkracaRec);
			out.close();
		} catch (Exception e) {
			System.out.println("Greska! upisiStatistikuUIzvestaj " + e.getMessage());
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ucitajIIspisiReciDaImaju5Slova(
				"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\regulisirecina5slova.txt");
		upisiStatistikuUIzvestaj();
		ucitajIzFilea("C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\regulisirecina5slova.txt");
		ucitajIIspisi10ReciURedu("C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\upisistringpocinjevelikimA.txt");
		ucitajIzFileaIUcitajUfile();
		
	}

}
