package endava;

import java.util.Arrays;

public class Prvih100Brojeva {

	public static void main(StringVezba[] args) {
		// TODO Auto-generated method stub

		int broj;
		int rezultat = 0;

		for (broj = 1; broj <= 10; broj++) {

			rezultat = rezultat + broj;
		}
		System.out.println(rezultat);

// Zbir parnih brojeva

		int broj1;
		int rezultat1 = 0;

		for (broj1 = 0; broj1 <= 10; broj1 += 2) {

			rezultat1 += broj1;
		}
		System.out.println(rezultat1);

// Max broj, min broj u nizu i zbir niza
		int[] nizBrojeva = { 1, 2, 3, 4 };
		int max = Arrays.stream(nizBrojeva).max().getAsInt();
		int min = Arrays.stream(nizBrojeva).min().getAsInt();
		System.out.println("Max broj: " + max);
		System.out.println("Min broj: " + min);

		int sum = 0;
		for (int num : nizBrojeva) {

			sum = sum + num;

		}
		System.out.println("Zbir niza: " + sum);
//POKUSAJ ISPISIVANJA 100 BROJEVA
		int[] nizBrojeva1 = new int[100];
		for (int a = 0; a < nizBrojeva1.length; a++) {
			nizBrojeva1[a] = (a + 1) * 10;
			int max1 = Arrays.stream(nizBrojeva1).max().getAsInt();

		}

// PAMETNO ISPISIVANJE VISE PUTA
		// System.out.println(max1);
		int i = 0;
		while (i < 5) {
			System.out.println("Sanja je car");
			i++;
		}
	}

}
