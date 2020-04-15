package endava;

public class TestFormula1Tim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Formula1Tim tim = new Formula1Tim();
		tim.naziv = "Scuderia Ferrari Marlboro";
		// Ovde inicijalizujem objekte u main-u

		tim.menadzer = new OsobaFormula();
		tim.menadzer.ime = "Berny";
		tim.menadzer.prezime = "Eckleston";
		tim.prviVozac = new OsobaFormula();
		tim.prviVozac.ime = "Kimi";
		tim.prviVozac.prezime = "Raikkonen";
		tim.drugiVozac = new OsobaFormula();
		tim.drugiVozac.ime = "Felipe";
		tim.drugiVozac.prezime = "Massa";
		tim.ispisi();
	}

}
