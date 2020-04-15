package endava.valute;

public class TestKonvertorValute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KonvertorValute kv = new KonvertorValute();
		kv.setKursDolara(60.34);
		kv.setKursEvra(76.89);
		System.out.println(kv.konvertujDinareUDolare(600));
		System.out.println(kv.konvertujDinareUEvre(4500));
		kv.ispisiKursnuListu();
	}

}
