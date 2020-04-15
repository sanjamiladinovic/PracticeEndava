package endava;

public class MathEquation {
	private double leftValue;
	private double rightValue;
	private char opCode;
	private double result;

	
	public double getLeftValue(){return leftValue;}//GETTER - vraca vrednost
	public void setLeftValue(double leftValue) {this.leftValue=leftValue;}
	public double getRightValue() {return rightValue;}
	public void setRightValue(double rightValue) {this.rightValue=rightValue;}
	public double getOpCode(){return opCode;}//GETTER - vraca vrednost
	public void setOpCode(char opCode) {this.opCode=opCode;}
	
	public double getResult() {return result;}
	
	
	public void execute() {
switch (opCode) {

case 'a':
result=leftValue+rightValue;
break;

case 's':
result=leftValue-rightValue;
break;

case 'd':
result=rightValue != 0.0d ? leftValue/rightValue:0.0d;
break;

case 'm':
result=leftValue*rightValue;
break;

default:
	System.out.println("Error - invalid opCode");
	result=0.0d;
	break;



}
	}

}
