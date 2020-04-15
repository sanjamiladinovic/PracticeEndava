package interfaceendava;

public class AutomatNovca implements AutomatNovcaInterface {

	double stanjeNovcaUAutomatu = 5000.0;

	public void uloziNovac(double iznos) {
		// TODO Auto-generated method stub
		if (iznos > 0)
			stanjeNovcaUAutomatu = stanjeNovcaUAutomatu + iznos;
		else
			System.out.println("Greska! Iznos mora biti veci od 0. ");

	}

	public void podigniNovac(double iznos) {
		// TODO Auto-generated method stub

		if (iznos > 0 && stanjeNovcaUAutomatu > iznos)
			stanjeNovcaUAutomatu = stanjeNovcaUAutomatu - iznos;
		else
			System.out.println("Greska! Iznos mora biti veci od 0 i u automatu mora biti novca");

	}
	
	void ispisiIznosUAutomatu() {
		System.out.println("Stanje u automatu je: " + stanjeNovcaUAutomatu);
	}

}
