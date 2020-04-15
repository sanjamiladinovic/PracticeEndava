package endava.serijalizacija;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class Grupa {

	private static LinkedList<Osoba> clanovi = new LinkedList<Osoba>();

	public static void popuniListu(Osoba o) {
		clanovi.add(o);

	}

	public static void serijalizacija() {
		try {
			ObjectOutputStream dos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\grupa.out")));
			for (int i = 0; i < clanovi.size(); i++)
				dos.writeObject(clanovi.get(i));
			dos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void deserijalizacija() throws IOException, ClassNotFoundException {
		try {
			ObjectInputStream dis = new ObjectInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\grupa.out")));
			clanovi.clear();

			try {
				while (true) {

					Osoba o = (Osoba) (dis.readObject());
					clanovi.add(o);

				}
			} catch (EOFException e) {
				// TODO Auto-generated catch block
				dis.close();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Greska deserijalizacija " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		Osoba o = new Osoba();
		o.setIme("Sanja");
		o.setPrezime("Miladinovic");

		Osoba o1 = new Osoba();
		o.setIme("Igor");
		o.setPrezime("Petkovic");
		popuniListu(o);
		popuniListu(o1);
		serijalizacija();
		deserijalizacija();
		System.out.println(clanovi);

	}

}
