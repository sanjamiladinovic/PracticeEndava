package endava.radsadatafileovima;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataFileIO {

	public static void upisiCeleBrojeveUFile() {

		try {
			DataOutputStream das = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\brojevi.out")));

			das.writeInt(45);
			das.writeChar('\n');
			das.writeInt(56);
			das.writeChar('\n');
			das.writeInt(67);
			das.writeChar('\n');
			das.writeInt(78);
			das.writeChar('\n');
			das.writeInt(89);
			das.writeChar('\n');

			das.close();
		} catch (Exception e) {

			System.out.println("Greska! upisiCeleBrojeveUFile" + e.getMessage());

		}

	}

	public static void ucitajIzFileaCeleBrIIzrSumu() throws IOException {
		try {
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\brojevi.out")));
			int suma = 0;
			while (dis.available() != 0) {
				suma = suma + dis.readInt();
				dis.readChar();
			}
			System.out.println("Suma brojeva je: " + suma);
			dis.close();
		} catch (Exception e) {
			System.out.println("Greska! ucitajIzFileaCeleBrIIzrSumu" + e.getMessage());
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		upisiCeleBrojeveUFile();
		ucitajIzFileaCeleBrIIzrSumu();
	}

}
