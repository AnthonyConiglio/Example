import java.util.Scanner;

public class Decrypter{

	public static int decrypt( int n)
	{
	   int first = n / 1000;
	   int second = (n % 1000) / 100;
	   int third = (n % 100) / 10;
	   int fourth = n % 10;
	   first = (first + 3) % 10;
	   second = (second + 3) % 10;
	   third = (third + 3) % 10;
	   fourth = (fourth + 3) % 10;
	   return (third * 1000 + fourth * 100 + first * 10 + second);
	}
	
}
