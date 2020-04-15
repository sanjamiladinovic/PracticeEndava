package nasledjivanjeendava;

import java.util.GregorianCalendar;

public class TestProizvod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GregorianCalendar datum = new GregorianCalendar();
		datum.set(2007, 12, 15);

		PrehrambeniProizvod pp1 = new PrehrambeniProizvod("hleb", 30.0, datum);
		PrehrambeniProizvod pp2 = new PrehrambeniProizvod();
		pp2.setNaziv("senf");
		pp2.cena = 120.5;
		System.out.println("Naziv i cena respektivno za proizvod 1: " + pp1.getNaziv() + ", " + pp1.getCena());
		System.out.println("Naziv i cena respektivno za proizvod 2: " + pp2.getNaziv() + ", " + pp2.getCena());
	}

}
