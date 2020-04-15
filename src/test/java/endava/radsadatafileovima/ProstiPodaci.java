package endava.radsadatafileovima;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;

public class ProstiPodaci {

	public static void upisiRealneBrojeve() throws IOException {
		try {
			DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\realnibrojevi.out")));

			out.writeDouble(12.12);
			out.writeDouble(1.01);
			out.writeDouble(55.55);
			out.writeDouble(0.12);
			out.writeDouble(50.0);
			out.writeDouble(25.0);
			out.close();
		} catch (Exception e) {
			System.out.println("Greska! upisiRealneBrojeve " + e.getMessage());
		}
	}

	public static void ucitajRealneBrojeve() throws IOException {
		try {
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\realnibrojevi.out")));

			while (dis.available() != 0) {

				System.out.println(dis.readDouble());

			}

			dis.close();
		} catch (Exception e) {
			System.out.println("Greska! ucitajRealneBrojeve " + e.getMessage());
		}
	}

	public static void upisiVisinuKosarkasa(int[] visina) throws IOException {
		try {
			DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\visina.out")));

			for (int i = 0; i < visina.length; i++)
				out.writeInt(visina[i]);

			out.close();
		} catch (Exception e) {

			System.out.println("Greska! upisiVisinuKosarkasa " + e.getMessage());
		}

	}

	public static void ucitajVisinuKosarkasa() throws IOException {
		try {
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\visina.out")));
			double suma = 0;
			int brojKosarkasa = 0;
			System.out.print("Visina kosarkasa je: ");
			while (dis.available() != 0) {
				int ucitaj = dis.readInt();
				suma = suma + ucitaj;

				brojKosarkasa++;

				System.out.println(ucitaj + " ");
			}
			double prosek = suma / brojKosarkasa;
			System.out.println("Prosecna visina kosarkasa je: " + prosek);
			dis.close();
		} catch (Exception e) {
			System.out.println("Greska! ucitajVisinuKosarkasa " + e.getMessage());
		}
	}

	public static void upisiTezinuBoksera(double[] tezina) throws IOException {
		try {
			DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\tezina.out")));

			for (int i = 0; i < tezina.length; i++) {
				out.writeDouble(tezina[i]);
				out.writeChar('\n');
			}

			out.close();
		} catch (Exception e) {

			System.out.println("Greska! upisiTezinuBoksera " + e.getMessage());
		}

	}

	public static void ispisiTezinuBokseraINajtezeg() {
		try {
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\tezina.out")));
			double maxTezina = 0;
			while (dis.available() != 0) {
				double ucitajTezinu = dis.readDouble();

				if (maxTezina < ucitajTezinu)
					maxTezina = ucitajTezinu;

				System.out.println(ucitajTezinu);
				dis.readChar();
			}
			System.out.println("Max tezina boxera je: " + maxTezina);
			dis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Greska! ispisiTezinuBokseraINajtezeg " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void upisiNaziveProizvoda(String[] naziv) {
		try {
			DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\nazivproizvoda.out")));

			for (int i = 0; i < naziv.length; i++) {
				dos.writeUTF(naziv[i]);
				//System.out.print("\t");
			}
			dos.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Greska! DataOutputStream " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void ispisiProizvode() {

		try {
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\nazivproizvoda.out")));

			while (dis.available() != 0) {
				String ucitaj=dis.readUTF();
				System.out.println(ucitaj);
				//dis.readChar();
			}
			dis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Greska! DataOutputStream " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		upisiRealneBrojeve();
		ucitajRealneBrojeve();

		int[] visine = new int[3];
		visine[0] = 203;
		visine[1] = 204;
		visine[2] = 200;
		upisiVisinuKosarkasa(visine);
		ucitajVisinuKosarkasa();
		double[] tezina = new double[3];
		tezina[0] = 89.8;
		tezina[1] = 70.7;
		tezina[2] = 99.1;

		upisiTezinuBoksera(tezina);
		ispisiTezinuBokseraINajtezeg();

		String[] nizProizvoda = new String[3];
		nizProizvoda[0] = "Nivea krema";
		nizProizvoda[1] = "Vata";
		nizProizvoda[2] = "Dezedorans";
		upisiNaziveProizvoda(nizProizvoda);
		ispisiProizvode();
	}

}
