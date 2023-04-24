/**
 * Account is the parent class of checking and savings which contains methods deposit, withdraw, getters and setters for balance and accountNum, 
 * and a toString.  
 *
 * @author (Bella and Diya)
 * @version (3/3/2023)
 */
abstract public class Account
{
    private double balance;
    private static int num = 1;
    private int accountNum; 

    /**
     * Constructor for objects of class Account
     * @param double initialBalance the initial balance of the account
     */
    public Account(double initialBalance)
    {
        this.balance = initialBalance;
        this.accountNum = num;
        num ++;
    }

    /**
     * toString method
     * @return String rep a string representation of an account
     */
    public String toString()
    {
        String rep = "Account: " + getAccountNum() + "\nBalance: $" + getBalance();
        return rep;
    }

    /**
     * Getter for balance
     * @return double balance
     */
    public double getBalance(){
        return balance;    
    }

    /**
     * Getter for accountNum
     * @return int accountNum
     */
    public int getAccountNum(){
        return accountNum;
    }

    /**
     * Setter for balance
     * @param double balance
     */
    public void setBalance(double balance){
        this.balance = balance;
    }

    /**
     * Setter for accountNum
     * @param int accountNum
     */
    public void setAccountNum(int accountNum){
        this.accountNum = accountNum;
    }

    /**
     * Method to deposit money into an account
     * @param double depositAmount the amount of money to be added to the balance of an account
     */
    public void deposit(double depositAmount){
        setBalance(getBalance() + depositAmount);
    }

    /**
     * Abstract method to withdraw money from an account (defined in both child classes)
     * @param double withdrawalAmount the amount of money to be withdrawn from the account
     */
    public abstract void withdraw(double withdrawalAmount);
    
    /**
     * Main method for testing
     */
    public static void main(String [] args){
        Checking c1 = new Checking(5643.81); //create checking account
        
        System.out.println("\n\n********* Account Testing *********");
        System.out.println("--------- Testing deposit ---------");
        c1.deposit(356.19);
        System.out.println("Expected:\nChecking account: 1\nBalance: $6000.0\nGot:\n" + c1);
    }
}
