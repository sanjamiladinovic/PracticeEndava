package endava.ucitavanjesatastature;

public class Knjiga {

	private String naslov;
	private String ISBN;
	private String autor;

	public String getNaslov() {
		return naslov;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getAutor() {
		return autor;
	}

	public void setNaslov(String naslov) {
		if (naslov != null)
			this.naslov = naslov;
		else
			throw new RuntimeException("Unos ne sme biti null.");
	}

	public void setISBN(String ISBN) {
		if (ISBN != null)
			this.ISBN = ISBN;
		else
			throw new RuntimeException("Unos ne sme biti null.");
	}

	public void setAutor(String autor) {
		if (autor != null)
			this.autor = autor;
		else
			throw new RuntimeException("Unos ne sme biti null.");
	}

	public String toString() {
		return "Naslov knjige: " + naslov + " Autor knjige je: " + autor + " ISBN knjige je: " + ISBN;
	}

	public boolean equals(Object o) {
		Knjiga knji = (Knjiga) (o);

		if (!(o instanceof Knjiga))
			throw new RuntimeException("Nije objekat klase knjiga");
		else if (ISBN.equals(knji.getISBN()))
			return true;
		else
			return false;

	}
}
