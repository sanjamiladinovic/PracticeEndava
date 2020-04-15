package endava.serijalizacija;

import java.io.Serializable;

public class Knjiga implements Serializable{

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
			throw new RuntimeException("Naslov ne moze biti null!");

	}

	public void setISBN(String ISBN) {
		if (ISBN != null)
			this.ISBN = ISBN;
		else
			throw new RuntimeException("ISBN ne moze biti null!");

	}

	public void setAutor(String autor) {
		if (autor != null)
			this.autor = autor;
		else
			throw new RuntimeException("Autor ne moze biti null!");

	}

	public String toString() {

		return "Naslov je: " + naslov + " ISBN je: " + ISBN + " Autor je: " + autor;

	}

	public boolean equals(Object o) {
		Knjiga k = (Knjiga) (o);
		if (o instanceof Knjiga)
			throw new RuntimeException("Objekat nije objekat klase Knjiga.");
		if (ISBN.equals(k.getISBN()))
			return true;
		else
			return false;
	}
}
