package endava;

public class Nizovi {
	// PRIMER 49, 97 STR, PRAKTIKUM
	// profiti za 12 meseci

//	double[] profiti = new double[12];
//
//	void unesiProfitZaMesec(double profit, int mesec) {
//
//		profiti[mesec - 1] = profit;// zato sto krece od 0 index do 11, januar je 0, a mi cemo u app unositi od 1-
//									// 12
//	}
//
//	void ispisiMesecneProfite() {
//		for (int i = 0; i < profiti.length; i++)
//			System.out.println(profiti[i]);
//	}
//
//	// Ocene na ispitnom roku, primer 50
//
//	int[] oceneStudenata = new int[100];
//
//	int brojacI = 0;// predstavlja trenutni broj elementa u nizu, ali i indeks prvog slobodnog mesta
//
//	void unosOcenaSaIspitaUNiz(int ocenaNaIspitu) {
//		oceneStudenata[brojacI] = ocenaNaIspitu;// brojac je ubacen da bi se popunjavao niz od prvog mesta
//		brojacI++;
//
//	}
//
//	void ispisiSveOceneNaIspitu() {
//		for (int i = 0; i < brojacI; i++)
//			System.out.print(oceneStudenata[i]);// i je promenljiva, brojac je fiksan
//		System.out.println();
//	}
//
//	// ZADATAK 1, PRAKTIKUM, 100 STRANA
//
//	int[] nizCelihBrojeva = new int[10];
//	int brojacNiza = 0;
//
//	void dodavanjeElemenaaUNiz(int broj) {
//		nizCelihBrojeva[brojacNiza] = broj;// brojac niza, za povecavanje indeksa i dodeljivanje vrednosti
//		brojacNiza++;
//	}
//
//	void ispisiPrviElemenatNiza() {
//		System.out.println(nizCelihBrojeva[0]);// 20 je na prvom mestu, tj indeks joj je 0
//	}
//
//	void ispisi10ElementNiza() {
//		System.out.println(nizCelihBrojeva[9]);
//	}
//
//	void ispisiElementZaIndeksIzArgumentaMetode(int arg) {
//		System.out.println(nizCelihBrojeva[arg]);
//	}
//
//	void ispisiSveElementeNiza() {
//
//		for (int i = 0; i < brojacNiza; i++)
//			System.out.println(nizCelihBrojeva[i]);
//	}
//
//	int zbirElemenataNiza() {
//		int sum = 0;
//		for (int i = 0; i < brojacNiza; i++) {
//
//			sum = sum + nizCelihBrojeva[i];
//
//		}
//		return sum;
//	}
//
//	int proizvodElemenataNiza() {
//		int proizvod = 1;
//		for (int i = 0; i < brojacNiza; i++) {
//
//			proizvod = proizvod * nizCelihBrojeva[i];
//
//		}
//		return proizvod;
//	}
//
//	int minElemenatNiza() {
//
//		int min = nizCelihBrojeva[0];
//		for (int i = 0; i < brojacNiza; i++) {// Redjace se svi clanovi
//			if (nizCelihBrojeva[i] < min)
//				min = nizCelihBrojeva[i];
//		}
//
//		return min;
//	}
//
//	int maxElemenatNiza() {
//
//		int max = nizCelihBrojeva[0];// dobija vrednost prvog clana
//		for (int i = 0; i < brojacNiza; i++) {// Redjace se svi clanovi, posto je i manje od brojacaNiza koji je u
//												// gornjoj metodi iterirao
//			if (nizCelihBrojeva[i] > max)// Proverava da li je vrednost sledeceg clana(iteriranog sa i) veca od
//											// prethodnog (koji je sacuvan u varijabli)
//				max = nizCelihBrojeva[i];// dobija vrednost max clana
//		}
//
//		return max;// kada su izlistani svi clanovi, vraca max
//	}
//
//	boolean daLiSeBrojNalaziUNizu(int daLiJeBrUNizu) {
//
//		for (int i = 0; i < brojacNiza; i++) {
//
//			if (nizCelihBrojeva[i] == daLiJeBrUNizu) {
//
//				return true;
//			}
//
//		}
//		return false;
//
//	}

	// ZADATAK 2, STRANA 101, PRAKTIKUM

//	int[] nizBrojevaZadatak2;
//	int brojacZadatak2;
//	int kapacitetNiza;
//
//	// Konstruktor u kome se kreira niz
//
//	public Nizovi(int kapacitetNiza) {
//
//		nizBrojevaZadatak2 = new int[kapacitetNiza];
//		int brojacZadatak2 = 0;
//	}
//
//	// Metoda za dodavanje elemenata u niz
//
//	void dodavenjeElemenataUNiz(int dodajElemenat) {
//
//		if (brojacZadatak2 < nizBrojevaZadatak2.length) {
//			nizBrojevaZadatak2[brojacZadatak2] = dodajElemenat;
//			brojacZadatak2++;
//		} else
//			System.out.println("Greska! Niz je popunjen!");
//
//	}
//
//	int zbirPrvogIZadnjeg;
//
//	int zbirPrvogIPoslednjegElementa() {
//
//		for (int i = 0; i < brojacZadatak2; i++)
//			zbirPrvogIZadnjeg = nizBrojevaZadatak2[0] + nizBrojevaZadatak2[brojacZadatak2 - 1];
//		if (brojacZadatak2 < 0) {
//			System.out.println("Greska! Niz je prazak!");
//			return 0;
//		}
//
//		return zbirPrvogIZadnjeg;
//
//	}
//
//	int zbirPozitivnih = 0;
//
//	int zbirPozitivnihElemenata() {
//
//		for (int i = 0; i < brojacZadatak2; i++) {
//			if (nizBrojevaZadatak2[i] > 0) {
//				zbirPozitivnih = zbirPozitivnih + nizBrojevaZadatak2[i];
//
//			}
//
//		}
//		return zbirPozitivnih;
//
//	}
//
//	int proizvodNegativnihBrojeva() {
//		int proizvodNegativnih = 1;
//		for (int i = 0; i < brojacZadatak2; i++) {
//			if (nizBrojevaZadatak2[i] < 0) {
//
//				proizvodNegativnih = proizvodNegativnih * nizBrojevaZadatak2[i];
//			}
//
//		}
//		return proizvodNegativnih;
//
//	}
//
//	int brojPonavljanjaNekogBrojaUNizu(int proveraBrojaDaLiSePonavlja) {
//		int ponavljanje = 0;
//		for (int i = 0; i < brojacZadatak2; i++) {
//
//			if (nizBrojevaZadatak2[i] == proveraBrojaDaLiSePonavlja) {
//
//				ponavljanje++;// broji koliko puta se broj ponavlja
//
//			}
//
//		}
//		return ponavljanje;
//
//	}
//
//	void ispisiParneClanove() {
//		System.out.print("Parni clanovi su: ");
//		for (int i = 0; i < brojacZadatak2; i++) {
//			while (nizBrojevaZadatak2[i] % 2 == 0) {
//
//				System.out.print(nizBrojevaZadatak2[i] + "; ");
//				break;
//			}
//
//		}
//		System.out.println();
//	}
//
//	void deljiviSaPet() {
//		System.out.print("Brojevi deljivi sa 5 su: ");
//		for (int i = 0; i < brojacZadatak2; i++) {
//
//			if (nizBrojevaZadatak2[i] % 5 == 0) {
//
//				System.out.print(nizBrojevaZadatak2[i] + "; ");
//			}
//
//		}
//		System.out.println();
//	}
//
//	void obrnutRedosled() {
//		System.out.print("Obrnuti redosled je: ");
//		for (int i = brojacZadatak2 - 1; i >= 0; i--) {
//
//			System.out.print(nizBrojevaZadatak2[i] + "; ");
//
//		}
//
//	}
	// ZADATAK 3, STRANA 103, PRAKTIKUM

//	double[] nizCena = new double[100];
//	int brojacNizaCena = 0;
//
//	void dodavanjeNoveCeneUNiz(double cena) {
//		if (cena > 0 && brojacNizaCena < nizCena.length) {
//
//			nizCena[brojacNizaCena] = cena;
//			brojacNizaCena++;
//
//			// cesto zaboravim da dodam brojac
//
//		} else
//			System.out.println("Greska! Niz je vec popunjen. ");
//	}
//
//	double prosecnaCenaProizvoda() {
//		double sum = 0;
//		double average = 0;
//		if (nizCena.length > 0) {
//			for (int i = 0; i < brojacNizaCena; i++) {
//				sum = sum + nizCena[i];// mora da se i ovaj iznos izvuce i sabere u varijabli
//				average = sum / brojacNizaCena;
//
//			}
//			return average;
//		} else
//			System.out.println("Greska! Niz je popunjen!");
//		return 0;
//	}
//
//	double najnizaCena() {
//		double min = nizCena[0];// ova varijabla ce pokupiti svaki min i porediti sa sl.clanom u nizu
//		if (brojacNizaCena == 0) {// brojac pokazuje koliko je clanova popunjeno
//			System.out.println("Greska! Niz je prazan!");
//			return 0;
//		} else {
//			for (int i = 0; i < brojacNizaCena; i++)
//
//				if (nizCena[i] < min)
//					min = nizCena[i];
//			return min;
//
//		}
//
//	}
//
//	double najvisaCena() {
//
//		double max = nizCena[0];
//		if (brojacNizaCena != 0) {
//			for (int i = 0; i < brojacNizaCena; i++)
//				if (nizCena[i] > max)
//
//					max = nizCena[i];
//			return max;
//		}
//
//		else {
//			System.out.println("Greska! Niz je prazan! ");
//			return 0;
//		}
//
//	}
//
//	double razlikaNajviseINajnizeCene() {
//		if (brojacNizaCena > 0) {
//			double razlika = najvisaCena() - najnizaCena();
//
//			return razlika;
//		} else
//			System.out.println("Greska! Niz je prazan! ");
//		return 0;
//	}
//
//	void ispisiVeceCeneOdZadate(double zadataCena) {
//		if (brojacNizaCena > 0) {
//			for (int i = 0; i < brojacNizaCena; i++)
//				if (zadataCena < nizCena[i])
//					System.out.print(nizCena[i] + "; ");
//		} else
//			System.out.println("Greska! Niz je prazan!");
//
//	}
//	
	// ZADATAK 4, 105. STRANA, PRAKTIKUM

//	char karikaDNK;
//	int brojKarikaULancuDNK;// za trenutni br karika tj vrednosti u lancu
//	char[] nizDNK;
//
//	public Nizovi(int maxBrKarika) {
//
//		if (maxBrKarika > 0) {
//			nizDNK = new char[maxBrKarika];
//			brojKarikaULancuDNK = 0;
//		} else {
//			nizDNK = new char[256];
//			brojKarikaULancuDNK = 0;
//		}
//	}
//
//	void dodavanjeKarikaULancu(char karikaDNK) {
//
//		// for(int i=0;i<brojKarikaULancuDNK;i++)
//		if (brojKarikaULancuDNK < nizDNK.length && karikaDNK == 'A' || karikaDNK == 'C' || karikaDNK == 'G'
//				|| karikaDNK == 'T') {
//			nizDNK[brojKarikaULancuDNK] = karikaDNK;
//			brojKarikaULancuDNK++;
//		}
//
//		else
//			System.out.println("Greska! Karike mogu biti samo 'A', 'C', 'G', 'T' ili nema mesta u nizu. ");
//
//	}
//
//	int prebrojBrojAdeninaULancu() {
//		int brojA = 0;
//		for (int i = 0; i < brojKarikaULancuDNK; i++) {// da sam stavila nizDNK.length poredio bi mi max duzinu niza,
//														// isti rez.ali ovako je optimjalno
//
//			if (nizDNK[i] == 'A')
//				brojA++;// Mora brojac obavezno
//
//		}
//		return brojA;
//
//	}
//
//	int brojKarikaULancu() {
//
//		return brojKarikaULancuDNK;// ovo je trenutna popunjenost sa vrednostima
////		int duzinaLanca = nizDNK.length;// ovo je kapacitet lanca
////		return duzinaLanca;
//
//	}
//
//	int maxKapacitetLanca() {
//
//		return nizDNK.length;
//
//	}
//
//	int vratiBrojNepopunjenihMestaULancu() {
//		int brojNepopunjenihMestaULancu = maxKapacitetLanca() - brojKarikaULancu();
//		return brojNepopunjenihMestaULancu;
//	}
//
//	void ispisiKarikeDNKLanca() {
//
//		for (int i = 0; i < brojKarikaULancuDNK; i++) {
//
//			System.out.print(nizDNK[i] + "; ");
//
//		}
//		System.out.println();
//	}
//	
//	void ispisiKarikeDNKLancaUObrnutomRedosledu() {
//
//		for (int i = brojKarikaULancuDNK-1; i >= 0; i--) {//greska mi je bila sa uslovom i>=0
//
//			System.out.print(nizDNK[i] + "; ");
//
//		}
//	}
	// ZADATAK 5, 107. STRANA, PRAKTIKUM

//	boolean[] nizSedista = new boolean[50];
//	int brojTrenutnoPopunjenih = 0;
//
//	public Nizovi() {
//		for (int i = 0; i < 50; i++)
//			nizSedista[i] = true;
//	}
//
//	void uvodjenjePutnikaUAutobus(int brojSedista) {
//
//		if (nizSedista[brojSedista] == true) {
//			nizSedista[brojSedista] = false;
//			brojTrenutnoPopunjenih++;
//		}
//
//		else
//			System.out.println("Greska! Sediste " + brojSedista + " je vec popunjeno! ");
//
//	}
//
//	boolean daLiImaSlobodnihMestaUAutobusu() {
//
//		if (brojTrenutnoPopunjenih < 50) {
//			System.out.print("Ima slobodnih mesta: ");
//			System.out.println();
//			return true;
//		} else
//			return false;
//	}
//
//	int brojSlobodnihMestaUAutobusu() {
//
//		int slobidnaMesta = nizSedista.length - brojTrenutnoPopunjenih;
//
//		return slobidnaMesta;
//	}
//
//	int brojZauzetihMesta() {
//		System.out.println();
//		return brojTrenutnoPopunjenih;
//	}
//
//	void ispisStatusaMestaUAutobusu() {
//		for (int i = 0; i < 50; i++) {
//			if (nizSedista[i] == true)
//				System.out.println("Sediste broj " + i + " je slobodno. ");
//			else
//				System.out.println("Sediste broj " + i + " je zauzeto. ");
//		}
//	}
	// ZADATAK 6, 109. STRANA, PRAKTIKUM

//	static void nizCenihBrojevaIspis(int[] nizCelihBr) {
//		for (int i = 0; i < nizCelihBr.length; i++)
//			System.out.println("Elementi niza celih brojeva: " + nizCelihBr[i]);
//		
//		System.out.println();
//	}
//
//	static void nizRealnihBrojevaIspis(double[] nizRealnihBrojeva) {
//
//		for (int i = 0; i < nizRealnihBrojeva.length; i++) {
//			System.out.println("Elenenti niza realnih brojeva su: " + nizRealnihBrojeva[i]);
//		}
//		System.out.println();
//	}
//
//	static int[] kopijaNizaCelihBrojeva(int[] nizCelihBr) {
//		int[] kopijaNizaCelihBr = new int[nizCelihBr.length];// kopija kapaciteta niza
//		for (int i = 0; i < nizCelihBr.length; i++) {// kopiranje elemenata
//			kopijaNizaCelihBr[i] = nizCelihBr[i];
//		}
//		return kopijaNizaCelihBr;
//
//	}
//
//	static int[] spajanjeDvaNizaUTreci(int[] niz1, int[] niz2) {
//
//		int[] niz3 = new int[niz1.length + niz2.length];// Kapacitet 3. niza
//		for (int i = 0; i < niz1.length; i++)
//
//			niz3[i] = niz1[i];
//		for (int i = 0; i < niz2.length; i++)
//			niz3[niz1.length + i] = niz2[i];
//		return niz3;
//
//	}

	int[][] matricaNiz;

	public Nizovi(int brojRedova, int brojKolona) {

		matricaNiz = new int[brojRedova][brojKolona];

	}

	void pretvarajeMatriceU0Matricu() {

		for (int i = 0; i < matricaNiz.length; i++)// broj redova se dobija matricaNiz.length
			for (int j = 0; j < matricaNiz[0].length; j++)// broj kolona se dobija kao duzina prvog reda
															// matricaNiz[0].length
				matricaNiz[i][j] = 0;
	}

	void pretvoriUJedinicnuMatricu() {
		if (matricaNiz.length == matricaNiz[0].length) {
			for (int i = 0; i < matricaNiz.length; i++) {
				for (int j = 0; j < matricaNiz.length; j++)
					if (i == j)
						matricaNiz[i][j] = 1;
					else
						matricaNiz[i][j] = 0;

			}
		} else
			System.out.println("Greska, matrica nije kvadratna. ");
	}

	void ispisMatrice() {
System.out.println();
		for (int i = 0; i < matricaNiz.length; i++) {
			
			for (int j = 0; j < matricaNiz[0].length; j++)
				System.out.print(matricaNiz[i][j] + " ");
			System.out.println();
		}
	}

	public static void main(StringVezba[] args) {
		// TODO Auto-generated method stub

// PRIMER 49, 97 STR, PRAKTIKUM
//Zbog kostruktora koji ocekuje parametar prva tri objekta ne mogu da inicijalizujem
//		Nizovi nizProfiti = new Nizovi();
//		Nizovi nizOcene = new Nizovi();
//		Nizovi nizBrojeva = new Nizovi();
//		nizProfiti.unesiProfitZaMesec(526.0, 1);
//		nizProfiti.ispisiMesecneProfite();
//		nizOcene.unosOcenaSaIspitaUNiz(5);
//		nizOcene.unosOcenaSaIspitaUNiz(10);
//		nizOcene.unosOcenaSaIspitaUNiz(10);
//		nizOcene.unosOcenaSaIspitaUNiz(7);
//		nizOcene.unosOcenaSaIspitaUNiz(8);
//		nizOcene.ispisiSveOceneNaIspitu();
//		nizBrojeva.dodavanjeElemenaaUNiz(20);
//		nizBrojeva.dodavanjeElemenaaUNiz(5);

// ZADATAK 1, PRAKTIKUM, 100 STRANA
//		System.out.println("Zbir niza celih brojeva je: " + nizBrojeva.zbirElemenataNiza());
//		System.out.println("Proizvod niza celih brojeva je: " + nizBrojeva.proizvodElemenataNiza());
//		System.out.println("Min vrednost elementa niza je: " + nizBrojeva.minElemenatNiza());
//		System.out.println("Max vrednost elementa niza je: " + nizBrojeva.maxElemenatNiza());
//		System.out.println("Da li se broj 20 nalazi u nizu: " + nizBrojeva.daLiSeBrojNalaziUNizu(20));
// ZADATAK 2, STRANA 101, PRAKTIKUM
//		Nizovi nizBrojevaZadatak2 = new Nizovi(5);
//		nizBrojevaZadatak2.dodavenjeElemenataUNiz(500);
//		nizBrojevaZadatak2.dodavenjeElemenataUNiz(-1);
//		nizBrojevaZadatak2.dodavenjeElemenataUNiz(250);
//		nizBrojevaZadatak2.dodavenjeElemenataUNiz(-25);
//		nizBrojevaZadatak2.dodavenjeElemenataUNiz(500);
//		System.out.println(nizBrojevaZadatak2.zbirPrvogIPoslednjegElementa());
//		System.out.println("Zbir pozitivnih elemenata je: " + nizBrojevaZadatak2.zbirPozitivnihElemenata());
//		System.out.println("Proizvod negativnih elemenata je: " + nizBrojevaZadatak2.proizvodNegativnihBrojeva());
//		System.out.println("Broj se ponavlja: " + nizBrojevaZadatak2.brojPonavljanjaNekogBrojaUNizu(500) + " puta.");
//		nizBrojevaZadatak2.ispisiParneClanove();
//		nizBrojevaZadatak2.deljiviSaPet();
//		nizBrojevaZadatak2.obrnutRedosled();

// ZADATAK 3, STRANA 103, PRAKTIKUM
//		Nizovi nizBrojevaZadatak3 = new Nizovi();
//		nizBrojevaZadatak3.dodavanjeNoveCeneUNiz(10.5);
//		nizBrojevaZadatak3.dodavanjeNoveCeneUNiz(100.5);
//		nizBrojevaZadatak3.dodavanjeNoveCeneUNiz(105.5);
//		nizBrojevaZadatak3.dodavanjeNoveCeneUNiz(10);
//		nizBrojevaZadatak3.dodavanjeNoveCeneUNiz(106.13);
//		System.out.println("Prosecna cena je: " + nizBrojevaZadatak3.prosecnaCenaProizvoda());
//		System.out.println("Najniza cena je: " + nizBrojevaZadatak3.najnizaCena());
//		System.out.println("Najvisa cena je: " + nizBrojevaZadatak3.najvisaCena());
//		System.out
//				.println("Razlika izmedju najvise i najnize cene: " + nizBrojevaZadatak3.razlikaNajviseINajnizeCene());
//		nizBrojevaZadatak3.ispisiVeceCeneOdZadate(15);
//
//		Nizovi nizBrojevaZadatak4 = new Nizovi(10);
//		nizBrojevaZadatak4.dodavanjeKarikaULancu('A');
//		nizBrojevaZadatak4.dodavanjeKarikaULancu('C');
//		nizBrojevaZadatak4.dodavanjeKarikaULancu('G');
//		nizBrojevaZadatak4.dodavanjeKarikaULancu('A');
//		nizBrojevaZadatak4.dodavanjeKarikaULancu('T');
//		System.out.println("Broj Adenina u lancu je: " + nizBrojevaZadatak4.prebrojBrojAdeninaULancu());
//		System.out.println("Trenutni broj karika u lancu je: " + nizBrojevaZadatak4.brojKarikaULancu());
//		System.out.println("Maximalni kapacitet je: " + nizBrojevaZadatak4.maxKapacitetLanca());
//		System.out.println(
//				"Broj nepopunjenih mesta u lancu je: " + nizBrojevaZadatak4.vratiBrojNepopunjenihMestaULancu());
//
//		nizBrojevaZadatak4.ispisiKarikeDNKLanca();
//		nizBrojevaZadatak4.ispisiKarikeDNKLancaUObrnutomRedosledu();

		// ZADATAK 5, 107. STRANA, PRAKTIKUM
//		Nizovi nizBrojevaZadatak5 = new Nizovi();
//		nizBrojevaZadatak5.uvodjenjePutnikaUAutobus(0);
//		nizBrojevaZadatak5.uvodjenjePutnikaUAutobus(5);
//		nizBrojevaZadatak5.uvodjenjePutnikaUAutobus(7);
//		nizBrojevaZadatak5.uvodjenjePutnikaUAutobus(8);
//		System.out.println(nizBrojevaZadatak5.daLiImaSlobodnihMestaUAutobusu());
//		System.out.print("Broj slobodnih mesta je: " + nizBrojevaZadatak5.brojSlobodnihMestaUAutobusu() + ". ");
//
//		System.out.println("Broj zauzetih mesta u autobusu je: " + nizBrojevaZadatak5.brojZauzetihMesta() + ". ");
//		nizBrojevaZadatak5.ispisStatusaMestaUAutobusu();

		// ZADATAK 6, 109. STRANA, PRAKTIKUM
//		Nizovi nizBrojevaZadatak6 = new Nizovi();
//
//		int[] niz1 = new int[4];// ako metoda prima nizove, prvo ih moramo formirati
//		niz1[0] = 1;
//		niz1[1] = 5;
//		niz1[2] = 7;
//		niz1[3] = 8;
//
//		int[] niz2 = new int[2];
//		niz2[0] = 5;
//		niz2[1] = 9;
//
//		int[] niz3 = nizBrojevaZadatak6.spajanjeDvaNizaUTreci(niz1, niz2);// metoda spaja nizove, mi ih u mainu
//																			// formiramo i ispisujemo koji hocemo da
//																			// budu spojeni, dodajemo trecem nizu
//
//		nizBrojevaZadatak6.nizCenihBrojevaIspis(niz3);
//		
//		int[] nizZaKopiranje=new int[10];
//		nizZaKopiranje[0]=1;
//		nizZaKopiranje[1]=2;
//		nizZaKopiranje[2]=3;
//		nizZaKopiranje[3]=4;
//		nizZaKopiranje[4]=5;
//		nizZaKopiranje[5]=6;
//		nizZaKopiranje[6]=7;
//		nizZaKopiranje[7]=8;
//		nizZaKopiranje[8]=9;
//		nizZaKopiranje[9]=10;
//		
//		int[] kopijaNiza=nizBrojevaZadatak6.kopijaNizaCelihBrojeva(nizZaKopiranje);
//		Nizovi.nizCenihBrojevaIspis(kopijaNiza);
		Nizovi visedimenzionalniNiz = new Nizovi(3, 3);
		visedimenzionalniNiz.pretvarajeMatriceU0Matricu();
		visedimenzionalniNiz.ispisMatrice();
		visedimenzionalniNiz.pretvoriUJedinicnuMatricu();
		visedimenzionalniNiz.ispisMatrice();

	}

}
