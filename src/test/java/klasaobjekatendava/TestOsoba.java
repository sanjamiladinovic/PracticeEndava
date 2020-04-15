package klasaobjekatendava;

public class TestOsoba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Osoba o1 = new Osoba();
		Osoba o2 = new Osoba();
		o1.setIme("Pera");
		o1.setPrezime("Peric");
		o1.setJMBG("1010980710034");
		o2.setIme("Pera");
		o2.setPrezime("Peric");
		o2.setJMBG("1010980710034");
		if (o1.equals(o2))
			System.out.println("Radi se o istoj osobi. ");
		else
			System.out.println("Nije ista osoba u pitanju.");

		System.out.println(o1);
		System.out.println(o2);
	}

}
