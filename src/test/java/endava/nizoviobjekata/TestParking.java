package endava.nizoviobjekata;

public class TestParking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parking park = new Parking(50);
		park.uvediVozilo("BG 123-456");
		park.uvediVozilo("NS 234-56");

		park.ispisi();
		park.ispisiBGTablice();

	}

}
