package endava;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Datumi {

	static // static void preuzetiDatumIVreme() {
//
//		GregorianCalendar trenutniDatumIVreme = new GregorianCalendar();
//		System.out.println("Trenutni datum i vreme: " + trenutniDatumIVreme.getTime());
//
//	}
//
//	static void setDate(GregorianCalendar datum) {
//
//		datum.set(2000, 0, 01);
//	}
//
//	static void datimIVreme(GregorianCalendar darumIVreme) {
//		darumIVreme.set(1999, 11, 31, 23, 59, 59);
//	}
//
//	static void GodMesDanVreme(GregorianCalendar objekat) {
//		int day = objekat.get(GregorianCalendar.DAY_OF_YEAR);
//		int month = objekat.get(GregorianCalendar.MONTH);
//		int year = objekat.get(GregorianCalendar.YEAR);
//		int hour = objekat.get(GregorianCalendar.HOUR);
//		int min = objekat.get(GregorianCalendar.MINUTE);
//		int sec = objekat.get(GregorianCalendar.SECOND);
//		System.out.println("Datum je: " + day + month + year + hour + min + sec);
//	}
//
//	static void kojaJeOsobaStarija(GregorianCalendar datumRodjenjaPrveOsobe,
//			GregorianCalendar datumRodjenjaDrugeOsobe) {
//		if (datumRodjenjaPrveOsobe.before(datumRodjenjaDrugeOsobe))
//			System.out.println("Starija je prva osoba, rodjena: " + datumRodjenjaPrveOsobe);
//		else
//			System.out.println("Starija je druga osoba, rodjena: " + datumRodjenjaDrugeOsobe);
//	}

	// Zadatak 1, praktikum, strana 133

	String nazivDogadjaja;
	static GregorianCalendar datumDogadjaja;

	public Datumi(String nazivDogadjaja, int godina, int mesec, int dan) {
		Datumi.nazivDogadjaja = nazivDogadjaja;
		datumDogadjaja = new GregorianCalendar();
		datumDogadjaja.set(godina, mesec, dan);
	}

	public void ispisiGodisnjeDobaDogadjaja() {
		int mesec = datumDogadjaja.get(GregorianCalendar.MONTH);
		int dan = datumDogadjaja.get(GregorianCalendar.DAY_OF_MONTH);
		if (mesec == 4 || mesec == 5 || (mesec == 6 && dan < 22) || (mesec == 3 && dan >= 21)) {
			System.out.println("Prolece. ");
		}
		if (mesec == 7 || mesec == 8 || (mesec == 9 && dan < 22) || (mesec == 6 && dan >= 22)) {
			System.out.println("Leto. ");
		}
		if (mesec == 10 || mesec == 11 || (mesec == 12 && dan < 21) || (mesec == 9 && dan >= 23)) {
			System.out.println("Jesen. ");
		}
		if (mesec == 1 || mesec == 2 || (mesec == 3 && dan < 21) || (mesec == 12 && dan >= 22)) {
			System.out.println("Zima. ");
		}
	}

	static void ispisiPrethodniDogadjaj(Datumi dogadjaj) {
		if (datumDogadjaja.before(Datumi.datumDogadjaja))
			System.out.println("Desio se pre unetog dogadjaja. ");
		else
			System.out.println("Desio se posle unetog dogadjaja. ");

	}

	static void dogadjajIDatumKadaSeDesio() {
		int godina = datumDogadjaja.get(GregorianCalendar.YEAR);
		int mesec = datumDogadjaja.get(GregorianCalendar.MONTH);
		int dan = datumDogadjaja.get(GregorianCalendar.DAY_OF_MONTH);
		System.out.println("Dana: " + dan + mesec + godina + " se desio dogadjaj: " + nazivDogadjaja);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Datumi vreme = new Datumi();
//		vreme.preuzetiDatumIVreme();
//		int date = GregorianCalendar.DATE;
//		int year = GregorianCalendar.YEAR;
//		int dayOfMonth = GregorianCalendar.DAY_OF_MONTH;
//		System.out.println(date);
//		System.out.println(year);
//		System.out.println(dayOfMonth);
//		vreme.GodMesDanVreme(null);
		
		Datumi dogadjajIISvRat= new Datumi("Bombardovanje Beograda u II Sv.Ratu:", 6, 4, 1941);
		Datumi dogadjaj99a= new Datumi("Bombardovanje 99e: ", 3, 24, 1999);
		dogadjajIISvRat.ispisiGodisnjeDobaDogadjaja();
		dogadjaj99a.ispisiGodisnjeDobaDogadjaja();
		dogadjajIISvRat.ispisiPrethodniDogadjaj(dogadjaj99a);

	}

}
