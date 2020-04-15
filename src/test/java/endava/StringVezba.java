package endava;

public class StringVezba {

//Zadatak 1, strana 118, praktikum
//
//	static int kolikoImaSlovaA(String rec) {
//		int slovoA = 0;
//		for (int i = 0; i < rec.length(); i++) {
//
//			if (rec.charAt(i) == 'a' || rec.charAt(i) == 'A')
//				slovoA++;
//
//		}
//		return slovoA;
//	}
//
//	String text;
//
//	public StringVezba() {
//		text = "nepoznat";
//	}
//
//	public StringVezba(String text) {
//		if (text != null)
//			this.text = text;
//		else {
//			this.text = "nepoznat";
//			System.out.println("Greska! Atribut je nepoznat. ");
//		}
//
//	}
//
//	String getText() {
//		return this.text;
//	}
//
//	void setText(String text) {
//
//		if (text != null)
//			this.text = text;
//		else
//
//			System.out.println("Greska! Atribut je nepoznat. ");
//	}
//
//	void dodajTextNaKraj(String dodajTextNaKraj) {
//		if (dodajTextNaKraj == null)
//			System.out.println("Greska! Novi text je null. ");
//		else {
//			if (text.equals("nepoznat"))
//				this.text = dodajTextNaKraj;
//			else
//				this.text = this.text + dodajTextNaKraj;
//		}
//	}
//
//	void dodajTextNaPocetak(String dodajTextNaPocetak) {
//		if (dodajTextNaPocetak == null)
//			System.out.println("Greska! Novi text je null. ");
//		else {
//			if (text.equals("nepoznat"))
//				this.text = dodajTextNaPocetak;
//			else
//				this.text = dodajTextNaPocetak + this.text;
//		}
//	}
//
//	void proveriText(String text) {
//		if (text.equals(this.text))
//			System.out.println("Text je isti. ");
//		else
//			System.out.println("Text je razlicit. ");
//	}
//
//	void proveriTextBezObziraNaCase(String text) {
//		if (text.equalsIgnoreCase(this.text))
//			System.out.println("Text je isti bez obzira na velicinu slova. ");
//		else
//			System.out.println("Text je razlicit bez obzira na velicinu slova. ");
//	}
//
//	void proveriTextLexicografski(String text) {
//
//		if (this.text.compareToIgnoreCase(text) > 0) {// ako je >0 ako je prva vrednost posle druge vrednosti, 0 ako su
//														// jednaki, a <0 ako je prva vrednost pre druge
//			System.out.println("Tekst iz parametra je pre texta iz atributa. ");
//			if (this.text.compareToIgnoreCase(text) < 0)
//				System.out.println("Tekst iz parametra je posle texta iz atributa. ");
//			if (this.text.compareToIgnoreCase(text) == 0)
//				System.out.println("Tekst iz parametra je jednak textu iz atributa. ");
//		}
//
//	}
//
//	// Zadatak 2, strana 120, praktikum
//
//	String text1 = "nepoznat";
//
//	String getText1() {
//
//		return text1;
//	}
//
//	void setText1(String text1) {
//
//		if (text1 != null)
//
//			this.text1 = text1;
//		else
//			System.out.println("Greska, text je prazan! ");
//	}
//
//	int brojZnakovaUTextu() {
//		return text1.length();
//	}
//
//	int brojMalogA() {
//		int brojacA = 0;
//		for (int i = 0; i < text1.length(); i++) {
//			if (text1.charAt(i) == 'a')
//				brojacA++;
//		}
//		return brojacA;
//	}
//
//	int brojPonavljanjaSlova(char slovo) {
//		int brojacSlova = 0;
//		for (int i = 0; i < text1.length(); i++) {
//			if (text1.charAt(i) == slovo)
//				brojacSlova++;
//		}
//		return brojacSlova;
//	}
//
//	int brojRecenicaUTextu() {
//		int brojacRecenica = 0;
//
//		for (int i = 0; i < text1.length(); i++) {
//			if (text1.charAt(i) == '.' || text1.charAt(i) == '?' || text1.charAt(i) == '!') {
//
//				brojacRecenica++;
//			}
//		}
//		return brojacRecenica;
//	}
//
//	int brojSamoglasnika() {
//
//		int brojSamoglasnika = brojPonavljanjaSlova('a') + brojPonavljanjaSlova('e') + brojPonavljanjaSlova('i')
//				+ brojPonavljanjaSlova('o') + brojPonavljanjaSlova('u') + brojPonavljanjaSlova('A')
//				+ brojPonavljanjaSlova('E') + brojPonavljanjaSlova('I') + brojPonavljanjaSlova('O')
//				+ brojPonavljanjaSlova('U');
//		return brojSamoglasnika;
//	}
//
//	char znakKojiSeNajvisePonavlja() {
//		int maxBroj = 0;
//		char maxSlovo = text1.charAt(0);
//		for (int i = 0; i < text1.length(); i++) {
//
//			if (text1.charAt(i) != ' ' && brojPonavljanjaSlova(text1.charAt(i)) > maxBroj) {
//				maxBroj = brojPonavljanjaSlova(text1.charAt(i));
//				maxSlovo = text1.charAt(i);
//			}
//		}
//		return maxSlovo;
//	}
//
//	char znakKojiSeNajmanjePonavlja() {
//
//		int minBroj = text1.length() + 1;
//		char minSlovo = text1.charAt(0);
//		for (int i = 0; i < text1.length(); i++) {
//
//			if (text1.charAt(i) != ' ' && brojPonavljanjaSlova(text1.charAt(i)) < minBroj) {
//
//				minBroj = brojPonavljanjaSlova(text1.charAt(i));
//				minSlovo = text1.charAt(i);
//			}
//
//		}
//		return minSlovo;
//	}
//
//	int vratiIndeksPrvogPojavljenogSlovaA() {
//
//		return text1.indexOf('a');
//
//	}
//
//	int vratiIndeksPoslednjegPojavljivanjaSlovaA() {
//
//		return text1.lastIndexOf('a');
//
//	}
//
//	int indeksPrvogPojavljivanja(char slovo) {
//		return text1.indexOf(slovo);
//	}
//
//	int indeksPoslednjegPojavljivanja(char slovo) {
//		return text1.lastIndexOf(slovo);
//	}
//
//	int indeksDrugogPojavljivanjaSlovaA() {
//		int brojacA = 0;
//		int index = 0;
//		for (int i = 0; i < text1.length(); i++) {
//			if (text1.charAt(i) == 'a') {
//				brojacA++;
//				if (brojacA == 2)
//					index = i;
//
//			}
//		}
//		return index;
//	}
//
//	int vratiIndeksPretposlednjegSlovaA() {
//
//		int indexPretposlednjegSlova = text1.lastIndexOf('a', text1.lastIndexOf('a') - 1);
//
//		return indexPretposlednjegSlova;
//	}
//
//	// ZADATAK 3, strana 123, PRAKTIKUM
//
//	String textZadatak3 = "nepoznat";
//
//	String getText3() {
//
//		return textZadatak3;
//	}
//
//	void setText3(String textZadatak3) {
//
//		if (textZadatak3 != null)
//
//			this.textZadatak3 = textZadatak3;
//		else
//			System.out.println("Greska, text je prazan! ");
//	}
//
//	String vratiDeoTextaBezPrvogSlova() {
//
//		String noviString = textZadatak3.substring(1);
//
//		return noviString;
//
//	}
//
//	String vratiDeoTextaBezPrvaCetiriSlova() {
//
//		String noviString = textZadatak3.substring(4);
//
//		return noviString;
//
//	}
//
//	String vratiTextBezPrveReci() {
//		int indexPrvogPraznogMesta = textZadatak3.indexOf(' ');// trazi prvo prazno mesto, ako ga nema vraca -1
//		if (indexPrvogPraznogMesta == -1)// ako ima jednu rec
//			return null;
//		String splitString = textZadatak3.substring(indexPrvogPraznogMesta + 1);// substrin vraca od string od znaka pa
//																				// do
//																				// kraja
//		return splitString;
//
//	}
//
//	String vratiTextBezPrveRecenice() {
//		int indexPrveTacke = textZadatak3.indexOf('.');
//		if (indexPrveTacke == -1)
//			return null;
//		String splitTextAroundFullStopAndReturnResttoTheEnd = textZadatak3.substring(indexPrveTacke + 1);// +1 da ne bi
//																											// vratio i
//																											// razmak
//		return splitTextAroundFullStopAndReturnResttoTheEnd;
//
//	}
//
//	String vratiPoslednjuRecIzTexta() {
//
//		int indexPoslednjegRazmaka = textZadatak3.lastIndexOf(' ');
//		if (indexPoslednjegRazmaka == -1)
//			return textZadatak3;
//		String splitAroundLastSpaceAndReturnRestToTheAnd = textZadatak3.substring(indexPoslednjegRazmaka + 1);
//		return splitAroundLastSpaceAndReturnRestToTheAnd;
//	}
//
//	String poslednjaRecenica() {
//
//		int indexPoslednjeTacke = textZadatak3.lastIndexOf('.');
//		if (indexPoslednjeTacke == -1) {
//			return null;
//		}
//		int indexPretposlednjeTacke = textZadatak3.lastIndexOf('.',indexPoslednjeTacke - 1);// pretposlednji indeks je
//																						// poslednji -1
//		if (indexPretposlednjeTacke == -1)// uvek je -1 ako ne nadje
//			return null;
//		String poslednjaRecenica = textZadatak3.substring(indexPretposlednjeTacke + 1);// indeks u substringu pa do
//																						// kraja vraca, +1 da ne bi
//																						// vratio i tacku
//		return poslednjaRecenica;
//	}
//
//	String textBezPrvogIPoslednjegSlova() {
//
//		int indexPrvogSlova = textZadatak3.indexOf(1);// jer ce onda preskociti prvi indeks i ostaviti prvo slovo
//		String stringBezPrvogSlova = textZadatak3.substring(indexPrvogSlova);
//		int indexPoslednjegSlova = stringBezPrvogSlova.lastIndexOf(stringBezPrvogSlova.length() - 1);
//		String stringBezPrvogIZadnjegSlova = stringBezPrvogSlova.substring(indexPoslednjegSlova);
//		return stringBezPrvogIZadnjegSlova;
//
//		/**
//		 * Ovako su oni
//		 * 
//		 * String textBezPrvogIPoslednjegSlova=
//		 * textZadatak3.substring(1,textZadatak3.length()-1); return result;
//		 */
//
//	}
//
//	String textOdTrecegDoPretposlednjegSlova() {
//
//		String textOdTrecegDoPretposlednjegSlova = textZadatak3.substring(2, textZadatak3.length() - 2);
//		return textOdTrecegDoPretposlednjegSlova;
//	}
//
//	String drugaRecIzTexta() {
//		int indexPrvogRazmaka = textZadatak3.indexOf(' ');
//		if (indexPrvogRazmaka == -1)
//			return null;
//		int indexDrugogPraznogMesta = textZadatak3.indexOf(' ', indexPrvogRazmaka + 1);// drugo po redu je indeks
//																						// od(kreni od prvog razmaka bez
//																						// njega i idi do sledeceg)
//
//		// ako postoje samo dve reci
//		if (indexDrugogPraznogMesta == -1)// nece naci dtugi razmak, tako da ce biti -1
//			return textZadatak3.substring(indexPrvogRazmaka + 1);
//
//		return textZadatak3.substring(indexPrvogRazmaka + 1, indexDrugogPraznogMesta);
//	}
//
//	boolean daLiJeNoviTextNaPocetkuTexta(String noviText) {
//		if (textZadatak3.startsWith(noviText)) {
//			return true;
//		}
//		if (noviText == null)
//			return false;
//		else
//			return false;
//
//	}
//
//	boolean daLiJeNoviTextNaKrajuTexta(String noviText) {
//		if (textZadatak3.endsWith(noviText))
//			return true;
//		if (noviText == null)
//			return false;
//		else
//			return false;
//
//	}

//	static int ukupanBrojReci(String text) {
//		int ukupanBrojReci = 0;
//
//		String[] nizReci = text.split(" ");
//
//		for (int i = 0; i < nizReci.length; i++) {
//
//			ukupanBrojReci++;
//		}
////moglo je se i napisati i samo return nizReci.length();
//		return ukupanBrojReci;
//	}
//
//	static int prebrojRecLep(String text) {
//		int brojacReciLep = 0;
//		String[] razdvojeneReci = text.split(" ");
//		for (int i = 0; i < razdvojeneReci.length; i++) {
//
//			if (razdvojeneReci[i].equalsIgnoreCase("lep"))
//				brojacReciLep++;
//
//		}
//		return brojacReciLep;
//	}
//
//	static int brojReciUNekomTextu(String text, String rec) {
//		int brojReci = 0;
//		String[] textPodeljenNaReci = text.split(" ");
//		for (int i = 0; i < textPodeljenNaReci.length; i++) {
//			if (textPodeljenNaReci[i].equalsIgnoreCase(rec) || textPodeljenNaReci[i].equalsIgnoreCase(rec + "."))
//				brojReci++;
//
//		}
//
//		return brojReci;
//
//	}
//
//	static String recKojaSePojavljujeMax(String text) {
//
//		int brojacMaxPjavljivanja = 1;
//		String[] textIzdeljenNaReci = text.split(" ");
//		String maxRec = textIzdeljenNaReci[0];
//		for (int i = 0; i < textIzdeljenNaReci.length; i++) {
//
//			if (brojReciUNekomTextu(text, textIzdeljenNaReci[i]) > brojacMaxPjavljivanja) {
//				maxRec = textIzdeljenNaReci[i];
//				brojacMaxPjavljivanja = brojReciUNekomTextu(text, textIzdeljenNaReci[i]);
//			}
//
//		}
//		return maxRec;
//	}
//
//	static String minPojavljivanjeReci(String text) {
//
//		String[] podeljenTextNaReci = text.split(" ");
//		int brojacMinReci = podeljenTextNaReci.length + 1;
//		String minRec = podeljenTextNaReci[0];
//
//		for (int i = 0; i < podeljenTextNaReci.length; i++) {
//
//			if (brojReciUNekomTextu(text, podeljenTextNaReci[i]) < brojacMinReci) {
//				brojacMinReci = brojReciUNekomTextu(text, podeljenTextNaReci[i]);
//				minRec = podeljenTextNaReci[i];
//			}
//			return minRec;
//		}
//
//		return minRec;
//
//	}
//	String[] sedista;
//
//	public StringVezba() {
//
//		sedista = new String[50];
//		for (int i = 0; i < sedista.length; i++) {
//			sedista[i] = null;
//		}
//	}
//
//	public String getImeIPrezimePutnika(int brojSedista) {
//
//		return sedista[brojSedista];
//
//	}
//
//	public void uvediPutnika(int redniBrojMesta, String imeIPrezime) {
//
//		if (sedista[redniBrojMesta] == null) {
//			sedista[redniBrojMesta] = imeIPrezime;
//			System.out.println("Putnik: " + imeIPrezime + " je uveden na mesto " + redniBrojMesta);
//
//		} else
//			System.out.println("Sediste je popunjeno: " + redniBrojMesta + " sedi putnik: " + imeIPrezime
//					+ " Nije mogao biti uveden putnik: " + sedista[redniBrojMesta]);
//
//	}
//
//	public void izvediPutnika(int redniBrojMesta) {
//		if (sedista[redniBrojMesta] != null) {
//			System.out.println("Sediste je popunjeno: " + redniBrojMesta + " putnik koji je izveden je: "
//					+ sedista[redniBrojMesta]);
//			sedista[redniBrojMesta] = null;
//
//		} else
//			System.out.println("Sediste" + redniBrojMesta + " je slobodno. ");
//
//	}
//
//	int brojSlobodnihMesta() {
//		int brojSlobodnihMesta = 0;
//		for (int i = 0; sedista[i] == null; i++) {
//
//			brojSlobodnihMesta++;
//		}
//		return brojSlobodnihMesta;
//
//	}
//
//	int brojZauzetihMesta() {
//		int brojZauzetihMesta = 0;
//		for (int i = 0; sedista[i] != null; i++) {
//
//			brojZauzetihMesta++;
//		}
//		return brojZauzetihMesta;
//
//	}
//
//	int proveriKolikoImaNikola() {
//
//		int brojNikola = 0;
//
//		for (int i = 0; i < 50; i++) {
//			if (sedista[i] != null) {
//
//				String ime = sedista[i].substring(0, sedista[i].indexOf(' '));
//				if (ime.equals("Nikola"))
//				
//				brojNikola++;
//			}
//			
//		}
//		System.out.println("Broj Nikola je: " + brojNikola);
//		return brojNikola;
//	}
//
//	public void ispisiSveArsice() {
//
//		for (int i = 0; i < 50; i++) {
//
//			if (sedista[i] != null) {
//				String prezime = sedista[i].substring(sedista[i].indexOf(' ') + 1, sedista[i].length());
//				if (prezime.equals("Arsic"))
//
//					System.out.println("Imena svih koji se prezivaju Arsic su: "
//							+ sedista[i].substring(0, sedista[i].indexOf(' ')));
//			}
//
//		}
//
//	}
//
//	public void ispisiStatusSedista() {
//		for (int i = 0; i < 50; i++) {
//
//			if (sedista[i] != null)
//				System.out.println("Ime i prezime putnika: " + sedista[i] + "broj sedista" + i);
//			else
//				System.out.println("Mesto: " + i + " je slobodno. ");
//		}
//
//	}

	String[] ocene;

	public StringVezba(String indexImeIPrezimeOcenaZaViseStudenata) {

		if (indexImeIPrezimeOcenaZaViseStudenata == null)
			System.out.println("Greska! ");
		else
			ocene = indexImeIPrezimeOcenaZaViseStudenata.split(";");
	}

	public void ispisiOceneSvihStudenata() {

		for (int i = 0; i < ocene.length; i++) {
			System.out.println(ocene[i]);
		}

	}

	public void ispisiSvePaleStudente() {
		for (int i = 0; i < ocene.length; i++) {
			String ocenaIzdvojena = ocene[i].substring(ocene[i].lastIndexOf(' ') + 1, ocene[i].length());
			if (ocenaIzdvojena.equals(5)) {
				System.out.println("Ispit nisu polozili: " + ocene[i]);
			}
		}
	}

	public void ispisiSveStudenteKojiSuPolozili() {
		System.out.println("Ispit su polozili: ");
		for (int i = 0; i < ocene.length; i++) {
			String ocenaIzdvojena = ocene[i].substring(ocene[i].lastIndexOf(' ') + 1, ocene[i].length());
			if (!ocenaIzdvojena.equals(5)) {
				System.out.println(ocene[i]);
			}
		}
	}

	public void ispisiSveStudenteKojiSuUpisali99Fakultet() {
		System.out.println("Generacija upisana 99e je: ");
		for (int i = 0; i < ocene.length; i++) {
			String indexIzdvojen = ocene[i].substring(ocene[i].indexOf('/') + 1, ocene[i].indexOf('/') + 3);
			if (indexIzdvojen.equals("99")) {
				System.out.println(ocene[i]);
			}
		}
	}

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		// Zadatak 1, strana 118, praktikum
//		System.out.println(StringVezba.kolikoImaSlovaA("Sanja"));
//		StringVezba zadatak1 = new StringVezba();
//		StringVezba zadatak2 = new StringVezba("Danas je lep dan. ");
//		zadatak1.setText("Nebo je plavo. ");
//		zadatak1.dodajTextNaKraj("Sunce sija. ");
//		zadatak2.proveriTextBezObziraNaCase("lep dan");
//		System.out.println(zadatak1.text);
//		System.out.println(zadatak2.text);

		// Zadatak 2, strana 120, praktikum
//		StringVezba zadatak22 = new StringVezba();
//		zadatak22.setText1("Sanja voli Martinu");
//		System.out.println("Indeks drugog pojavljivanja slova a je na: " + zadatak22.indeksDrugogPojavljivanjaSlovaA()
//				+ " mestu. ");
//
//		System.out.println("Pretposlednji index slova a je: " + zadatak22.vratiIndeksPretposlednjegSlovaA());
//		// ZADATAK 3, strana 123, PRAKTIKUM
//
//		StringVezba zadatakTriString = new StringVezba();
//		zadatakTriString.setText3("Sunce sija. Nebo je plavo. Nema nijednog oblaka.");
//		System.out.println("Poslednja rec je: " + zadatakTriString.vratiPoslednjuRecIzTexta());
//		System.out.println("Poslednja recenica je: " + zadatakTriString.poslednjaRecenica());

//		StringVezba zadatak4 = new StringVezba();
//
//		System.out.println("Ukupan broj reci Sanja je: "
//				+ zadatak4.ukupanBrojReci("Sanja Sanja Sanja Sanja Sanja Sanja Sanja Sanja"));
//
//		System.out.println("Broj reci lep: " + zadatak4.prebrojRecLep("Lepo jutro lep dan lepa noc Lep covek"));
//
//		System.out.println(
//				"Broj izabrane reci u textu: " + zadatak4.brojReciUNekomTextu("Lep je zivot. Zivot je lep.", "lep"));
//
//		String minRec = StringVezba.minPojavljivanjeReci("Danas je lep dan. Bas je lep.");
//		String maxRec = StringVezba.recKojaSePojavljujeMax("Danas je lep dan. Bas je lep.");
//		System.out.println("Maximalna rec u textu je: " + maxRec);
//
//		System.out.println("Minimalna rec u textu je: " + minRec);

		// ZADATAK 5 STRANA 127

//		StringVezba zadatak51 = new StringVezba();
//		StringVezba zadatak52 = new StringVezba();
//		zadatak51.uvediPutnika(1, "Petar Petrovic");
//		zadatak51.uvediPutnika(49, "Natasa Jankovic");
//		zadatak51.uvediPutnika(20, "Nikola Arsic");
//		zadatak52.uvediPutnika(2, "Masa Petrovic");
//		zadatak52.uvediPutnika(10, "Nikola Tomic");
//		zadatak52.uvediPutnika(20, "Nikola Trajkovski");
//		zadatak51.ispisiStatusSedista();
//		zadatak52.ispisiStatusSedista();
//		zadatak51.ispisiSveArsice();
//		zadatak52.proveriKolikoImaNikola();
		StringVezba zadatak6 = new StringVezba("0067/99 Bojan Vukovic 10;0103/06 Jelena Jovic 6;0001/99 Mika Lazic 5");
		zadatak6.ispisiSveStudenteKojiSuPolozili();
		zadatak6.ispisiSvePaleStudente();
		zadatak6.ispisiSveStudenteKojiSuUpisali99Fakultet();
	}

}
