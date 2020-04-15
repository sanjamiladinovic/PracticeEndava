package endava.liste;

public class TestReliRangLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReliRangLista rrl = new ReliRangLista();
		ReliEkipa audi = new ReliEkipa();
		audi.setImeEkipe("Audi");
		audi.setBrojPoena(30);
		ReliEkipa bmw = new ReliEkipa();
		bmw.setImeEkipe("bmw");
		bmw.setBrojPoena(40);
		ReliEkipa renault = new ReliEkipa();
		renault.setImeEkipe("renault");
		renault.setBrojPoena(20);
		ReliEkipa vw = new ReliEkipa();
		vw.setImeEkipe("vw");
		vw.setBrojPoena(5);
		ReliEkipa subaru = new ReliEkipa();
		subaru.setImeEkipe("subaru");
		subaru.setBrojPoena(30);
		ReliEkipa peugeot = new ReliEkipa();
		peugeot.setImeEkipe("peugeot");
		peugeot.setBrojPoena(33);
		ReliEkipa ford = new ReliEkipa();
		ford.setImeEkipe("ford");
		ford.setBrojPoena(50);
		ReliEkipa mitsubishi = new ReliEkipa();
		mitsubishi.setImeEkipe("mitsubishi");
		mitsubishi.setBrojPoena(4);
		ReliEkipa lancia = new ReliEkipa();
		lancia.setImeEkipe("lancia");
		lancia.setBrojPoena(23);
		ReliEkipa skoda = new ReliEkipa();
		skoda.setImeEkipe("skoda");
		skoda.setBrojPoena(15);
		ReliEkipa seat = new ReliEkipa();
		seat.setImeEkipe("seat");
		seat.setBrojPoena(0);
		rrl.unesiReliEkipePoOpadajucemPoretku(audi);
		rrl.unesiReliEkipePoOpadajucemPoretku(bmw);
		rrl.unesiReliEkipePoOpadajucemPoretku(renault);
		rrl.unesiReliEkipePoOpadajucemPoretku(vw);
		rrl.unesiReliEkipePoOpadajucemPoretku(subaru);
		rrl.unesiReliEkipePoOpadajucemPoretku(peugeot);
		rrl.unesiReliEkipePoOpadajucemPoretku(ford);
		rrl.unesiReliEkipePoOpadajucemPoretku(mitsubishi);
		rrl.unesiReliEkipePoOpadajucemPoretku(lancia);
		rrl.unesiReliEkipePoOpadajucemPoretku(skoda);
		rrl.unesiReliEkipePoOpadajucemPoretku(seat);

		rrl.ispisiRangListu();
		rrl.ispisiPrvoNajslabije();
		rrl.ispisiPrvihDeset();
		
		//ReliEkipa bmw1 = new ReliEkipa();
		//bmw1.setImeEkipe("bmw1");
		bmw.setBrojPoena(55);
		rrl.noviPoeniZaEkpuPromenaMesta(bmw);
		rrl.ispisiRangListu();

	}

}
