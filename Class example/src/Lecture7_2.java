
public class Lecture7_2 {
	public static void main(String[] args) {
		
		int[] xs = new int [10];
		double[] ys = new double[100];
		
		for(Integer x : xs) {
			
			x = 2; 
			
		}
		
		for(Integer x : xs) {
		System.out.println(x + " ");
		}
		
		for(Double y : ys) {
			System.out.print(y + " ");
		}
		
		for(int i=0; i< xs.length; i++) {
		System.out.println(xs[i] + " ");
		}
		
		int z = Integer.parseInt("1") + Integer.parseInt("2");
		System.out.print(z);
		
	}
}
