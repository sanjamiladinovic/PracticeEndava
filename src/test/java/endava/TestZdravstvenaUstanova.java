package endava;

public class TestZdravstvenaUstanova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ZdravstvenaUstanova zd4=new ZdravstvenaUstanova();
		ZdravstvenaUstanova zd1=new ZdravstvenaUstanova();
		zd1.naziv="KSC";
		zd1.adresa="Pasterova 2";
		zd1.ispisi();
		ZdravstvenaUstanova zd2=new ZdravstvenaUstanova("Dom zdravlja Vozdovac");
		zd2.ispisi();
		
		ZdravstvenaUstanova zd3=new ZdravstvenaUstanova("Reumatoloski institut Beograd","Resavska 67");
		zd3.ispisi();

	}

}
