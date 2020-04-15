package endava;

public class Main {

	public void main(StringVezba[] args) {

		MathEquation[] equations = new MathEquation[4];
//		equations[0] = create(100.0d, 50.0d, 'd');// instanca za svaki clan niza...moze i uz pomoc metoda ispod 'create'
//		equations[1] = create(25.0d, 92.0d, 'a');
//		equations[2] = create(225.0d, 17.0d, 's');
//		equations[3] = create(11.0d, 3.0d, 'm');

		for (MathEquation equation : equations) {
			equation.execute();
			System.out.println("result= ");
			System.out.println(equation.getResult());
		}
	}
	// return type is MathEquation, unosimo polja koja zeliko da setujemo

	public static MathEquation create(double leftValue, double rightValue, char opCode, double result) {
		MathEquation equation = new MathEquation();

		equation.setLeftValue(leftValue);
		equation.setRightValue(rightValue);
		equation.setOpCode(opCode);
		
		return equation;
	}

}