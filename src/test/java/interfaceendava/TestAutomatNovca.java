package interfaceendava;

public class TestAutomatNovca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AutomatNovca an = new AutomatNovca();
		NapredniAutomatNovca nan = new NapredniAutomatNovca();
		
		an.uloziNovac(3000);
		nan.podigniNovac(9999);
		an.ispisiIznosUAutomatu();
		nan.ispisi();

	}

}
