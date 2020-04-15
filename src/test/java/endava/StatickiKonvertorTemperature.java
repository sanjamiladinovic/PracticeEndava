package endava;

public class StatickiKonvertorTemperature {
	
	static double konvertujCUF(double tC) {
	
		double tF=(tC*9)/5+32;
		return tF;
}
	
	static double konvertujFUC(double tF) {
		
		double tC=(tF-32)*(5/9);
		return tC;
}

}
