package endava.liste;

public class Student {

	private String brojIndexa;
	private String ime;
	private String prezime;
	private int ocena;

	public String getBrojIndexa() {
		return brojIndexa;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getOcena() {
		return ocena;
	}

	public void setBrojIndexa(String brojIndexa) {
		if (brojIndexa != null)
			this.brojIndexa = brojIndexa;
		else
			System.out.println(" Greska!");
	}

	public void setIme(String ime) {
		if (ime != null)
			this.ime = ime;
		else
			System.out.println(" Greska!");
	}

	public void setPrezime(String prezime) {
		if (prezime != null)
			this.prezime = prezime;
		else
			System.out.println(" Greska!");
	}

	public void setOcena(int ocena) {
		if (ocena > 5 && ocena <= 10)
			this.ocena = ocena;
		else
			System.out.println(" Greska!");
	}

	public String toString() {
		return "Index broj: " + brojIndexa + ", ime i prezime studenta: " + ime + prezime + ", ocena: " + ocena;
	}

	public boolean equals(Object o) {
		Student stud = (Student) (o);
		if (brojIndexa.equals(stud.getBrojIndexa()))
			return true;
		else
			return false;
	}

}
