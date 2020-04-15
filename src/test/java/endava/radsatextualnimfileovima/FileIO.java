package endava.radsatextualnimfileovima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIO {
	public static void ucitajIIspisi() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("tekstzaucitavanje.txt"));
			boolean kraj = false;
			String s = "";
			while (!kraj) {
				String pom = br.readLine();
				if (pom == null)
					kraj = true;
				else
					s = s + pom + " ";
			}
			br.close();
			System.out.println(s);

		} catch (Exception e) {
			System.out.println("Greska ucitajIIspisi: " + e.getMessage());
		}

	}

	public static void upisiUFileText() throws IOException {
		try {
			PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter("ucitajtext.txt")));
			write.println("Danas je lep dan.");
			write.println("Mozda ce temperatura biti iznad nule.");
			write.close();

		} catch (Exception e) {
			System.out.println("Greska upisiUFileText!" + e.getMessage());
		}
	}

	public static void main(String[] args) throws Exception {

		ucitajIIspisi();
		upisiUFileText();
	}
}
