package endava.liste;

public class TestIspitnaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IspitnaLista il = new IspitnaLista();

		Student st = new Student();
		st.setBrojIndexa("0001/99");
		st.setIme("Ivana");
		st.setPrezime("Stevanovic");
		st.setOcena(10);
		Student st1 = new Student();
		st1.setBrojIndexa("0123/06");
		st1.setIme("Petar");
		st1.setPrezime("Petrovic");
		st1.setOcena(6);
		
		Student st2 = new Student();
		st2.setBrojIndexa("0021/05");
		st2.setIme("Jovan");
		st2.setPrezime("Jovanovic");
		st2.setOcena(8);
		
		il.dodajStudenta(st);
		il.dodajStudenta(st1);
		il.dodajStudenta(st2);
		il.ispisiStareStudente();
		

	}

}
