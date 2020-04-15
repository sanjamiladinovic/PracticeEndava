package endava.liste;

public class TestBazaMotocikala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BazaMotocikala bm = new BazaMotocikala();
		Motocikl m1 = new Motocikl();
		Motocikl m2 = new Motocikl();
		Motocikl m3 = new Motocikl();

		m1.setMarka("Honda");
		m1.setModel("CB 750 F");
		m1.setKubikaza(748);
		m2.setMarka("Kawasaki");
		m2.setModel("ER 5");
		m2.setKubikaza(498);
		m3.setMarka("Honda");
		m3.setModel("CB 750 F");
		m3.setKubikaza(748);

		bm.unesiUBazu(m1);
		bm.unesiUBazu(m2);
		bm.ispisi();
		System.out.println("Da li se nalazi u bazi: " + bm.daLiJeUBazi(m3));
		bm.izbaciIzBaze(m3);
		bm.ispisi();
		bm.ispisiKawasaku();

	}

}
