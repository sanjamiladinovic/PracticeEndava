package endava.dusan;

public class DusanZadatak1 {

	/*
	 * napisati metodu koja ima 2 parametra, jedan tekst, i jedan broj N, i kao
	 * rezultat vraca taj tekst ponovljen N puta, sve spojeno
	 */
	/*
	 * napisati glavni program koji deklarise 2 promenljive i poziva tu metodu i
	 * ispisuje rezultat
	 */

	private static String getTextPonovljenNPuta(String text, int n) {
		String returnedText="";
		for (int i = 0; i < n; i++) {

			returnedText+=text;
		}
		return returnedText;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Sanja";
		int brojac = 8;

		System.out.println(getTextPonovljenNPuta(text, brojac));

	}

}
