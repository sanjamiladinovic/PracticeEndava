package abstraktnaklasaendava;

public class Kocka extends GeometrijskoTelo {

	int duzinaStranice;

	int getDuzinaStranice() {
		
		return duzinaStranice;
	}

	void setDuzinaStranice(int duzinaStranice) {
		if (duzinaStranice > 0)
			this.duzinaStranice = duzinaStranice;
		else
			System.out.println("Duzina stranice mora da bude veca od 0. ");

	}

	@Override
	void izracunajPovrsinu() {
		// TODO Auto-generated method stub
		povrsina = duzinaStranice * duzinaStranice * 6;
	}

	@Override
	void izracunajZapreminu() {
		// TODO Auto-generated method stub
		zapremina = duzinaStranice * duzinaStranice * duzinaStranice;
	}

}
