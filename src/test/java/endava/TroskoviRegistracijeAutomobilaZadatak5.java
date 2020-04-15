package endava;

public class TroskoviRegistracijeAutomobilaZadatak5 {

	private static double iznosDoprinosaZaRegistraciju;

	static double obracunajDoprinos(AutomobilZadatak5 auto) {
		if (auto.kubikazaMotoraAutomobila > 400 && auto.kubikazaMotoraAutomobila < 10000) {
			if (auto.kubikazaMotoraAutomobila < 1000)

				return iznosDoprinosaZaRegistraciju = 145;
			if (auto.kubikazaMotoraAutomobila >= 1000 && auto.kubikazaMotoraAutomobila < 1400)
				return iznosDoprinosaZaRegistraciju = 200.0;
			if (auto.kubikazaMotoraAutomobila >= 1400 && auto.kubikazaMotoraAutomobila < 2500)
				return iznosDoprinosaZaRegistraciju = 250.0;
			if (auto.kubikazaMotoraAutomobila >= 2500)
				return iznosDoprinosaZaRegistraciju = 413.3;
			return 0;
		} else {
			System.out.println("Greska, kubikaza auta mora da bude izmedju 400 i 10000");
			return 0;// mora da se napise da bi java protumacila da ce da vrati neku vrednost ako se
						// ne izvrsi nijedna if naredba.
		}
	}

	static double obracunajOsiguranje(AutomobilZadatak5 auto) {

		if (auto.snagaMotoraAutomobila > 20 && auto.snagaMotoraAutomobila < 1000) {
			if (auto.snagaMotoraAutomobila < 55)
				return 3000.0;
			if (auto.snagaMotoraAutomobila >= 55 && auto.snagaMotoraAutomobila < 75)
				return 4500.0;
			if (auto.snagaMotoraAutomobila >= 75 && auto.snagaMotoraAutomobila < 150)
				return 7300.0;
			if (auto.snagaMotoraAutomobila >= 150)
				return 9000.0;
			return 0;// mora da se napise da bi java protumacila da ce da vrati neku vrednost ako se
						// ne izvrsi nijedna if naredba.
		}

		else {
			System.out.println("Snaga motora nije u dozvoljenim granicama.");
			return 0;
		}

	}

	static void ispisiSveTroskoveRegistracije(AutomobilZadatak5 auto) {
		double doprinos = obracunajDoprinos(auto);
		System.out.println("Iznos doprinosa za automobil " + doprinos);
		double osiguranje = obracunajOsiguranje(auto);
		System.out.println("Iznos osiguranja za automobil " + osiguranje);

	}
}
