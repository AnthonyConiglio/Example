package coniglio_problem1;
import java.security.SecureRandom;
import java.util.Scanner;
public class CAI1 {

	public static void main(String[] args) {
		 quiz(); 
		 }
	
	
	 public  static void quiz() {
		 SecureRandom secureRandom = new SecureRandom();
	        int number1 = secureRandom.nextInt(10); 
	        int number2 = secureRandom.nextInt(10); 
	         int correctAnswer = number1 * number2;
	         int studentAnswer=-1;
	         
	         while (true) {
	       
		    	 askQuestion(number1,number2);
		    	 studentAnswer=readResponse();
		    	 
		    	 if(isAsnwerCorrect(correctAnswer,studentAnswer)) {
		    		 displayCorrectResponse();
		    		 break;
		    	 }
		    	 
		    	 else {
		    		 displayInorrectResponse();
		    	 }
		    	 
			      
	         }    	   
		       
	 }
	 
	 
	 public static void askQuestion(int number1,int number2) {
	
	       System.out.println("How much is " + number1 + " times " + number2 + "?");
	 }
	 
	 
	 public static int readResponse() {
	 @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	       System.out.print("Type answer here:");
	       int answer = sc.nextInt();
	       return answer;
	    }
	 
	 public static boolean isAsnwerCorrect(int correctAnswer,int studentAnswer) {
		 return correctAnswer==studentAnswer;
		 
	 
	 }
	 
	   public static void displayCorrectResponse() {
		   System.out.println("Very good!"); 
	}

	       
	      public static void displayInorrectResponse() {
	    	  System.out.println("No. Please try again.");  
	}

}