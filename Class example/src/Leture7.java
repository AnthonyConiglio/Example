
public class Leture7 {

	public static void main(String[] args) {
	
		int[] xs = new int [10];
		
		int i=0;
		do {
			
			xs[i]= 0;
			i++;
		} while (i < 10);
		
		
		i=0;
		while(true) {
			
		xs[i] = 2 ;
		i++;
		
		if(i>=10) {
			break;
		}
		}
		
		for(i=0; i< 10; i++) {
			System.out.println(xs[i] + " ");
			
		}
		
	}

}
 