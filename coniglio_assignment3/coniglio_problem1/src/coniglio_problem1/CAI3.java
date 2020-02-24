package coniglio_problem1;

import java.security.SecureRandom;
import java.util.Scanner;


	
public class CAI3 {

	

			public static void main(String[] args) {
				 Scanner sc = new Scanner(System.in);
			       String test;

			       do {
			           quiz(sc);
			           
			           System.out.print("\nDo you want another round?(yes/no): ");
			           test = sc.next();
			           System.out.println();
			       } while (test.equalsIgnoreCase("yes"));
			       sc.close();
				 
			}
				
			
			static SecureRandom secureRandom = new SecureRandom();
			 public  static void quiz(Scanner sc) {
				 int score =0;
				 for(int i =1; i<=10;i++) {
			        int number1 = secureRandom.nextInt(10); 
			        int number2 = secureRandom.nextInt(10); 
			         int correctAnswer = number1 * number2;
			         int studentAnswer=-1;
	
			       
				    	 askQuestion(number1,number2, i);
				    	 studentAnswer=readResponse(sc);
				    	 
				    	 if(isAsnwerCorrect(correctAnswer,studentAnswer)) {
				    		 displayCorrectResponse(secureRandom);
				    		 score++;
				    	 }
				    	 
				    	 else{
				    		 displayInorrectResponse(secureRandom);
               }
         }
				    	 
				    	 displayCompletionMessage(score);
				    	           	   
				       
			 }
			 
			 
			 public static void askQuestion(int number1,int number2, int i) {
			
			       System.out.println(" "+i+ ")"+ " How much is " + number1 + " times " + number2 + "?");
			 }
			 
			 
			 public static int readResponse(Scanner sc) {
			       System.out.print("    Type answer here:");
			       int answer = sc.nextInt();
			       return answer;
			    }
			 
			 public static boolean isAsnwerCorrect(int correctAnswer,int studentAnswer) {
				 return correctAnswer==studentAnswer;
				 
			 
			 }
			 
			   public static void displayCorrectResponse(SecureRandom secureRandom2) {
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

			       
			      public static void displayInorrectResponse(SecureRandom secureRandom2) {
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
			      
			      

			 	 private static void displayCompletionMessage(int score) {
			          double percent = ((double) score / 10.00) * 100.00;
			          System.out.println("\nYou Scored: " + percent + "%");
			          if (percent < 75)
			              System.out.println("Please ask your teacher for extra help.");
			          else
			              System.out.println("Congratulations, you are ready to go to next level!");
			      }
			 	

		}
