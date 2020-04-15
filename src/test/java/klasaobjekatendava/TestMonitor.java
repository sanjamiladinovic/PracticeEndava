package klasaobjekatendava;

public class TestMonitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monitor m1=new Monitor();
		Monitor m2=new Monitor();
		m1.setMarka("Samsung");
		m1.setModel("SyncMaster");
		m1.setDuzinaEkrana(15);
		m2.setMarka("Sony");
		m2.setModel("WS");
		m2.setDuzinaEkrana(17);
		System.out.println(m1.equals(m2));
		System.out.println(m1);
		System.out.println(m2);
		

	}

}
