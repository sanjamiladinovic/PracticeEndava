package nasledjivanjeendava;

public class TestKucniAparat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KucniAparat kAparat = new KucniAparat("Philips", "SQ2", true);
		Televizor tv = new Televizor("LG", "LT33", false, 2);
		Radio rad = new Radio("Sony", "SR", false, 88.9);

		kAparat.iskljuciAparat();
		tv.ukljuciAparat();
		tv.promeniProgramNavise();
		rad.ukljuciAparat();
		rad.setFrekvencija(105.6);
		kAparat.ispisi();
		tv.ispisi();
		rad.ispisi();

	}

}
