package endava.liste;

public class TestKomisije {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Komisija clan = new Komisija();
		ClanKomisije ckPredsednik = new ClanKomisije();
		ckPredsednik.setImePrezime("Pera Peric");
		ckPredsednik.setFja("predsednik");
		ClanKomisije ck = new ClanKomisije();
		ck.setImePrezime("Mika Mikic");

		clan.unesiUListu(ckPredsednik);
		clan.unesiUListu(ck);

		clan.ispisiSastavKomisije();
	}

}
