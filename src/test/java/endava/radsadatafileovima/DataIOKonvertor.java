package endava.radsadatafileovima;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataIOKonvertor {

	public static void unesiTemperaturuGradovaUFile() {

		// temperatura_c

		try {
			DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\temperatura_c.out")));

			Scanner sc = new Scanner(System.in);

			boolean kraj = false;
			while (!kraj) {
				System.out.println("Unesite ime grada: ");
				String imeGrada = sc.nextLine();
				System.out.println("Unesite temperaturu u celzijusima: ");
				double temperatura = sc.nextDouble();

				out.writeUTF(imeGrada);
				out.writeChar('\t');
				out.writeDouble(temperatura);
				out.writeChar('\n');

				System.out.println("Da li zelite da unesete podatke o jos jednom gradu? DA/NE");
				sc.nextLine();
				if (!(sc.nextLine().equalsIgnoreCase("da")))
					kraj = true;
			}
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block

			System.out.println("Greska! upisiPodatkeOProizvodima " + e.getMessage());
			e.printStackTrace();
		}

	}

	// temperatura_f
	public static void temperaturaUpisUFUFile() {

		try {
			DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\temperatura_f.out")));

			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\temperatura_c.out")));

			while (dis.available() != 0) {
				String grad = dis.readUTF();
				dis.readChar();
				double temperaturaC = dis.readDouble();
				dis.readChar();

				double temperaturaF = ((9 / 5) * temperaturaC) + 32;
				out.writeUTF(grad);
				out.writeChar('\t');
				out.writeDouble(temperaturaF);
				out.writeChar('\n');
			}
			dis.close();
			out.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Greska! upisiPodatkeOProizvodima " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void ispisiGradoveITemperaturu() {
		try {
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\temperatura_f.out")));

			while (dis.available() != 0) {
				String grad = dis.readUTF();
				dis.readChar();
				double temperaturaF = dis.readDouble();
				dis.readChar();

				System.out.println("Grad: " + grad + " TemperaturaF: " + temperaturaF);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Greska! ispisiGradoveITemperaturu " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void zaposleniMere() throws IOException {

		try {
			DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\mere.out")));
			boolean kraj = false;
			Scanner sc = new Scanner(System.in);

			while (!kraj) {
				System.out.println("Unesi ime i prezime zaposlenog: ");
				String imePrezime = sc.nextLine();
				dos.writeUTF(imePrezime);
				dos.writeChar('\t');

				System.out.println("Unesi visinu: ");
				double visina = Double.parseDouble(sc.nextLine());
				dos.writeDouble(visina);
				dos.writeChar('\t');

				System.out.println("Unesi tezinu: ");
				double tezina = Double.parseDouble(sc.nextLine());
				dos.writeDouble(tezina);
				dos.writeChar('\n');

				System.out.println("Da li zelite da upisete podatke o jos jednom zaposlenom? (DA/NE)");
				if (!(sc.nextLine().equalsIgnoreCase("da")))
					kraj = true;

			}
			dos.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Greska! zaposleniMere " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void ucitajPodatkeIzFileaUFileUDrugojJM() {

		try {
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\mere.out")));

			DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\mere2.out")));
			while (dis.available() != 0) {
				String ime = dis.readUTF();
				dis.readChar();
				double visina = dis.readDouble();
				dis.readChar();
				double tezina = dis.readDouble();
				dis.readChar();

				dos.writeUTF(ime);
				dos.writeChar('\t');
				double visinaStope = visina / 32.81;
				dos.writeDouble(visinaStope);
				dos.writeChar('\t');
				double tezinaFunte = tezina / 0.4536;
				dos.writeDouble(tezinaFunte);
				dos.writeChar('\n');

			}
			dis.close();
			dos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Greska! ucitajPodatkeIzFileaUFileUDrugojJM " + e.getMessage());
			e.printStackTrace();
		}
		// System.out.println("izlaz");
	}

	public static void ispisiMereZaposlenogNaEkranu() throws IOException {

		try {
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\mere2.out")));

			while (dis.available() != 0) {
				String ime = dis.readUTF();
				dis.readChar();
				double visina = dis.readDouble();
				dis.readChar();
				double tezina = dis.readDouble();
				dis.readChar();

				System.out.println("Ime i prezime zaposlenog: " + ime + " Visina zaposlenog u stopama: " + visina
						+ " Tezina zaposlenog u funtama: " + tezina);

			}
			dis.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Greska! ispisiMereZaposlenogNaEkranu " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		unesiTemperaturuGradovaUFile();
//		temperaturaUpisUFUFile();
//		ispisiGradoveITemperaturu();
//		zaposleniMere();
//		ucitajPodatkeIzFileaUFileUDrugojJM();
		ispisiMereZaposlenogNaEkranu();
	}

}
