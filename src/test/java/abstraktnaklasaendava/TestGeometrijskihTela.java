package abstraktnaklasaendava;

public class TestGeometrijskihTela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kocka koc = new Kocka();
		Kvadar kva = new Kvadar();

		koc.setDuzinaStranice(26);
		kva.setDuzinaKvadra(20);
		kva.setsirinaKvadra(10);
		kva.setvisinaKvadra(30);

		System.out.println(koc.getPovrsina());
		System.out.println(koc.getZapremina());
		System.out.println(kva.getPovrsina());
		System.out.println(kva.getZapremina());

	}

}
