package endava;

public class Formula1Tim {

	String naziv;
	OsobaFormula menadzer;
	OsobaFormula prviVozac;
	OsobaFormula drugiVozac;

	public void ispisi() {
		// Inicijalizuju se u main metodi pre pozivanja
//		menadzer = new OsobaFormula();
//		prviVozac = new OsobaFormula();
//		drugiVozac = new OsobaFormula();
		System.out.println("Naziv tima: " + naziv);
		System.out.println("MENADZER");
		menadzer.ispisiSvePodatkeOOsobi();
		System.out.println("PRVI VOZAC");
		prviVozac.ispisiSvePodatkeOOsobi();
		System.out.println("DRUGI VOZAC");
		drugiVozac.ispisiSvePodatkeOOsobi();

	}
}
