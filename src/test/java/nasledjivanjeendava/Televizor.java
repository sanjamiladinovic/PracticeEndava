package nasledjivanjeendava;

public class Televizor extends KucniAparat {

	int program = 1;

	Televizor(String marka, String model, boolean ukljucen, int program) {
		super(marka, model, ukljucen);

		if (program >= 1 && program <= 40) {
			this.program = program;
		} else
			System.out.println("Greska, broj programa je izmedju jedan i cetrdeset. ");
	}

	void promeniProgramNavise() {
		if (program == 40) {
			program = 1;
		} else
			program = program + 1;
	}

	void promeniProgramNanize() {
		if (program == 1) {
			program = 40;
		} else
			program = program - 1;
	}

	@Override
	void ispisi() {
		super.ispisi();
		System.out.println("Trenutno je ukljucen: " + program);
	}
}
