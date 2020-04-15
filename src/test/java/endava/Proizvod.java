package endava;

public class Proizvod {
	int sifraProizvoda;
	String nazivProizvoda;

	public Proizvod(String nazivProizvoda) {
		this.nazivProizvoda = nazivProizvoda;
	}
	public Proizvod(int sifraProizvoda,String nazivProizvoda) {
		this.sifraProizvoda=sifraProizvoda;
		this.nazivProizvoda = nazivProizvoda;
	}
	public void ispisi() {
		System.out.println(" Sifra:_____"+sifraProizvoda+" Naziv proizvoda:______"+nazivProizvoda);
	}
}
