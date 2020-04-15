package endava.serijalizacija;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class IspitniRok {

	public static void upisiUFileSerijalizaciom(Student s) {
		try {
			ObjectOutputStream dos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\student1.out")));

			dos.writeObject(s);
			dos.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Greska! upisiUFileSerijalizaciom " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void upisiUFileSerijalizaciomSaTastature() {
		try {
			ObjectOutputStream dos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\student2.out")));

			Scanner sc = new Scanner(System.in);
			Student s = new Student();
			System.out.println("Upisi ime i prezime studenta: ");
			s.setImePrezime(sc.nextLine());
			System.out.println("Upisi broj poena: ");
			s.setBrojPoena(sc.nextInt());

			dos.writeObject(s);
			dos.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Greska! upisiUFileSerijalizaciomSaTastature " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void deserijalizacijaIzStudenti1UStudenti2() {
		try {
			ObjectInputStream dis1 = new ObjectInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\student1.out")));

			ObjectInputStream dis2 = new ObjectInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\student2.out")));

			Student s1 = (Student) (dis1.readObject());// Vraca objekat klase Object, pa je potrepno konvertovati u
														// klasu Student
			Student s2 = (Student) (dis2.readObject());
			System.out.println(s1);
			System.out.println(s2);
			dis1.close();
			dis2.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block

			System.out.println("Greska! deserijalizacijaIzStudenti1UStudenti2 " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void deserijalizacijaIzStudenti1UStudenti2IIspisProsecnihPoenaNaEkranu() {
		try {
			ObjectInputStream dis1 = new ObjectInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\student1.out")));

			ObjectInputStream dis2 = new ObjectInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\student2.out")));

			Student s1 = (Student) (dis1.readObject());// Vraca objekat klase Object, pa je potrepno konvertovati u
														// klasu Student
			Student s2 = (Student) (dis2.readObject());

			int prosekPoena = (s1.getPoeni() + s2.getPoeni()) / 2;

			System.out.println("Prosecan broj poena je: " + prosekPoena);

			dis1.close();
			dis2.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block

			System.out.println("Greska! deserijalizacijaIzStudenti1UStudenti2 " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		s.setImePrezime("Sanja Miladinovic");
		s.setBrojPoena(99);
		upisiUFileSerijalizaciom(s);
		Student s1 = new Student();
		s1.setImePrezime("Martina Miladinovic");
		s1.setBrojPoena(100);
		upisiUFileSerijalizaciom(s1);
		upisiUFileSerijalizaciomSaTastature();
		deserijalizacijaIzStudenti1UStudenti2();
		deserijalizacijaIzStudenti1UStudenti2IIspisProsecnihPoenaNaEkranu();

	}

}
