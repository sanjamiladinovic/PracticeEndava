package endava.exception;

public class TestProizvod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Proizvod pr = new Proizvod();
		try {
			pr.setNaziv(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			pr.setSifra(002);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			pr.setCena(22.22);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(pr);
	}

}
