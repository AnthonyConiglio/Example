import java.util.Scanner;

public class LargeNumber {
	
	public static int getCarsSoldFromUsers() {
		Scanner in = new Scanner(System.in);
		int carsSold;
		int mostCarsSold;
		System.out.print("Please enter a number:  ");
		carsSold = in.nextInt();
		mostCarsSold = carsSold;
		for(int i = 0; i < 10; i++) {
			System.out.print("Please enter a number:  ");
			carsSold = in.nextInt();
			if(carsSold > mostCarsSold ) {
				mostCarsSold = carsSold;
			}
				
		}
		in.close();
		return mostCarsSold;
		
	}
	
	
	
	public static void main(String[] args) {
		int mostCarsSold = getCarsSoldFromUsers();
		
			
		
	System.out.println("The most cars sold was: " +mostCarsSold);
	
	}
	
	
	
	
	}


