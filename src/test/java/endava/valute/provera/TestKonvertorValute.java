package endava.valute.provera;

import endava.valute.KonvertorValute;

public class TestKonvertorValute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KonvertorValute kv1 = new KonvertorValute();
		kv1.setKursDolara(55);
		kv1.setKursEvra(80);
		System.out.println(kv1.konvertujDinareUDolare(550));
		System.out.println(kv1.konvertujDinareUEvre(16000));
	

	}

}
