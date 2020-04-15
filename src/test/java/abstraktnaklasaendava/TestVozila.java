package abstraktnaklasaendava;

public class TestVozila {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automobil auto = new Automobil();
		Avion avio = new Avion();

		auto.setMarka("Merdedes");
		auto.setModel("E220");
		avio.setMarka("Boeing");
		avio.setModel("747");
		auto.ispisi();
		avio.ispisi();
	}
}
