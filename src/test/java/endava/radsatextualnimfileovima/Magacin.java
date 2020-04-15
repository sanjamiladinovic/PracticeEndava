package endava.radsatextualnimfileovima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.LinkedList;

public class Magacin {

	private LinkedList<Proizvod> proizvodi;

	public Magacin() {

		proizvodi = new LinkedList<Proizvod>();
	}

	public void ucitajProizvode() throws IOException {
		try {
			BufferedReader in = new BufferedReader(
					new FileReader("C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\proizvodi.txt"));

			boolean kraj = false;

			while (!kraj) {
				String ucitaj = in.readLine();
				if (ucitaj == null)
					kraj = true;
				else {

					Proizvod p = new Proizvod();
					DecimalFormat df = new DecimalFormat("0000");
					// String sifra = df.format(ucitaj.substring(0, ucitaj.indexOf(' ')));

					String sifra = ucitaj.substring(0, ucitaj.indexOf(' '));
					String proizvodNaziv = ucitaj.substring(ucitaj.indexOf(' ') + 1, ucitaj.lastIndexOf(' '));
					String kolicina = ucitaj.substring(ucitaj.lastIndexOf(' ') + 1, ucitaj.length());

					p.setSifra(Integer.parseInt(sifra));
					p.setNaziv(proizvodNaziv);
					p.setKolicina(Integer.parseInt(kolicina));

					if (!(proizvodi.contains(p)))
						proizvodi.add(p);

				}
			}

			System.out.println(proizvodi);
			in.close();
		} catch (

		Exception e) {
			System.out.println("Greska! ucitajProizvode" + e.getMessage());

		}

	}

	// listazanabavku

	public void listaNabavke() throws IOException {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(
					new FileWriter("C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\listazanabavku.txt")));
			int rb = 1;
			for (int i = 0; i < proizvodi.size(); i++) {

				if (proizvodi.get(i).getKolicina() < 5) {

					out.println(rb + ". " + proizvodi.get(i));

					rb++;
				}
			}
			out.close();
		} catch (Exception e) {
			System.out.println("Greska! listaNabavke" + e.getMessage());
		}

	}

	// dopuna
	public void dopuniIzFajla() {
		try {
			BufferedReader in = new BufferedReader(
					new FileReader("C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\dopuna.txt"));
			boolean kraj = false;
			while (!kraj) {
				String ucitaj = in.readLine();
				if (ucitaj == null)
					kraj = true;
				else {
					Proizvod p = new Proizvod();
					String sifra = ucitaj.substring(0, ucitaj.indexOf(' '));
					String nazivProizvoda = ucitaj.substring(ucitaj.indexOf(' ') + 1, ucitaj.lastIndexOf(' '));
					String kolicina = ucitaj.substring(ucitaj.lastIndexOf(' ') + 1);
					p.setSifra(Integer.parseInt(sifra));
					p.setNaziv(nazivProizvoda);
					p.setKolicina(Integer.parseInt(kolicina));
					for (int i = 0; i < proizvodi.size(); i++)
					if (proizvodi.contains(p)) {
						Proizvod stariProizvod = proizvodi.get(proizvodi.indexOf(p));// ovaj deo ne razumem zasto se
																						// ovako uzima stari
																						// proizvod, a ne uz pomoc
																						// for petlje pa iz liste
						stariProizvod.setKolicina(stariProizvod.getKolicina() + p.getKolicina());
					} else
						proizvodi.add(p);
				}
			}
			System.out.println(proizvodi);
			in.close();
		} catch (Exception e) {
			System.out.println("Greska! listaNabavke" + e.getMessage());
		}
	}

	public void ispisi() {
		for (int i = 0; i < proizvodi.size(); i++)
			System.out.println(proizvodi.get(i));

	}
}
