package endava.dusan;

public class DusanZadatak3 {

	// isti je zadatak (DusanZadatak2)
	// samo zelimo da izbacimo svako pojavljivanje karaktera koji se takodje unosi
	// kao
	// parametar, ako radis iz komandne linije, ili napravis konstantu ako radis
	// obicno
	// i da se ispise tako da su sva slova velika
	// i da se izbace sve praznine

	static String getTextPonovljenNPuta(String text, int n, String character) {
		
		
		StringBuilder returnedText = new StringBuilder(); 
		
		//String returnedText = "";

		for (int i = 0; i < n; i++) {
			returnedText.append(text);
			//returnedText += text;
		}
//		returnedText = returnedText.replaceAll(" ", "");
//		returnedText = returnedText.toUpperCase();
		// String character1 = character.toUpperCase();
//		returnedText = returnedText.replaceAll(character.toUpperCase(), "");

		return returnedText.toString().replaceAll("\\s", "").replaceAll(character.toUpperCase(), "").toUpperCase();
//			return result.toString().replaceAll(c, "").toUpperCase().replaceAll("\\s", "");

	}

	public static void main(String[] args) {

		String text = "Sanja Sanja Sanja";
		int brojac = 3;
		String character = "s";

		System.out.println(getTextPonovljenNPuta(text, brojac, character));

//		if (args.length >= 2) {
//			System.out.println(getTextPonovljenNPuta(args[0], Integer.parseInt(args[1]), args[2]));
//		}

	}

}
