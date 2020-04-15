package endava.nizoviobjekata;

public class TestAvion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Avion avion = new Avion();
		avion.uvediPutnika(21, "Jovan Jovanovic", 53);
		avion.uvediPutnika(31, "Milos Milosevic", 23);
		avion.uvediPutnika(41, "Ana Jovanovic", 22);
		avion.ispisiSve();
		avion.ispisiJovanovice();
		System.out.println("Prosecna starost putnika: "+ avion.prosecnaStarostPutnika());

	}

}
