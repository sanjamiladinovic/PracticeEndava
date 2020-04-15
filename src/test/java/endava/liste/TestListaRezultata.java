package endava.liste;

public class TestListaRezultata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaRezultata lr = new ListaRezultata();
		Takmicar gr = new Takmicar();
		Takmicar sad = new Takmicar();
		Takmicar rus = new Takmicar();
		Takmicar tur = new Takmicar();
		Takmicar gb = new Takmicar();
		Takmicar sad1 = new Takmicar();
		gr.setImePrezime("Costas Pappas");
		gr.setZemlja("Grcka");
		gr.setVreme(23.1);

		sad.setImePrezime("Colin Firth");
		sad.setZemlja("SAD");
		sad.setVreme(20.12);

		rus.setImePrezime("Ivan Ivanovic");
		rus.setZemlja("Rusija");
		rus.setVreme(19.05);

		tur.setImePrezime("Mehmed Turk");
		tur.setZemlja("Turska");
		tur.setVreme(0);

		gb.setImePrezime("John Pale");
		gb.setZemlja("Velika Britanija");
		gb.setVreme(22.78);

		sad1.setImePrezime("Jack Stone");
		sad1.setZemlja("SAD");
		sad1.setVreme(0);

		lr.unesiTakmicara(gr);
		lr.unesiTakmicara(sad);
		lr.unesiTakmicara(rus);
		lr.unesiTakmicara(tur);
		lr.unesiTakmicara(gb);
		lr.unesiTakmicara(sad1);

		lr.ispisi();
		lr.ispisiPrvihOsamFinalista();
		lr.ispisiReprezentativce("sad");
		System.out.println("Svetski rekord je oboren: " + lr.daLiJeOborenRekord(19.10));
	}

}
