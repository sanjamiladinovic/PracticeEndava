package endava;

import java.util.Random;
import java.util.Scanner;

public class ZadaciDusan {

//POVRSINA KRUGA
	// double pi = 3.14159;
	double r = 5.5;
	static double povrsina;

	public double povrsinaKruga() {

		double povrsina = r * r * Math.PI;
		return povrsina;

	}

//POVRSINA PRAVOUGAONIKA
	public double povrsinaPravougaonika(double a, double b) {
		double povrsinaPravougaonika = a * b;
		return povrsinaPravougaonika;
	}

//Provera da li je broj neparan
	public void checkIfNumIsodd() {
		int num = 21;
		if (num % 2 != 0) {
			// Neka postane paran
			num += 1;

			System.out.println("Broj 21 je neparan i postace paran: " + num);
		}
	}

//Koriscenje klase Random za mesece

//	public void brojDanaUMesecu() {

	public void scannerObjectInputText() {

		// String input
//		String name = myObj.nextLine();
//		int age = myObj.nextInt();
//		double salary = myObj.nextDouble();
		// Output input by user
//		System.out.println("Name: " + name);
//		System.out.println("Age: " + age);
//		System.out.println("Salary: " + salary);
	}

	public static void main(StringVezba[] args) {
		// TODO Auto-generated method stub

		ZadaciDusan zd = new ZadaciDusan();

		System.out.println("Povrsina kruga: " + zd.povrsinaKruga());

		System.out.println("Povrsina pravougaonika: " + zd.povrsinaPravougaonika(7.9, 4.5));
//SCANNER OBJECT
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter username: ");
		String userName = myObj.nextLine();
		System.out.println("Username is: " + userName);

		int a = 101; // decimal-form literal
		int b = 0100; // octal-form literal
		int c = 0xFace; // Hexa-decimal form literal
		// int d = 0b1111; // Binary literal
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		// System.out.println(d);

		String ime = "Sanja";
		System.out.println(ime += " Miladinovic");

		zd.checkIfNumIsodd();
//SCANNER OBJECT MESECI
		Scanner enter = new Scanner(System.in);
		System.out.println("Enter month number: ");
		int myManthNum = enter.nextInt();
		System.out.println("Enter year number: ");
		int myYearNum = enter.nextInt();
//		System.out.println("Broj dana je: "+"");
//		Random rand = new Random();
//		int brojDana;
//		int year = 0;
//		int randomManth = rand.nextInt(12) + 1;// zato sto krece od 0 i da bi bilo 12 mora da se doda 1
//		switch (randomManth) {
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12: {
//
//			System.out.println(brojDana = 31);
//			break;
//		}
//
//		case 4:
//		case 6:
//		case 9:
//		case 11: {
//
//			System.out.println(brojDana = 30);
//			break;
//		}
//		case 2: {
//
//			if (year % 4 == 0) {
//				System.out.println(brojDana = 29);
//			} else {
//				System.out.println(brojDana = 28);
//			}
//			break;
//
//		}
		


		// LOTO BROJ, prezentacija 1, zadatak 1
		Scanner upisiBroj = new Scanner(System.in);
		System.out.println("Enter loto num: ");
		int myNum = upisiBroj.nextInt();
		Random r = new Random();
		int randomBroj = r.nextInt(50) + 1;
		System.out.println("Loto broj je: " + randomBroj);
		if (myNum == randomBroj) {
			System.out.println("Neverovatno! Pogodili ste tacan broj!");
		}

		else if (Math.abs(myNum - randomBroj) <= 5) {
			System.out.println("Dobar pokusaj, bili ste jako blizu!");
		} else

			System.out.println("Vise srece sledeci put...");

		// DIGITRON, prezentacija 1, zadatak 2
		Scanner upisiBroj1 = new Scanner(System.in);
		System.out.println("Upisi prvi broj: ");
		int myNum1 = upisiBroj1.nextInt();
		System.out.println("Upisi drugi broj: ");
		int myNum2 = upisiBroj1.nextInt();
		System.out.println("Unesi kod operacije(s||o||m||d)");
		char code = upisiBroj1.next().charAt(0);
		switch (code) {
		case 's': {

			int sum = myNum1 + myNum2;
			System.out.println("Rezultat sabiranja dva broja je: " + sum);
		}
		case 'o': {
			int substract = myNum1 - myNum2;
			System.out.println("Rezultat oduzimanja dva broja je: " + substract);
		}
		case 'm': {
			int multip = myNum1 * myNum2;
			System.out.println("Rezultat mnozenja dva broja je: " + multip);
		}
		case 'd': {
			int div = myNum1 / myNum2;
			System.out.println("Rezultat deljenja dva broja je: " + div);
		}

		}

	}

}
