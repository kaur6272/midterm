/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Sivagama
 * Arshdeep Kaur
 */
public class Account{

    
        private double balance;
        private double interestRate=0.23;
        private double newBalance1;
        private String user;
 
     /**constructor that takes the initial balance
      * @param initialBalance 
      */
        public Account(double initialBalance,String givenUser)
        {
            balance=initialBalance;
            user=givenUser;
            //Note that the initial balance must be greater than 50.       
        }

     /**The method for depositing amount and 
      * updating balance*/
        public void credit(double amount)
        {
            balance=getBalance()+amount;
        }

     /**The method for debit(withdrawing amount) and 
      * updating balance */
        public void debit(double amount)
        {
            balance=getBalance()-amount;

        }
        
     /**The getter for the balance
     * @return the balance
     */
        public double getBalance() 
        {
        return balance;
        }

    /**The getter for InterestRate
     * @return the interestRate
     */
        public double getInterestRate() 
        {
            return interestRate;
        }

    /**user is the read only field
     * @return the user
     */
    public String getUser() {
        return user;
    }
    /**
     * @param newBalance the newBalance to set
     */
    public void setNewBalance(double newBalance) {
        //this.newBalance = newBalance;
        newBalance1=balance+(balance*interestRate);
      /**
     * @return the newBalance
     */   
    }
    public double getNewBalance() {
        return newBalance1;
    }
    
}//class end
