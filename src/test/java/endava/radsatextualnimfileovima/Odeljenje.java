package endava.radsatextualnimfileovima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class Odeljenje {

	private LinkedList<Djak> djaci = new LinkedList<Djak>();

	public void ucitajIzFajla() throws IOException {

		try {
			BufferedReader in = new BufferedReader(
					new FileReader("C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\djaci.txt"));

			boolean kraj = false;

			while (!kraj) {
				String ucitaj = in.readLine();
				if (ucitaj == null)
					kraj = true;
				else {
					Djak dj = new Djak();
					String ime = ucitaj.substring(0, ucitaj.indexOf(' '));
					String prezime = ucitaj.substring(ucitaj.indexOf(' ') + 1, ucitaj.lastIndexOf(' '));
					String ocena = ucitaj.substring(ucitaj.lastIndexOf(' ') + 1);

					dj.setIme(ime);
					dj.setPrezime(prezime);
					dj.setOcena(Integer.parseInt(ocena));

					if (!djaci.contains(dj)) {

						djaci.add(dj);
					}
				}

			}
			in.close();
			
		} catch (Exception e) {
			System.out.println("Greska! ucitajIzFajla" + e.getMessage());
			e.printStackTrace();

		}
	}

	public void odlicniDjaci() throws IOException {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(
					new FileWriter("C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\odlicnidjaci.txt")));

			for (int i = 0; i < djaci.size(); i++)
				if (djaci.get(i).getOcena() == 10)
					out.println(djaci.get(i) + "  ");
			out.close();
		} catch (Exception e) {
			System.out.println("Greska! odlicniDjaci" + e.getMessage());

		}
	}
	public void losiDjaci() throws IOException {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(
					new FileWriter("C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\losidjaci.txt")));

			for (int i = 0; i < djaci.size(); i++)
				if (djaci.get(i).getOcena() == 5 || djaci.get(i).getOcena() == 6)
					out.println(djaci.get(i) + "  ");
			out.close();
		} catch (Exception e) {
			System.out.println("Greska! losiDjaci" + e.getMessage());

		}
	}
	
	public void ispisiSveODjacima() {
		
		for(int i=0;i<djaci.size();i++)
			System.out.println(djaci.get(i));
		
		
	}

}
