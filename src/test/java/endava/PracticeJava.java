package endava;

public class PracticeJava {

	int jacinaTona = 0;
	int trenutniProgram = 1;
	boolean ukljucen = false;

	void promeniProgramNavise() {
		trenutniProgram = trenutniProgram + 1;

	}

	void promeniProgramNanize() {
		trenutniProgram = trenutniProgram - 1;

	}

	int vratiProgram() {
		return trenutniProgram;
	}

	int vratiJacinuTona() {
		return jacinaTona;
	}

	boolean vratiDaLiJeUkljucen() {
		return ukljucen;
	}

	void ispisiParametre() {
		System.out.println("Trenutni program: " + trenutniProgram);
		System.out.println("Trenutna jacina tona " + jacinaTona);
		System.out.println("Da li je televizor ukljucen: " + ukljucen);
	}
}
