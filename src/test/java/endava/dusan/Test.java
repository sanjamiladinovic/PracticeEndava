package endava.dusan;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println((char)65);
		System.out.println((int)'A');
		
		
		 String s = "foo";
		  byte[] bytes = s.getBytes();
		  StringBuilder binary = new StringBuilder();
		  for (byte b : bytes)
		  {
		     int val = b;
		     for (int i = 0; i < 8; i++)
		     {
		        binary.append((val & 128) == 0 ? 0 : 1);
		        val <<= 1;
		     }
		     binary.append(' ');
		  }
		  System.out.println("'" + s + "' to binary: " + binary);
	}

}
