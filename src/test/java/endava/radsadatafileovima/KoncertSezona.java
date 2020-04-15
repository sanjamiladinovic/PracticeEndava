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

public class KoncertSezona {

	static LinkedList<Koncert> koncerti = new LinkedList<Koncert>();

	public static void napuniListu(String grad, String bend) {

		Koncert k = new Koncert();
		k.setGrad(grad);
		k.setBend(bend);
		koncerti.add(k);

	}

	public static void upisiKoncerteUFile() {

		try {
			DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\koncerti.out")));
			for (int i = 0; i < koncerti.size(); i++) {

				dos.writeUTF(koncerti.get(i).getGrad());
				dos.writeChar('\t');
				dos.writeUTF(koncerti.get(i).getBend());
				dos.writeChar('\n');

			}
			dos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Greska! upisiKoncerteUFile " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void upisiKoncerteUFileKojiPocinjuSaB() {

		try {
			DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\koncerti2.out")));
			for (int i = 0; i < koncerti.size(); i++) {
				if (koncerti.get(i).getGrad().charAt(0) == 'B') {
					dos.writeUTF(koncerti.get(i).getGrad());
					dos.writeChar('\t');
					dos.writeUTF(koncerti.get(i).getBend());
					dos.writeChar('\n');
				}
			}
			dos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Greska! upisiKoncerteUFileKojiPocinjuSaB " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void upisiKoncerteIzFileaUListu() throws IOException {
		try {
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\koncerti.out")));
			koncerti.clear();
			while (dis.available() != 0) {
				String grad = dis.readUTF();
				dis.readChar();
				String bend = dis.readUTF();
				dis.readChar();
				Koncert k = new Koncert();
				k.setGrad(grad);
				k.setBend(bend);
				koncerti.add(k);
			}
			dis.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Greska! upisiKoncerteIzFileaUListu " + e.getMessage());

			e.printStackTrace();
		}

	}

	public static int brojKoncerataBenda(String bend) {

		int brojKoncerata = 0;
		for (int i = 0; i < koncerti.size(); i++)
			if (koncerti.get(i).getBend().equalsIgnoreCase(bend))
				brojKoncerata++;
		return brojKoncerata;

	}

	public static int brojKoncerataUGradu(String grad) {

		int brojKoncerata = 0;
		for (int i = 0; i < koncerti.size(); i++)
			if (koncerti.get(i).getGrad().equalsIgnoreCase(grad))
				brojKoncerata++;
		return brojKoncerata;

	}

	public static void brojKoncerataBenda() {

		int maxBrojKonc = 0;
		String maxBend = "";
		for (int i = 0; i < koncerti.size(); i++) {
			int brojKoncerata = brojKoncerataBenda(koncerti.get(i).getBend());

			if (brojKoncerata > maxBrojKonc)
				maxBrojKonc = brojKoncerata;
			maxBend = koncerti.get(i).getBend();
		}
		System.out.println("Bend koji je odrzao najvise koncerata je: " + maxBend
				+ " Broj koncerata koje je odrzao je: " + maxBrojKonc);

	}

	public static void brojKoncerataUGradu() {

		int maxBrojKonc = 0;
		String maxGrad = "";
		for (int i = 0; i < koncerti.size(); i++) {
			int brojKoncerata = brojKoncerataUGradu(koncerti.get(i).getGrad());

			if (brojKoncerata > maxBrojKonc)
				maxBrojKonc = brojKoncerata;
			maxGrad = koncerti.get(i).getGrad();
		}
		System.out.println("Grad u kome je odrzano najvise koncerata je: " + maxGrad
				+ " Broj koncerata koje je odrzan je: " + maxBrojKonc);

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		napuniListu("Beograd", "Tropico");
		napuniListu("Novi Sad", "Lexington");
		upisiKoncerteUFile();
		upisiKoncerteUFileKojiPocinjuSaB();
		upisiKoncerteIzFileaUListu();
		System.out.println(koncerti);
		System.out.println(brojKoncerataBenda("Tropico"));
		System.out.println(brojKoncerataUGradu("Beograd"));
		brojKoncerataBenda();
		brojKoncerataUGradu();
	}

}
