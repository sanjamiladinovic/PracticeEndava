package endava.ucitavanjesatastature;

import java.util.Scanner;

public class NizDouble {

	private double[] nizRealnihBr;

	public void ucitajSaTastature() throws Exception {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Unesi kapacitet: ");
			int kapacitet = sc.nextInt();
			if (kapacitet <= 0)
				throw new Exception("Greska, niz nije inicijalizovan.");
			else {

				nizRealnihBr = new double[kapacitet];
			}
		} catch (Exception e) {
			System.out.println("Greska pri unosu kapaciteta, mora biti veci od 0." + e.getMessage());
		}

	}

	public void ucitajSaTastatureElementeNiza() throws Exception {
		Scanner sc = new Scanner(System.in);
		if (nizRealnihBr == null)
			throw new Exception("Greska, niz nije inicijalizovan.");

		else {
			try {
				for (int i = 0; i < nizRealnihBr.length; i++) {
					System.out.println("Unesi " + i + " elemente niza. ");
					double broj = sc.nextDouble();

					nizRealnihBr[i] = broj;
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public double sumaDoubleNiza() throws Exception {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
	
		if (nizRealnihBr == null)
			throw new Exception("Greska, niz nije inicijalizovan.");
		else
			for (int i = 0; i < nizRealnihBr.length; i++)
				sum = sum + nizRealnihBr[i];
		System.out.print("Suma niza je: ");
		return sum;
	}

}
