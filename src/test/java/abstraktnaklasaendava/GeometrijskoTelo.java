package abstraktnaklasaendava;

public abstract class GeometrijskoTelo {
	int povrsina;
	int zapremina;

	abstract void izracunajPovrsinu();

	abstract void izracunajZapreminu();

	int getPovrsina() {
		izracunajPovrsinu();
		return povrsina;
	}

	int getZapremina() {
		izracunajZapreminu();
		return zapremina;
	}
}
