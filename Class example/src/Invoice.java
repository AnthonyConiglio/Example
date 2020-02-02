/*
 *  (Invoice Class) Create a class called Invoice that a hardware store might 
 *  use to represent an invoice for an item sold at the store. 
 *  
 *  An Invoice should include four pieces of information as instance variables—
 *  a part number (type String), 
 *  a part description (type String), 
 *  a quantity of the item being purchased (type int) and 
 *  a price per item (double). 
 *  
 *  Your class should have a constructor that initializes the four instance variables. 
 *  
 *  Provide a set and a get method for each instance variable. 
 *  
 *  In addition, provide a method named 
 *  getInvoiceAmount that calculates the invoice amount (i.e., multiplies the 
 *  quantity by the price per item), then returns the amount as a double value. 
 *  	If the quantity is not positive, it should be set to 0. 
 *  	If the price per item is not positive, it should be set to 0.0. 
 *  
 *  Write a test app named InvoiceTest 
 *  that demonstrates class Invoice’s capabilities.
 */
public class Invoice {
    private String partNumber;
	private String partDesc;
	private int quantity;
	private double price;

	public Invoice(String pn, String pd, int q, double p) {
		partNumber = pn;
		partDesc = pd;
		quantity = q;
		price = p;
		
		if(quantity < 0) {
			quantity = 0;
		}
		if(price < 0.0) {
			price = 0.0;
		}
	}

	public String getPartNumber() {
		return this.partNumber;
	}
	
	public String getPartDesc() {
		return partDesc;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
		if(this.quantity < 0) {
			this.quantity = 0;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		if(this.price < 0.0) {
			this.price = 0.0;
		}
	}
	
	public double getInvoiceAmount() {
		if(quantity < 0) {
			quantity = 0;
		}
		if(price < 0.0) {
			price = 0.0;
		}
		
		return quantity * price;
	}
}




	

