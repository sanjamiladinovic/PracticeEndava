package endava;

public class ZdravstvenaUstanova {
	String naziv;
	String adresa;

	public ZdravstvenaUstanova() {
		naziv = "nepoznato";
		adresa = "nepoznato";
	}

	public ZdravstvenaUstanova(String naziv1) {
		naziv = naziv1;
	}

	public ZdravstvenaUstanova(String naziv1, String adresa1) {
		naziv = naziv1;
		adresa = adresa1;
	}
	public void ispisi() {
		System.out.println("Naziv: "+naziv+"__________Adresa:_________"+adresa);
	}

}
