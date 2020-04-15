package endava.nizoviobjekata;

public class TestDnevnaPrognoza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DnevnaPrognoza dp = new DnevnaPrognoza(3);
		dp.unesi("Beograd", 17);
		dp.unesi("Novi Sad", 13);
		dp.unesi("Nis", 16);
		dp.ispisi();

	}

}
