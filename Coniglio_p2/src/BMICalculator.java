import java.util.Scanner;
public class BMICalculator {

	
	   private double setWeight;
	   private double setHeight;
	   public double getBmi;
	   private int choice;

	   public BMICalculator() {

	   }
	   public void readUserData() {
	       Scanner sc = new Scanner(System.in);
	       while (true) {
	    
	           System.out.println("1.Weight in Pounds, Height in Inches.");
	           System.out.println("2.Weight in Kilograms, Height in meters.");
	           System.out.print("Enter Choice :");
	           choice = sc.nextInt();
	           if (choice == 1) {
	               System.out.print("Enter Weight (in Pounds):");
	               setWeight = sc.nextDouble();
	               if(setWeight<1) {
		        	   break;
		           }
	            
	               System.out.print("Enter Height (in inches):");
	               setHeight = sc.nextDouble();
	               if(setHeight<1) {
		        	   break;
		        	  sc.close();
		           }

	               break;
	           } else if (choice == 2) {
	               System.out.print("Enter Weight (in Kilograms):");
	               setWeight = sc.nextDouble();
	               if(setWeight<1) {
		        	   break;
		           }
	               System.out.print("Enter Height (in meters):");
	               setHeight = sc.nextDouble();
	               if(setHeight<1) {
		        	   break;
		           }
	               break;
	           } else {
	               System.out.println("Didnt enter 1 or 2 ");
	               continue;
	           }
	       }

	   }

	   public void calculateBmi() {
	       if (choice == 1) {
	      
	           getBmi = (setWeight * 703) / (setHeight * setHeight);
	          
	       }
	        else  {
	           getBmi = setWeight / (setHeight * setHeight);

	       }
	   }

	   public void displayBmi() {
	       String category = "";
	       if (getBmi < 18.5)
	           category = "UnderWeight";
	       else if (getBmi >= 18.5 && getBmi <= 24.9)
	           category = "Normal";
	       else if (getBmi >= 25 && getBmi <= 29.9)
	           category = "OverWeight";
	       else if (getBmi >= 30)
	           category = "Obese";
	       System.out.println("Your BMI:" + getBmi);
	       System.out.println("You are " + category);

	   }
	

public static void main(String[] args) {
	   BMICalculator app = new BMICalculator();
	   app.readUserData();
	   app.calculateBmi();
	   app.displayBmi();
	   }

	}


