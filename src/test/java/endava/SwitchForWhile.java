package endava;

public class SwitchForWhile {

	static void desifrujDNK(char nukleotid) {

		switch (nukleotid) {
		case 'A':
			System.out.println("Nukleotid je ADENIN.");
			break;
		case 'C':
			System.out.println("Nukleotid je CITOZIN");
			break;
		case 'G':
			System.out.println("Nukleotid je GUANIN");
			break;
		case 'T':
			System.out.println("Nukleotid je TIMIN");
			break;
		default:
			System.out.println("Greska, taj nukleotid ne postoji.");
			break;

		}

	}

	// ZADATAK 1, STRANA 76, PRAKTIKUM

	static void sifarnik(int ocenaUcenika) {
		switch (ocenaUcenika) {
		case 1:
			System.out.println("Nedovoljan.");
		case 2:
			System.out.println("Dovoljan.");
		case 3:
			System.out.println("Dobar.");
		case 4:
			System.out.println("Vrlo dobar.");
		case 5:
			System.out.println("Odlican.");
		default:
			System.out.println("Greska. Ocene su od 1 - 5.");

		}

	}

	static String ocenaSlovima(int ocenaUcenika) {
		switch (ocenaUcenika) {
		case 1:
			return "Nedovoljan";

		case 2:
			return "Dovoljan";

		case 3:
			return "Dobar";

		case 4:
			return "Vrlo dobar";

		case 5:
			return "Odlican";

		default:
			System.out.println("Greska slovni iskaz moze biti samo ocena od 1 - 5.");
			break;

		}
		return null;

	}

	static void proveraZnakaICifre(char z) {

		switch (z) {
		case '!':
		case ',':
		case '.':
		case '?':
		case ';':
		case ':':
			System.out.println("U pitanju je znak.");
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
			System.out.println("U pitanju je cifra.");

		}
	}

	// PRIMER 43,44 79.,80. STRANA, PRAKTIKUM

	static void ispisiPorukuNPuta(String poruka, int n) {

		for (int i = 0; i < n; i++) {

			System.out.print(poruka + " ");

		}
		System.out.println("\n");

	}

	static void ispisiOd0Do30() {

		for (int i = 0; i <= 30; i++) {

			System.out.print(i + " ");
		}
		System.out.println("\n");

	}

	static void ispisiOd30Do0() {

		for (int i = 30; i >= 0; i--) {

			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

	static void ispisiParneBrojeveOd1Do25() {

		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}

		}
		System.out.println("\n");
	}

	static void ispisiMatricu() {

		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= 4; j++) {
				System.out.print("1" + "  ");
			}

			System.out.println();

		}

	}

	// PRIMER 45 82. STRANA, PRAKTIKUM

	static void ispisiMinDeljivSa12i15i9() {

		for (int i = 10; i <= 1000; i++) {

			if (i % 9 == 0 && i % 12 == 0 && i % 15 == 0) {
				System.out.println(i);
				break;// kada se nadje deljiv broj prekida se for petlja, tako nadje najmanji, da nema
						// break ispisala bi sve deljive brojeve

			}

		}

	}

	static int vratiMinDeljivSa12i15i9() {

		for (int i = 10; i <= 1000; i++) {

			if (i % 9 == 0 && i % 12 == 0 && i % 15 == 0) {
				return i;
			}

		}
		return 0;// ovo se prakticno nece ni izvrsiti jer je gornji return prekinuo izvrsavanje
					// cele metode

	}

	// ZADATAK 1, STRANA 83, PRAKTIKUM

	static void ispisiOd1Do50Rastuce() {
		for (int i = 1; i <= 50; i++) {

			System.out.print(i + " ");
		}
		System.out.println();
	}

	static void ispisiOd1Do30Opadajuce() {
		for (int i = 30; i >= 0; i--) {

			System.out.print(i + " ");
		}
		System.out.println();
	}

	static void ispisiOd1Do50Opadajuce() {
		for (int i = 50; i >= 1; i--) {

			System.out.print(i + " ");
		}
		System.out.println();
	}

	static void ispisiOd32DoMinus2Opadajuce() {
		for (int i = 32; i >= -2; i--) {

			System.out.print(i + " ");
		}
		System.out.println();
	}

	static void ispisiCeleNBrojevePoRastucemRedosledu(int n) {

		if (n > 0) {
			for (int i = 0; i <= n; i++) {

				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	static void ispisiBrojeveManjeOd0Od0doN(int n) {

		if (n < 0) {
			for (int i = 0; i >= n; i--) {// ispisuj i dok je vece od N, N je u minusu pa je manji jer se krece od 0

				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	static void ispisiBrojeveIzmedjuAiBUkljucujuciIh(int a, int b) {

		if (a < b) {
			for (int i = a; i <= b; i++) {

				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	static void ispisiBrojeveIzmedjuAiBNeUkljucujuciIh(int a, int b) {

		if (a < b) {
			for (int i = a + 1; i < b; i++) {

				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	static void ispisiBrojeveIzmedjuAiBUkljucujuciIhObrnutRedosled(int a, int b) {

		if (a < b) {
			for (int i = b; i >= a; i--) {

				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	// ZADATAK 2,3 STRANA 84, PRAKTIKUM

	static int sumaOdN(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {

			sum = sum + i;

		}
		return sum;

	}

	static int faktorijalOdN(int n) {
		int faktorijal = 1;
		for (int i = 1; i <= n; i++) {

			faktorijal = faktorijal * i;

		}
		return faktorijal;

	}

	static int dvaNaNti(int n) {

		int dvaNaNti = 1;// dvaNaNti ce odmah biti 2, pa 4, pa 6 jer se mnozi sa 2
		for (int i = 1; i <= n; i++) {

			dvaNaNti = dvaNaNti * 2;

		}
		return dvaNaNti;

	}

	static int triNaNti(int n) {

		int triNaNti = 1;// triNaNti ce odmah biti 3, pa 9, pa 81 jer se svaki dobijeni br(koji je vec
							// izmnozen sa 3) mnozi sa 3
		for (int i = 1; i <= n; i++) {

			triNaNti = triNaNti * 3;// pomnozicemo iznos sa 3 onoliko puta koliko je n

		}
		return triNaNti;

	}

	static double xNaNti(double x, int n) {

		double xNaN = 1;
		for (int i = 1; i <= n; i++) {

			xNaN = xNaN * x;// pomnozicemo iznos sa x onoliko puta koliko je n

		}
		return xNaN;

	}

	static int aPlusBNaNti(int a, int b, int n) {

		int aPlusBNaNti = 1;
		for (int i = 1; i <= n; i++) {

			aPlusBNaNti = aPlusBNaNti * (a + b);// pomnozicemo iznos sa x onoliko puta koliko je n

		}
		return aPlusBNaNti;

	}

	static int sumaBrojevaOdADoB(int a, int b) {
		int sum = 0;
		if (a < b) {

			for (int i = a; i <= b; i++) {

				sum = sum + i;
			}
		}
		return sum;
	}

	static int sumaBrojevaOdADoBNeUkljucijuciB(int a, int b) {
		int sum = 0;
		if (a < b) {

			for (int i = a; i < b; i++) {

				sum = sum + i;
			}
		}
		return sum;
	}

	static int sumaParnihBrojeviOdADoBUkljucijuciAiB(int a, int b) {
		int sum = 0;
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {

				sum = sum + i;
			}

		}
		return sum;

	}

	static int sumaBrojevaDeljivihSaTriOdADoBUkljucijuciAiB(int a, int b) {
		int sum = 0;
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {

				sum = sum + i;
			}

		}
		return sum;

	}

	static int proizvodPozitivnihBrojevaOdADoBUkljucijuciAiB(int a, int b) {

		int proizvod = 1;

		if (a < 0 || a > 0 && b > 0) {
			for (int i = a; i <= b; i++) {
				if (i > 0) {

					proizvod = proizvod * i;
				}

			}
		}
		return proizvod;

	}

	static void ispisivacMatrice4x4() {
		System.out.println();
		for (int i = 1; i <= 4; i++) { // Mogao je samo for u for-u i unutra ispisati "i", jer je i uvek jednak broju
										// reda i ispod sout za prazan red

			if (i == 1) {
				for (int j = 0; j < 4; j++)
					System.out.print("1" + " ");
				System.out.println();

			} else if (i == 2) {
				for (int j = 0; j < 4; j++)
					System.out.print("2" + " ");
				System.out.println();
			} else if (i == 3) {
				for (int j = 0; j < 4; j++)
					System.out.print("3" + " ");
				System.out.println();
			} else {
				for (int j = 0; j < 4; j++)
					System.out.print("4" + " ");
				System.out.println();
			}
		}

	}

	static void matricaNxNPoDijagonaliJedan(int n) {
		System.out.println();
		if (n >= 0) {
			for (int i = 1; i <= n; i++) {

				for (int j = 1; j <= n; j++) {
					if (i == j) {
						System.out.print("1" + " ");

					} else
						System.out.print("0" + " ");
				}
				System.out.println();
			}

		} else
			System.out.println("Greska! N, ne moze biti manji od 0. ");

	}

	// WHILE PRIMERI I ZADACI OD 87.STR
	static void najmanjeAVeceOd1000(int a) {
		System.out.println();
		int proizvod = 1;
		while (proizvod < 1000) {
			proizvod = proizvod * a;
		}
		System.out.print(proizvod + " ");

	}

	static int najmanjeDvaNaNtiVeceOdZadatogBroja(int zadatiBroj) {
		System.out.println();
		int najmanjiSledeciRezultat = 1;
		while (zadatiBroj > najmanjiSledeciRezultat) {

			najmanjiSledeciRezultat = najmanjiSledeciRezultat * 2;
		}
		return najmanjiSledeciRezultat;
	}

	static int najveceDvaNaNtiManjeOdZadatogBroja(int zadatiBroj) {
		System.out.println();
		int najveciRezultatManjiOdZadatogBroja = 1;
		while ((zadatiBroj > najveciRezultatManjiOdZadatogBroja)
				&& ((najveciRezultatManjiOdZadatogBroja * 2) < zadatiBroj)) {

			najveciRezultatManjiOdZadatogBroja = najveciRezultatManjiOdZadatogBroja * 2;
		}
		return najveciRezultatManjiOdZadatogBroja;
	}

	static int najmanjeANaNtiVeceOdBrojaB(int a, int b) {
		System.out.println();
		int najmanjeANaNtiRezultat = 1;
		while (b > najmanjeANaNtiRezultat) {

			najmanjeANaNtiRezultat = najmanjeANaNtiRezultat * a;
		}
		return najmanjeANaNtiRezultat;
	}

	static int najmanjiStepenZaDvaDaBiBioVeciOdZadatogBroja(int a) {
		System.out.println();
		int najmanjiStepenZaDvaRezultat = 1;
		int najmanjiStepen = 0;
		while (a > najmanjiStepenZaDvaRezultat) {
			najmanjiStepen++;
			najmanjiStepenZaDvaRezultat = najmanjiStepenZaDvaRezultat * 2;
		}
		return najmanjiStepen;
	}

	static void deliASaDvaDokJeRezultatVeciOdJedan(int a) {
		System.out.println();

		while (a > 1) {

			a = a / 2;
			System.out.print(a + " ");
		}
		System.out.println();

	}

	static void deliASaBDokJeRezultatVeciOdJedan(int a, int b) {

		while (a > 1) {

			a = a / b;
			System.out.print(a + " ");
		}
		System.out.println();

	}

	static void ispisiPrvih10BrojevaVecihOd0DeljivihSa9i6() {
		int i = 1;
		int brojDeljivih = 0;
		while (brojDeljivih < 10) {
			if (i > 0 && i % 9 == 0 || i % 6 == 0) {

				System.out.print(i + " ");
				brojDeljivih++;
			}
			i++;
		}
		System.out.println();
	}

	static void ispisiPrvih5BrojevaVecihOd0DeljivihSa7i8() {
		int i = 1;// Svaki put kada udje u While (koji jos nije pronasao prvih 5 brojeva), dodaje
					// po jedan br i onda ga proverava da li je deljiv
		int brojDeljivih = 0;
		while (brojDeljivih < 5) {// Kada pronadje deljivu, povecava za 1
			if (i > 0 && i % 7 == 0 || i % 8 == 0) {

				System.out.print(i + " ");
				brojDeljivih++;
			}
			i++;
		}
		System.out.println();
	}

	static void ispisiPrvihNBrojevaVecihOd0DeljivihSa5i6(int n) {
		int i = 1;// Svaki put kada udje u While (koji jos nije pronasao prvih N brojeva), dodaje
					// po jedan br i onda ga proverava da li je deljiv
		int brojDeljivih = 0;
		while (brojDeljivih < n) {// Kada pronadje deljivu, povecava za 1
			if (i > 0 && i % 5 == 0 || i % 6 == 0) {

				System.out.print(i + " ");
				brojDeljivih++;
			}
			i++;
		}
		System.out.println();
	}

	static double izracunajVremeDupliranja(double k) {
		int godineUdvostrucenjaGlavnice = 1;
		double udvostrucenaGlavnicaProcenat = 100;

		while (udvostrucenaGlavnicaProcenat < 200) {

			udvostrucenaGlavnicaProcenat = (udvostrucenaGlavnicaProcenat * (1 + k / 100));
			godineUdvostrucenjaGlavnice++;
		}
		return godineUdvostrucenjaGlavnice;
	}

	static double izracunajStednju(double k, double glavnica, double ciljnaSuma) {
		int godinePremasivanjaGlavnice = 1;

		while (glavnica < ciljnaSuma) {

			glavnica = (glavnica * (1 + k / 100));
			godinePremasivanjaGlavnice++;
		}
		return godinePremasivanjaGlavnice;
	}

	static void siguranIspis(String poruka, int a) {

		int i = 0;
		do {
			System.out.println("Poruka je: " + poruka);
			i++;
		} while (i < a);

	}

	public static void main(StringVezba[] args) {
		// TODO Auto-generated method stub

		SwitchForWhile switch1 = new SwitchForWhile();
		switch1.desifrujDNK('A');

		// ZADATAK 1, STRANA 76, PRAKTIKUM

		switch1.proveraZnakaICifre('.');
		switch1.proveraZnakaICifre('5');

		// PRIMER 43,44 79.,80. STRANA, PRAKTIKUM
		SwitchForWhile for1 = new SwitchForWhile();
		for1.ispisiPorukuNPuta("Sanja", 8);
		for1.ispisiOd0Do30();
		for1.ispisiOd30Do0();
		for1.ispisiParneBrojeveOd1Do25();
		for1.ispisiMatricu();

		// PRIMER 45 82. STRANA, PRAKTIKUM

		for1.ispisiMinDeljivSa12i15i9();
		System.out.println(for1.vratiMinDeljivSa12i15i9());

		// ZADATAK 1, STRANA 83, PRAKTIKUM

		for1.ispisiOd1Do50Rastuce();
		for1.ispisiOd1Do30Opadajuce();
		for1.ispisiOd1Do50Opadajuce();
		for1.ispisiOd32DoMinus2Opadajuce();
		for1.ispisiCeleNBrojevePoRastucemRedosledu(13);
		for1.ispisiBrojeveManjeOd0Od0doN(-5);
		for1.ispisiBrojeveIzmedjuAiBUkljucujuciIh(10, 15);
		for1.ispisiBrojeveIzmedjuAiBNeUkljucujuciIh(10, 15);
		for1.ispisiBrojeveIzmedjuAiBUkljucujuciIhObrnutRedosled(10, 15);
		// ZADATAK 2,3 STRANA 84, PRAKTIKUM

		System.out.println(for1.sumaOdN(4));
		System.out.println(for1.faktorijalOdN(5));
		System.out.println(for1.dvaNaNti(3));
		System.out.println(for1.xNaNti(2, 3));
		System.out.println(for1.aPlusBNaNti(2, 0, 3));
		System.out.println(for1.sumaBrojevaOdADoB(10, 15));
		System.out.println(for1.sumaBrojevaOdADoBNeUkljucijuciB(10, 15));
		System.out.println(for1.sumaParnihBrojeviOdADoBUkljucijuciAiB(10, 15));
		System.out.println(for1.sumaBrojevaDeljivihSaTriOdADoBUkljucijuciAiB(10, 15));
		System.out.println(for1.proizvodPozitivnihBrojevaOdADoBUkljucijuciAiB(-1, 8));
		for1.ispisivacMatrice4x4();
		for1.matricaNxNPoDijagonaliJedan(10);

		// WHILE PRIMERI I ZADACI OD 87.STR
		for1.najmanjeAVeceOd1000(2);
		System.out.print(for1.najmanjeDvaNaNtiVeceOdZadatogBroja(6) + " ");
		System.out.print(for1.najveceDvaNaNtiManjeOdZadatogBroja(6) + " ");
		System.out.print(for1.najmanjiStepenZaDvaDaBiBioVeciOdZadatogBroja(6) + " ");
		for1.deliASaDvaDokJeRezultatVeciOdJedan(33);
		for1.deliASaBDokJeRezultatVeciOdJedan(4, 2);
		for1.ispisiPrvih10BrojevaVecihOd0DeljivihSa9i6();
		for1.ispisiPrvih5BrojevaVecihOd0DeljivihSa7i8();
		for1.ispisiPrvihNBrojevaVecihOd0DeljivihSa5i6(3);
		System.out.println(for1.izracunajVremeDupliranja(1.8));
		System.out.println(for1.izracunajStednju(3.2, 100000, 1000000));
		for1.siguranIspis("Sanja :D", 3);

	}

}
