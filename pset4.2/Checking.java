/**
 * Checking is the child of class Account. It creates checking accounts. 
 *
 * @author (Bella and Diya)
 * @version (3/3/2023)
 */
public class Checking extends Account
{
    private final double minBalance = 100.00;
    private final double overFee = 25.00; 
    /**
     * Constructor for objects of class Checking
     * @param double initialBalance the initial balance in checking account
     */
    public Checking(double initialBalance)
    {
        super(initialBalance);
    }

    /**
     * toString method
     * @return String rep string representation of a checking account
     */
    public String toString()
    {
        String rep = "Checking account: " + getAccountNum() + "\nBalance: $" + getBalance();
        return rep;
    }

    /**
     * Method to withdraw funds from a checking account
     * @param double withdrawalAmount the amount to be withdrawn
     */
    public void withdraw(double withdrawalAmount)
    {
        if (getBalance() - withdrawalAmount < 0)
            System.out.println("Account balance may not fall below zero. Withdrawal request denied");
        else if (getBalance() - withdrawalAmount < minBalance)
            setBalance(getBalance() - (withdrawalAmount + overFee)); 
        else
            setBalance(getBalance() - withdrawalAmount);
    }
    
    /**
     * Main method for testing
     */
    public static void main(String [] args){
        Checking c1 = new Checking(5643.81);
        System.out.println("\n\n********* Checking Testing *********");
        System.out.println("--------- Testing withdraw ---------");
        c1.withdraw(40.00);
        System.out.println("Expected: Checking account: 1\nBalance: $5603.81\nGot: " + c1);
        c1.withdraw(5504.81);
        System.out.println("Expected: Checking account: 1\nBalance: $74.0\nGot: " + c1);
        c1.withdraw(74.0);
        System.out.println("Expected: Checking account: 1\nBalance: $-25.0\nGot: " + c1);
    }
}
