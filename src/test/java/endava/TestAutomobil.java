package endava;

public class TestAutomobil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automobil auto=new Automobil();
		auto.marka="Ford focus";
		auto.registracija="BG-1992-DJ";
		auto.brojMotora=123456;
		
		//Atribut vlasnik je objekat klase osoba pa prvo mora da se inicijalizuje
		auto.vlasnik=new OsobaAutomobil();
		auto.vlasnik.ime="Pera Peric";
		auto.vlasnik.jmbg="1909987715055";
		auto.vlasnik.adresa="Resavska 40";
		System.out.println("Vlasnik: "+auto.vlasnik.ime+"  JMBG: "+auto.vlasnik.jmbg+"  Adresa: "+auto.vlasnik.adresa);
	}

}
