package endava.exception;

public class TestOsoba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Osoba osoba1 = new Osoba();
		osoba1.setIme("Sanja");
		osoba1.setPrezime("Miladinovic");
		osoba1.setGodine(-250);
		osoba1.setTezina(0);
		osoba1.setVisina(251);
		System.out.println(osoba1.toString());
	}

}
