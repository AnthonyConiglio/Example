import java.util.Scanner;
public class Encrypter{

	public static int encrypt( int n)
	{
	   int first = n / 1000;
	   int second = (n % 1000) / 100;
	   int thrid = (n % 100) / 10;
	   int fourth = n % 10;
	   first = (first + 7) % 10;
	   second = (second + 7) % 10;
	   thrid = (thrid + 7) % 10;
	   fourth = (fourth + 7) % 10;
	   return (thrid * 1000 + fourth * 100 + first * 10 + second); // Making first # third and second # 
	}

}