import java.util.Scanner;

public class Application {
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		    int n;
		   System.out.println("Enter four-digit number: ");
		   n=sc.nextInt();
		   System.out.println("Encrypted number is: "+Encrypter.encrypt(n));
		   System.out.println("Number to get to your encrypted number is: "+Decrypter.decrypt(n));
		}

	
}



