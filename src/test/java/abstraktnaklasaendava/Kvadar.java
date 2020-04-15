package abstraktnaklasaendava;

public class Kvadar extends GeometrijskoTelo {
	int duzinaKvadra;
	int sirinaKvadra;
	int visinaKvadra;

	int getDuzinaKvadra() {

		return duzinaKvadra;
	}

	void setDuzinaKvadra(int duzinaKvadra) {
		if (duzinaKvadra > 0)
			this.duzinaKvadra = duzinaKvadra;
		else
			System.out.println("Duzina kvadra mora da bude veca od 0. ");
	}

	int getsirinaKvadra() {

		return sirinaKvadra;
	}

	void setsirinaKvadra(int sirinaKvadra) {
		if (sirinaKvadra > 0)
			this.sirinaKvadra = sirinaKvadra;
		else
			System.out.println("Sirina kvadra mora da bude veca od 0. ");
	}

	int getVisinaKvadra() {

		return visinaKvadra;
	}

	void setvisinaKvadra(int visinaKvadra) {
		if (visinaKvadra > 0)
			this.visinaKvadra = visinaKvadra;
		else
			System.out.println("Visina kvadra mora da bude veca od 0. ");
	}

	@Override
	void izracunajPovrsinu() {
		// TODO Auto-generated method stub
		povrsina = 2 * (duzinaKvadra * sirinaKvadra) + 2 * (duzinaKvadra * sirinaKvadra);

	}

	@Override
	void izracunajZapreminu() {
		// TODO Auto-generated method stub
		zapremina = duzinaKvadra * sirinaKvadra * visinaKvadra;
	}

}
