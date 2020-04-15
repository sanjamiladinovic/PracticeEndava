package endava;

public class TestVozila141 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vozilo141 voziloTrkacko1 = new TrkackoVozilo141();
		voziloTrkacko1.postaviNaziv("Audi S8 GT");
		voziloTrkacko1.ispisi();// pozvala se metoda iz klase trkacko vozilo jer se poziva predefinisana

		TrkackoVozilo141 voziloTrkacko2 = (TrkackoVozilo141) (voziloTrkacko1);// kastovanje, tj eksplicitno konvetovanje
																				// postojeceg objekta u objekat klase
																				// trkacko vozilo/podklasu
		voziloTrkacko2.postaviMaxBrzinu(250.50);
		voziloTrkacko2.ispisi();
	}

}
