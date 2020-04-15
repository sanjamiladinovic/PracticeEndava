package klasaobjekatendava;

public class Knjiga {

	String naslov;
	String autor;
	String ISBN;

	String getNaslov() {
		return naslov;
	}

	String getAutor() {
		return autor;
	}

	String getISBN() {
		return ISBN;
	}

	void setNaslov(String naslov) {
		if (naslov != null)
			this.naslov = naslov;
		else
			System.out.println("Greska!");
	}

	void setAutor(String autor) {
		if (autor != null)
			this.autor = autor;
		else
			System.out.println("Greska!");
	}

	void setISBN(String ISBN) {
		if (ISBN != null)
			this.ISBN = ISBN;
		else
			System.out.println("Greska!");
	}

	public String toString() {
		return "Naslov: " + naslov + "Autor: " + autor + "ISBN: " + ISBN;

	}

	public boolean equals(Object o) {

		Knjiga k = (Knjiga) (o);
		if (ISBN.equals(k.getISBN()))

			return true;
		else
			return false;

	}

}
