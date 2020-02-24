package coniglio_problem1;
import java.security.SecureRandom;
import java.util.Scanner;


public class CAI2 {



		public static void main(String[] args) {
			 quiz(); 
			 }
		
		static SecureRandom secureRandom = new SecureRandom();
		 public  static void quiz() {
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
			   int i;
			   i=secureRandom.nextInt(4);
			   switch(i) {
			   
			   case 0:
				   
				   	System.out.println("Very good!");
				   	break;
			
			   case 1:
				   
					System.out.println("Excellent!");
					break;
					
			   case 2:
				   
					System.out.println("Nice work!");
					break;
					
			   case 3:
				  
					System.out.println("Keep up the good work!");
					break;
			   
			   
			   }
			   
		}

		       
		      public static void displayInorrectResponse() {
		    	  int i;
				   i=secureRandom.nextInt(4);
				   switch(i) {
				   
				   case 0:
					   
					   	System.out.println("No. Please try again.");
					   	break;
				
				   case 1:
					   
						System.out.println("Wrong. Try once more.");
						break;
						
				   case 2:
					   
						System.out.println("Don't give up!");
						break;
						
				   case 3:
					  
						System.out.println("No. Keep trying.");
						break;
				   
				   
				   }
		    	   
		      }

	}