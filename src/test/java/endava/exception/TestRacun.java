package endava.exception;

public class TestRacun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Racun ra = new Racun();
		ra.setProizvod("Stolica bela");
		ra.setIznosRacuna(6999.90);
		try {
			ra.setBrojRacuna(-129);
		} catch (Exception e) {
			System.out.println("Greska:" + e.getMessage());
		}
		System.out.println(ra);

	}

}
