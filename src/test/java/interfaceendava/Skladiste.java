package interfaceendava;

public class Skladiste implements SluzbaNabavke {

	int stanjeNaSkladistu = 1000;

	public void dodajRobu(int brojKomadaRobeNabavka) {
		// TODO Auto-generated method stub

		if (brojKomadaRobeNabavka > 0)
			stanjeNaSkladistu = stanjeNaSkladistu + brojKomadaRobeNabavka;
		else
			System.out.println("Greska, broj komada mora biri veci od nule. ");

	}

}
