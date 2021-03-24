/**
  * A program to show Bank Loan.
  *
  * Activity 8
  * @author Haegang Yang
  * @version 10/21/2019
  */

public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   private static int loansCreated = 0;
   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
 /**
* 
* @param customerNameIn Command line argument
* @param interestRateIn Command
*/

   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   
   }
    /**
* @param amount a double
* @return Command line argument
*
*/


   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
 /**
* @param amountPaid Command
* @return Command line argument
*
*/

   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
    /**
* 
* @return Command line argument
*
*/

   public double getBalance() {
      return balance;
   }
    /**
* @param interestRateIn Command
* @return Command line argument
*
*/

   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
    /**
* 
* @return Command line argument
*
*/

   public double getInterestRate() {
      return interestRate;
   }
   /**
   *
   */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
    /**
* 
* @return Command line argument
*
*/

   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
    /**
* 
* @param amount Command line argument
* @return Command
*/

   public static boolean isAmountValid(double amount)
   {
      return amount >= 0;
   }
 /**
* @param loan Loan
* @return Command line argument
*
*/

   public static boolean isInDebt(BankLoan loan) 
   {
      if (loan.getBalance() > 0)
      {
         return true;
      }
      return false;
      
   }
   
   /**
* 
* @return Command line argument
*
*/

   public static int getLoansCreated() {
      return loansCreated;
   }
    /**
   *
   */

   public static void resetLoansCreated() {
      loansCreated = 0;
   }
}