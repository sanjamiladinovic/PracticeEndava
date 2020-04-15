package interfaceendava;

public class NapredniAutomatNovca implements AutomatNovcaInterface {

	double stanjeUNaprednomAutomatu = 20000.0;

	public void uloziNovac(double iznos) {
		// TODO Auto-generated method stub
		if (iznos > 0 && iznos <= 20000)
			stanjeUNaprednomAutomatu = stanjeUNaprednomAutomatu + iznos;
		else if (iznos > 20000)
			System.out.println("Greska! Maksimalni iznos za ulaganje je 20000!");
		else
			System.out.println("Greska.");

	}

	public void podigniNovac(double iznos) {
		// TODO Auto-generated method stub
		if (iznos > 0 && iznos <= 10000)
			stanjeUNaprednomAutomatu = stanjeUNaprednomAutomatu - iznos;
		else if (iznos > 10000)
			System.out.println("Greska! Maksimalni iznos za podizanje je 10000!");
		else
			System.out.println("Greska.");
	}

	void ispisi() {

		System.out.println("Stanje novca u automatu je: " + stanjeUNaprednomAutomatu
				+ "maximalni iznos za ulaganje je 20.000,00 rsd, a za poduzanje 10.000,00 rsd.");
	}

}
