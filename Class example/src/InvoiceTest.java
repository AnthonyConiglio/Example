public class InvoiceTest {
	public static void main(String[] args) {
		Invoice i1 = new Invoice("B12", "Part B12", 1, 12.05);
		Invoice i2 = new Invoice("C12", "Part C12", 10, 1.05);
		
		System.out.println(i1.getPartNumber());
		System.out.println(i2.getPartNumber());
	}
}