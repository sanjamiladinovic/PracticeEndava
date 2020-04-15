package endava.serijalizacija;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class BazaMotocikala {

	private static LinkedList<Motocikl> motocikli;

	public BazaMotocikala() {

		motocikli = new LinkedList<Motocikl>();

	}

	public static void unesiUBazu(Motocikl m) {

		if (m == null)
			throw new RuntimeException("Objekat ne moze biti null.");
		if (motocikli.contains(m))
			throw new RuntimeException("Motocikl sa tim karakteristikama vec u listi.");
		motocikli.add(m);

	}

	public static void serijalizuj() {

		try {
			ObjectOutputStream dos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\motocikli.out")));

			for (int i = 0; i < motocikli.size(); i++)
				dos.writeObject(motocikli.get(i));
			dos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void deserijalizacijaIzFilea() throws ClassNotFoundException {

		try {
			ObjectInputStream dis = new ObjectInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\motocikli.out")));
			motocikli.clear();
			try {
				while (true) {

					
					motocikli.add((Motocikl) dis.readObject());
				}
			} catch (EOFException e) {

				dis.close();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void ispisiSveOMotociklima() {

		for (int i = 0; i < motocikli.size(); i++)
			System.out.println(motocikli.get(i));

	}

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		BazaMotocikala baza = new BazaMotocikala();
		Motocikl m = new Motocikl();
		m.setMarka("Kawasaki");
		m.setModel("GD5570");
		m.setKubikaza(8000);
		// System.out.println(motocikli);
		unesiUBazu(m);

		serijalizuj();
		deserijalizacijaIzFilea();
		ispisiSveOMotociklima();

	}

}
