
public class Leture7_3 {

	void printArray(int[] values) {
		
		for(Integer x : values) {
			System.out.println(x + " ");
			}
	}
	
	void initArray(int [] xs) {
	
		for( int i=0; i< xs.length;i++) {
				xs[i]=10;
		}
	}
		
		int[] initArray2(int size) {
			int[] ys = new int[size];
		for( int i=0; i<ys.length;i++) {
				ys[i]=10;
		
	}
		}
	
	public static void main(String[] args) {
		Leture7_3 lec7 = new Leture7_3();
		
		int[] xs = new int[10];
		int[] a2 = lec7.initArray2(20);
		lec7.printArray(a2);
		lec7.initArray(xs);
		
		lec7.printArray(xs);

	}

}
