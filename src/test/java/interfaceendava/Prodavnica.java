package interfaceendava;

public class Prodavnica implements SluzbaNabavke, SluzbaProdaje {

	int brojProizvoda = 0;

	public void prodajRobu(int brojKomadaRobeProdaja) {
		// TODO Auto-generated method stub

		if (brojKomadaRobeProdaja > 0 && brojProizvoda >= brojKomadaRobeProdaja)
			brojProizvoda = brojProizvoda - brojKomadaRobeProdaja;
		else
			System.out.println("Greska! ");
	}

	public void dodajRobu(int brojKomadaRobeNabavka) {
		// TODO Auto-generated method stub
		if (brojKomadaRobeNabavka > 0)
			brojProizvoda = brojProizvoda + brojKomadaRobeNabavka;
		else
			System.out.println("Greska! ");
	}

	void ispisi() {
		System.out.println("U prodavnici ima: " + brojProizvoda + " proizvoda.");

	}

}
