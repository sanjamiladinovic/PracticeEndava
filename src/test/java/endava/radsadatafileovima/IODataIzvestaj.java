package endava.radsadatafileovima;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODataIzvestaj {

	public static void upisiGradoveIUdaljenostOdBGUFile() {

		try {
			DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\gradoviiudaljenost.out")));

			int udaljenostKm;
			String grad;
			out.writeUTF("Kragujevac");
			out.writeChar('\t');
			out.writeInt(115);
			out.writeChar('\n');
			out.writeUTF("Nis");
			out.writeChar('\t');
			out.writeInt(239);
			out.writeChar('\n');
			out.writeUTF("Novi Sad");
			out.writeChar('\t');
			out.writeInt(82);
			out.writeChar('\n');
			out.writeUTF("Uzice");
			out.writeChar('\t');
			out.writeInt(204);
			out.writeChar('\n');

			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Greska! ispisiTezinuBokseraINajtezeg " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void ucitajGradoveIUdaljenostOdBGUFileINajudaljeniji() throws IOException {
		try {
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\gradoviiudaljenost.out")));
			int maxKm = 0;
			String maxGrad = "";
			while (dis.available() != 0) {
				String grad = dis.readUTF();
				dis.readChar();
				int ucitajKm = dis.readInt();
				dis.readChar();
				if (ucitajKm > maxKm) {
					maxKm = ucitajKm;
					maxGrad = grad;
				}
				System.out.println(grad + " " + ucitajKm);

			}
			System.out.println("Najudaljeniji grad je: " + maxGrad + " Udaljen je kilometara: " + maxKm);
			dis.close();

			dis.close();
		} catch (Exception e) {
			System.out.println("Greska! ucitajRealneBrojeve " + e.getMessage());
		}
	}

	public static void upisiPodatkeODrzavama() {
		try {
			DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\drzave.out")));

			out.writeUTF("Austrija");
			out.writeChar('\t');
			out.writeDouble(83858.02);
			out.writeChar('\t');
			out.writeInt(8150835);
			out.writeChar('\n');

			out.writeUTF("Francuska");
			out.writeChar('\t');
			out.writeDouble(547030.7);
			out.writeChar('\t');
			out.writeInt(60180529);
			out.writeChar('\n');

			out.writeUTF("Nemacka");
			out.writeChar('\t');
			out.writeDouble(357022.2);
			out.writeChar('\t');
			out.writeInt(83251850);
			out.writeChar('\n');

			out.writeUTF("Grcka");
			out.writeChar('\t');
			out.writeDouble(131940.0);
			out.writeChar('\t');
			out.writeInt(10964020);
			out.writeChar('\n');

			out.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Greska! upisiPodatkeODrzavama " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void ucitajDrzaveNajmanjaPovrsinaNajviseStanovnika() {
		try {
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\drzave.out")));
			String najmanjaDrzavaPovrsina = "";
			double najmanjaPovrsina = 9999999999.9;

			int najviseStanovnika = 0;
			String najviseStanovnikaDrzava = "";
			while (dis.available() != 0) {

				String drzava = dis.readUTF();
				dis.readChar();
				double povrsina = dis.readDouble();
				dis.readChar();
				int brStanovnika = dis.readInt();
				dis.readChar();

				if (najmanjaPovrsina > povrsina) {
					najmanjaPovrsina = povrsina;
					najmanjaDrzavaPovrsina = drzava;
				}
				if (najviseStanovnika < brStanovnika) {
					najviseStanovnika = brStanovnika;
					najviseStanovnikaDrzava = drzava;
				}

			}
			System.out.println("Najmanja povrsina drzava: " + najmanjaDrzavaPovrsina
					+ " Drzava sa najvise stanovinika: " + najviseStanovnikaDrzava);
			dis.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Greska! upisiPodatkeODrzavama " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void upisiPodatkeOProizvodima() {
		try {
			DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\skladiste.out")));

			out.writeUTF("LAPTOP");
			out.writeChar('\t');
			out.writeUTF("IBM THINKPAD");
			out.writeChar('\t');
			out.writeInt(12);
			out.writeChar('\n');

			out.writeUTF("RACUNAR");
			out.writeChar('\t');
			out.writeUTF("JUGODATA A 400");
			out.writeChar('\t');
			out.writeInt(3);
			out.writeChar('\n');

			out.writeUTF("LAPTOP");
			out.writeChar('\t');
			out.writeUTF("TOSHIBA A 200");
			out.writeChar('\t');
			out.writeInt(0);
			out.writeChar('\n');

			out.writeUTF("STAMPAC");
			out.writeChar('\t');
			out.writeUTF("HP DESKJET 845C");
			out.writeChar('\t');
			out.writeInt(5);
			out.writeChar('\n');

			out.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Greska! upisiPodatkeOProizvodima " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void ucitajArtikleLaptopSaKolicinom() {

		try {
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\skladiste.out")));

			while (dis.available() != 0) {
				String kategorija = dis.readUTF();
				dis.readChar();
				String naziv = dis.readUTF();
				dis.readChar();
				int kolicina = dis.readInt();
				dis.readChar();
				if (kategorija.equalsIgnoreCase("laptop") && kolicina > 0)
					System.out.println("Model: " + naziv + ", trenutna kolicina: " + kolicina);

			}
			dis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block

			System.out.println("Greska! ucitajArtikleLaptopSaKolicinom " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		upisiGradoveIUdaljenostOdBGUFile();
		ucitajGradoveIUdaljenostOdBGUFileINajudaljeniji();
		upisiPodatkeODrzavama();
		ucitajDrzaveNajmanjaPovrsinaNajviseStanovnika();
		upisiPodatkeOProizvodima();
		ucitajArtikleLaptopSaKolicinom();
	}

}
