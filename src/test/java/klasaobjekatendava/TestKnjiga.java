package klasaobjekatendava;

public class TestKnjiga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Knjiga k1 = new Knjiga();
		Knjiga k2 = new Knjiga();
		k1.setNaslov("Istorija lepote");
		k1.setAutor("Umberto Eko");
		k1.setISBN("0-234-567");

		k2.setNaslov("Istorija ruznoce");
		k2.setAutor("Umberto Eko");
		k2.setISBN("0-567-890");

		System.out.println(k1.equals(k2));
		System.out.println(k1);
		System.out.println(k2);

	}

}
