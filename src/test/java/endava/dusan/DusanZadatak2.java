package endava.dusan;

public class DusanZadatak2 {

	
	
	//isti je zadatak, ali zelim da ga zoves preko komandne linije, i kao argumente pri tom pozivu da se stave ova 2 parametra, string i broj
	
	static String getTextPonovljenNPuta(String text, int n) {
		String returnedText="";
		for (int i = 0; i < n; i++) {

			returnedText+=text;
		}
		return returnedText;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		String text = "Sanja";
//		int brojac = 8;

		if(args.length>=2)
	    {
			System.out.println(getTextPonovljenNPuta(args[0], Integer.parseInt(args[1])));
	    }
		

	}

}
