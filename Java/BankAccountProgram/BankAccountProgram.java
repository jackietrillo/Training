//package Accounting;

public class BankAccountProgram { 
   public static void main(String[] args) { 
       BankAccount bankAccount = new BankAccount();	   
       double currentBalanace = bankAccount.getBalance();
       System.out.println("Hello, your current balance is " + currentBalanace);	   
   }
}