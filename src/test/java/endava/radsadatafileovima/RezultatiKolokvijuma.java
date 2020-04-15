package endava.radsadatafileovima;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.LinkedList;

public class RezultatiKolokvijuma {
	static LinkedList<Student> studenti = new LinkedList<Student>();

	public static void unesiStudenta(String imePrezime, double brojPoena) {
		Student stud = new Student();
		stud.setImePrezime(imePrezime);
		stud.setBrojPoena(brojPoena);

		studenti.add(stud);

	}

	public static void upisiStudenteUFileStudenti() {

		// studenti

		try {
			DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\studenti.out")));
			for (int i = 0; i < studenti.size(); i++) {
				dos.writeUTF(studenti.get(i).getImePrezime());
				dos.writeChar('\t');
				dos.writeDouble(studenti.get(i).getBrojPoena());
				dos.writeChar('\n');

			}
			dos.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block

			System.out.println("Greska! upisiStudenteUFileStudenti " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void upisiStudenteUListuIzFilea() {
		try {
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\studenti.out")));
			studenti.clear();
			while (dis.available() != 0) {
				String imePrezime = dis.readUTF();
				dis.readChar();
				double brojPoena = dis.readDouble();
				dis.readChar();

				Student s = new Student();
				s.setImePrezime(imePrezime);
				s.setBrojPoena(brojPoena);
				studenti.add(s);

			}
			dis.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block

			System.out.println("Greska! upisiStudenteUListuIzFilea " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static double prosecniPoeniNaKolokvijumu() {

		double sumaPoena = 0;

		for (int i = 0; i < studenti.size(); i++)

			sumaPoena = sumaPoena + studenti.get(i).getBrojPoena();

		return sumaPoena / studenti.size();
	}

	public static void ispisiStudenteSa100Poena() {
		for (int i = 0; i < studenti.size(); i++)

			if (studenti.get(i).getBrojPoena() == 100)
				System.out.println(studenti.get(i));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unesiStudenta("Sanja Miladinovic", 100);
		unesiStudenta("Marko Miladinovic", 91);
		upisiStudenteUFileStudenti();
		upisiStudenteUListuIzFilea();
		System.out.println(studenti);
		System.out.println("Prosecan broj poena studenata na kolokvijumu je: " + prosecniPoeniNaKolokvijumu());
		ispisiStudenteSa100Poena();

	}

}
