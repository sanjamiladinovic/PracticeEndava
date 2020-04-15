package interfaceendava;

public class TestProdavnica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prodavnica prod = new Prodavnica();
		Skladiste sklad = new Skladiste();
		Dobavljac dob = new Dobavljac();
		prod.ispisi();
		dob.izvrsiIsporuku(prod, 100);
		dob.izvrsiIsporuku(sklad, 500);
		prod.ispisi();

	}

}
