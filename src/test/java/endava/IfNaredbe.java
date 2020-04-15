package endava;

public class IfNaredbe {

	void proveraZnaka(int a) {

		if (a < 0)

			System.out.println("Broj je jednak nuli.");

		else if (a > 0)
			System.out.println("Broj je veci od 0.");
		else
			System.out.println("Broj je manji od 0.");

	}

	void proveriVeceManjeJednako(int a, int b) {
		if (a > b)
			System.out.println("Broj a: " + a + " je veci od broja b: " + b);

		else if (a < b)
			System.out.println("Broj a: " + a + " je manji od broja b: " + b);
		else
			System.out.println("Broj a: " + a + " je jednak od broju b: " + b);

	}

	boolean razlicito(int a, int b) {
		if (a != b) {
			System.out.println("Brojevi su razliciti.");
			return true;
		} else {
			System.out.println("Brojevi su isti.");
			return false;
		}
	}

	boolean proveriParnost(int a) {
		if (a % 2 == 0) {
			System.out.println("Broj je paran.");
			return true;
		} else {
			System.out.println("Broj je neparan.");
			return false;
		}
	}

	boolean daLiJeRealanBrojURasponu(double a) {
		if ((a >= 100) && (a <= 200)) {
			System.out.println("Broj " + a + "  je u rasponu izmedju 100 i 200. ");
			return true;

		} else {
			System.out.println("Broj " + a + "  nije u rasponu izmedju 100 i 200. ");
			return false;
		}
	}

	boolean daLiJeRealanBrojURasponu2(double a) {
		if (a < 0 || a < 33.3) {
			System.out.println("Broj " + a + " je u rasponu od 0 do 33.3. ");
			return true;
		} else {
			System.out.println("Broj " + a + " nije u rasponu od 0 do 33.3. ");
			return false;
		}
	}

	void proveriVisinu(double visina) {
		if (visina < 120 || visina > 240)
			System.out.println("Greska. Raspon unetog broja je od 120 do 240 cm.");
		else {
			if (visina <= 158)
				System.out.println("Pripadate niskim osobama.");
			if (visina > 158 && visina <= 179)
				System.out.println("Pripadate srednje visokim osobama.");
			if (visina > 179)
				System.out.println("Pripadate grupi visokih osoba.");
		}
	}

	void proveriStarosnoDoba(int starost) {
		if (starost > 0 && starost < 120) {
			if (starost >= 0 && starost < 30) {
				System.out.println("Vi ste mlada osoba.");
			}
			if (starost >= 31 && starost <= 55) {
				System.out.println("Vi ste osoba srednjeg doba.");
			}
			if (starost > 56) {
				System.out.println("Vi ste stara osoba.");
			}
		} else
			System.out.println("Greska.");
	}

	// ZADATAK 1, 65. I 66. STRANA PRAKTIKUM

	int jacinaTona = 0;
	int trenutniProgram = 1;
	boolean ukljucen = false;

	void ukljuci() {
		if (ukljucen == false) {
			ukljucen = true;
		} else
			System.out.println("Televizor je vec ukljucen.");
	}

	void iskljuci() {
		if (ukljucen == false) {
			ukljucen = false;
		} else
			System.out.println("Televizor je vec iskljucen.");
	}

	void pojacajTon() {
		if (jacinaTona < 10) {
			jacinaTona += 1;
		} else
			System.out.println("Ton je vec na maximumu.");
	}

	void smanjiTon() {
		if (jacinaTona > 0) {
			jacinaTona -= 1;
		} else
			System.out.println("Ton je vec na minimumu.");
	}

	void promeniProgramNavise() {
		if (trenutniProgram < 99) {
			trenutniProgram += 1;
		} else
			trenutniProgram = 1;
	}

	void promeniProgramNanize() {
		if (trenutniProgram > 1) {
			trenutniProgram -= 1;
		} else
			trenutniProgram = 99;
	}

	void ispisiParametreTelevizora() {
		if (ukljucen == true) {
			System.out.println("Televizor je ukljucen.");
			System.out.println("Jacina tona je: " + jacinaTona);
			System.out.println("Trenutni program je: " + trenutniProgram);
		} else
			System.out.println("Televizor je iskljucen.");
	}

// ZADATAK 2, 67. I 68. STRANA PRAKTIKUM

	double fmFrekvencija = 87.5;
	int amFrekvencija = 567;
	char band = 'F';

	void podesiFmFrekvenciju(double fmFrekvencija) {

		if (fmFrekvencija >= 87.5 && fmFrekvencija <= 108.0) {
			this.fmFrekvencija = fmFrekvencija;
		} else
			System.out.println("Greska. Fm frekvencija nije u dozvoljenom opsegu.");

	}

	void podesiAmFrekvenciju(int amFrekvencija) {

		if (amFrekvencija >= 567 && amFrekvencija <= 1576) {
			this.amFrekvencija = amFrekvencija;
		} else
			System.out.println("Greska. Am frekvencija nije u dozvoljenom opsegu.");

	}

	void promeniBand(char b) {
		if (b == 'A' || b == 'F')
			band = b;
		else
			System.out.println("Greska.");

	}

	void ispisiParametreRadia() {

		if (band == 'A')
			System.out.println("Radio pusta am frekvenciju: " + amFrekvencija);
		else
			System.out.println("Radio pusta fm frekvenciju: " + fmFrekvencija);
	}

// ZADATAK 3, 69. I 70. STRANA PRAKTIKUM
	double bmi;
	String kategorija;

	double izracunajBMI(double visina, double tezina) {

		if ((visina > 1.2 && visina < 2.4) && (tezina > 30 && tezina < 200))

			return bmi = (tezina / (visina * visina));
		else {
			System.out.println("Greska.");
			return 0;
		}

	}

	void ispisiBMIKategoriju() {

		if (bmi <= 15) {
			kategorija = "Anoreksija";
			System.out.println("Vas BMI je: " + bmi + ", pripadate kategoriji " + kategorija);
		} else if (bmi > 15 && bmi <= 18.5) {
			kategorija = "Mrsavost";
			System.out.println("Vas BMI je: " + bmi + ", pripadate kategoriji " + kategorija);
		} else if (bmi > 18.5 && bmi <= 25) {
			kategorija = "Normalno";
			System.out.println("Vas BMI je: " + bmi + ", pripadate kategoriji " + kategorija);
		} else if (bmi > 25 && bmi <= 30) {
			kategorija = "Popunjen";
			System.out.println("Vas BMI je: " + bmi + ", pripadate kategoriji " + kategorija);
		} else if (bmi > 30 && bmi <= 40) {
			kategorija = "Debeo";
			System.out.println("Vas BMI je: " + bmi + ", pripadate kategoriji " + kategorija);
		} else if (bmi > 40) {
			kategorija = "Gorazan";
			System.out.println("Vas BMI je: " + bmi + ", pripadate kategoriji " + kategorija);
		}

	}

// ZADATAK 4, 70. I 71. STRANA PRAKTIKUM
	int trenutnaTemperatura = 18;
	char rezimRada = 'A';

	void smanjiTemperaturu() {

		if (trenutnaTemperatura > 18)
			trenutnaTemperatura -= 1;
		else
			System.out.println("Greska, temperatura ne moze biti manja od 18 stepeni.");
	}

	void povecajTemperaturu() {
		if (trenutnaTemperatura < 30)
			trenutnaTemperatura += 1;
		else
			System.out.println("Greska, temperatura ne moze biti visa od 30 stepeni.");

	}

	void podesiTemperaturu(int zeljenaTemperatura) {
		if (zeljenaTemperatura >= 18 && zeljenaTemperatura <= 30)
			trenutnaTemperatura = zeljenaTemperatura;
		else
			System.out.println("Greska. Temperatura moze biti u rasponu od 18 do 30 stepeni.");
	}

	void promeniRezim(char rezimRada) {
		if (rezimRada == 'A' || rezimRada == 'G' || rezimRada == 'H')
			this.rezimRada = rezimRada;
		else
			System.out.println("Greska, rezim rada moze biti ili A ili G ili H. ");

	}

	void ispisiParametreKlimaUredjaja() {
		System.out.println(
				"Rezim rada je: " + rezimRada + ". Trenutna temperatura je podesena na: " + trenutnaTemperatura + ".");
	}

// ZADATAK 5, 71. I 72. STRANA PRAKTIKUM
	// napravljene odvojene klase, jedino ih ovde u mainu pozivam

	public static void main(StringVezba[] args) {

		IfNaredbe iff = new IfNaredbe();
		iff.proveraZnaka(50);
		iff.proveriVeceManjeJednako(10, 20);

		System.out.println(iff.razlicito(5, 7));
		System.out.println(iff.proveriParnost(100));

		System.out.println(iff.daLiJeRealanBrojURasponu(-50));
		System.out.println(iff.daLiJeRealanBrojURasponu2(100));
// LOGICKA KONTROLA ULAZNIH PODATAKA
		iff.proveriVisinu(241);
		iff.proveriStarosnoDoba(119);

// ZADATAK 1, 65. I 66. STRANA PRAKTIKUM
		iff.ukljuci();
		iff.ispisiParametreTelevizora();
		iff.promeniProgramNanize();
		iff.smanjiTon();
		iff.ispisiParametreTelevizora();
		iff.pojacajTon();
		iff.promeniProgramNavise();
		iff.ispisiParametreTelevizora();

// ZADATAK 2, 67. I 68. STRANA PRAKTIKUM

		IfNaredbe radio1 = new IfNaredbe();
		IfNaredbe radio2 = new IfNaredbe();

		radio1.promeniBand('A');
		radio1.podesiAmFrekvenciju(570);
		radio1.ispisiParametreRadia();
		radio2.promeniBand('F');
		radio2.podesiFmFrekvenciju(107.9);
		radio2.ispisiParametreRadia();

// ZADATAK 3, 69. I 70. STRANA PRAKTIKUM
// napravila sam automatiku za kategoriju
		IfNaredbe bmiIndeks = new IfNaredbe();
		bmiIndeks.izracunajBMI(1.85, 82);
		bmiIndeks.ispisiBMIKategoriju();

// ZADATAK 4, 70. I 71. STRANA PRAKTIKUM
		IfNaredbe klima1 = new IfNaredbe();
		IfNaredbe klima2 = new IfNaredbe();

		klima1.promeniRezim('G');
		klima1.podesiTemperaturu(26);
		klima1.ispisiParametreKlimaUredjaja();

		klima2.promeniRezim('H');
		klima2.podesiTemperaturu(18);
		klima2.smanjiTemperaturu();
		klima2.ispisiParametreKlimaUredjaja();

// ZADATAK 5, 71. I 72. STRANA PRAKTIKUM
		AutomobilZadatak5 auto = new AutomobilZadatak5();
		auto.markaAutomobila = "Mercedes";
		auto.modelAutomobila = "A 170";
		auto.kubikazaMotoraAutomobila = 1690;
		auto.snagaMotoraAutomobila = 95;
		TroskoviRegistracijeAutomobilaZadatak5 trosak = new TroskoviRegistracijeAutomobilaZadatak5();
		trosak.ispisiSveTroskoveRegistracije(auto);
		double ukupanTrosak = trosak.obracunajDoprinos(auto) + trosak.obracunajOsiguranje(auto);
		System.out.println("Ukupan trosak je: " + ukupanTrosak);

	}

}
