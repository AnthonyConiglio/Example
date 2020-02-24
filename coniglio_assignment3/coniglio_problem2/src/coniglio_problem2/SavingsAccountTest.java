package coniglio_problem2;
public class SavingsAccountTest {

    public static void main(String[] args) {
       
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        
        SavingsAccount.modifyInterestRate(0.04);

        System.out.println("Balance for one year at 0.04");
        System.out.println("");
        System.out.printf("%20s%10s\n","  [saver1]","  [saver2]  ");
        System.out.println("");
        System.out.printf("%-10s%10s%10s\n","Base",saver1.toString(),saver2.toString());

        for (int month = 1; month <= 12; month++) {

        	String monthLabel=String.format ("Month %d:",month);
        	
            saver1.calculateMonthlyInterest();

            saver2.calculateMonthlyInterest();

            System.out.println("");
            System.out.printf("%-10s%10s%10s\n", monthLabel,saver1.toString(),saver2.toString());
            System.out.println("");

        }

    
        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Balance for one year at 0.05");
        System.out.println("");
        System.out.printf("%-10s%10s\n","            [saver1]","[saver2]");
        System.out.println("");
        System.out.printf("%-10s%10s%10s\n","Base", saver1.toString(),saver2.toString());
    }
}