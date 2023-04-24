/**
 * Savings is the child class of Account. It creates savings accounts. 
 *
 * @author (Bella and Diya)
 * @version (3/3/2023)
 */
public class Savings extends Account
{
    private final double annualInterest = 0.005;
    /**
     * Constructor for objects of class Savings
     */
    public Savings(double initialBalance)
    {
        super(initialBalance);
    }
    
    /**
     * toString method
     * @return String rep string representation of a savings account
     */
    public String toString()
    {
        String rep = "Savings account: " + getAccountNum() + "\nBalance: $" + getBalance() + "\nInterest rate: " + (annualInterest * 100) + "%";
        return rep;
    }
    
    /**
     * Method to add interest to a savings account
     */
    public void addInterest()
    {
        deposit(getBalance() * annualInterest / 12);
    }
    
    /**
     * Method to withdraw money from a savings account
     * @param double withdrawalAmount the amount of money to be withdrawn from the account
     */
    public void withdraw(double withdrawalAmount){
        if (getBalance() - withdrawalAmount >= 0)
            setBalance(getBalance() - withdrawalAmount); 
        else
            System.out.println("Account balance cannot fall below zero. Withdrawal request denied.");
    }
    
    /**
     * Main method for testing
     */
    public static void main(String [] args){
        Savings s1 = new Savings(5000.05); //create new savings account
        
        System.out.println("\n\n********* Savings Testing *********");
        System.out.println("--------- Testing addInterest ---------");
        s1.addInterest();
        System.out.println("Expected:\nSavings account: 1\nBalance: $5002.133354166667\nInterest rate: 0.5%\n\nGot:\n" + s1);
        
        System.out.println("--------- Testing withdraw ---------");
        s1.withdraw(5002.133354166667);
        System.out.println("Expected:\nSavings account: 1\nBalance: $0.0\nInterest rate: 0.5%\n\nGot:\n" + s1);
        
        System.out.println("\nExpected:\nAccount balance cannot fall below zero. Withdrawal request denied.\n\nGot:");
        s1.withdraw(1.0);
    }
}
