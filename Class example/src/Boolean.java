
public class TEST {

	public static void main(String[] args) {


double first= 25.00d;
double second= 80.00d;
		
double total= (first+second)*100.00;

double Remainder = total % 40.00d;



boolean isNoRemainder = (Remainder==0) ? true : false;
	System.out.println("isNoremainder= " + isNoRemainder);

	if(!isNoRemainder) {
		System.out.println("Got some remainder");
	}

	




	}
}