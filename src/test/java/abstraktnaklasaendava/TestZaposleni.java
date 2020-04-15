package abstraktnaklasaendava;

public class TestZaposleni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KancelarijskiRadnik krad = new KancelarijskiRadnik();
		Menadzer men = new Menadzer();
		krad.izracunajPlatu(200);
		men.izracunajPlatu(250);
		System.out.println("Plata radnika: " + krad.getPlata() + "Plata menadzera:" + men.getPlata());
	}

}
