package endava.exception;

public class ProveraParnosti {

	public static boolean proveraParnosti(int a) throws Exception {
		 
		if (a == 0)
			throw new Exception("Uneli ste nulu.");
		if (a % 2 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			proveraParnosti(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
