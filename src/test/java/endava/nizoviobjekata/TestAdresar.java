package endava.nizoviobjekata;

public class TestAdresar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adresar adresar = new Adresar();

		Kontakt kontakt = new Kontakt();
		kontakt.setImePrezime("Pera Peric");
		kontakt.setAdresa("Oblakovska 1");
		kontakt.setTelefon(123456);
		adresar.unesiUAdresar(kontakt);

		Kontakt kontakt1 = new Kontakt();
		kontakt1.setImePrezime("Mika Mikic");
		kontakt1.setAdresa("Strahinjica Bana 1");
		kontakt1.setTelefon(654321);
		adresar.unesiUAdresar(kontakt1);

		adresar.unesiUAdresar("Laza Lazic", "Kneza Milosa 1", 567890);
		adresar.unesiUAdresar("Zika Zikic", "Karadjordjeva 1", 987654);

		adresar.ispisi();
	}

}
