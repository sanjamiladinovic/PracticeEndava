package abstraktnaklasaendava;

public class Avion extends Vozilo {

	@Override
	boolean daLiIdePoKopnu() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean daLiIdePoVodi() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean daLiIdePoVazduhu() {
		// TODO Auto-generated method stub
		return true;
	}

	void ispisi() {

		System.out.println("U pitanju je avion, marke: " + getMarku() + ", model aviona je: " + getModel());
	}

}
