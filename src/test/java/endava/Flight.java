package endava;

public class Flight {

	int fligtNumber;

	public Flight(int fligtNumber) {
		this.fligtNumber = fligtNumber;

	}
	
	Flight val1=new Flight(10);
	Flight val2=new Flight(20);

	void swap (Flight i, Flight j) {
		Flight k=i;
		i=j;
		j=k;
		System.out.println(i);
		System.out.println(j);
	}
	

	public static void main(StringVezba[] args) {
		// TODO Auto-generated method stub

		// swap(val1,val2);

	}
}
