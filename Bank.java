/**
 * Bank creates arrays of checking and savings accounts and contains methods addAccount, findAccount, availableFunds, 
 * and printAccounts with the helper method increaseSize(). 
 *
 * @author (Bella and Diya)
 * @version (3/3/2023)
 */
public class Bank
{
    private int numAccounts;
    private Account[] bank;

    /**
     * Constructor for objects of class Bank
     * @param int size the size of the array of accounts
     */
    public Bank(int size)
    {
        bank = new Account[size];
        numAccounts = 0;
    }

    /**
     * Helper method to increase the size of an array
     */
    private void increaseSize()
    {
        Account[] temp = new Account[bank.length * 2];
        for (int num = 0; num < bank.length; num++)
            temp[num] = bank[num];
        bank = temp;
    }

    /**
     * Method to add an account to the array of accounts in a bank
     * @param Account a the account to be added
     */
    public void addAccount(Account a)
    {
        if (numAccounts == bank.length){
            increaseSize();
        }
        bank[numAccounts] = a;
        numAccounts++;
    }

    /**
     * Method to find an account with a given account number
     * @param int num the account number
     */
    public Account findAccount(int num)
    {
        Account matchingAccount = null;
        for (int account = 0; account < numAccounts; account++){
            if (bank[account].getAccountNum() == num){
                matchingAccount = bank[account];
            }
        }
        if (matchingAccount != null){
            return matchingAccount;
        }
        else{
            System.out.println("Account not found");
            return null;
        }
    }
    
    /**
     * Method to calculate the total available funds in all accounts in the bank
     * @return double total the total available funds
     */
    public double availableFunds()
    {
        double total = 0.00;
        for (int account = 0; account < numAccounts; account++){
            total += bank[account].getBalance();
        }
        return total;
    }
    
    /**
     * Method to prind all accounts in a given bank
     */
    public void printAccounts(){
        for (int account = 0; account < numAccounts; account++){
            System.out.println(bank[account].toString());
        }
    }
    
    /**
     * Main method for testing
     */
    public static void main(String [] args){
        Bank myBank = new Bank(3); //create new bank
        Savings s1 = new Savings(5000.05); //create new account
        Checking c1 = new Checking(5643.81);
        Checking c2 = new Checking(73.00);
        
        myBank.addAccount(s1); //add account to bank created
        myBank.addAccount(c1);
        myBank.addAccount(c2);
        
        System.out.println("********* Bank Testing *********");
        System.out.println("--------- Testing printAccounts ---------");
        System.out.println("Expected:\nSavings account: 1\nBalance: $5000.05\nInterest rate: 0.5%\nChecking account: 2\nBalance: $5643.81\nChecking account: 3\nBalance: $73.0\n\nGot:");
        myBank.printAccounts();
        
        System.out.println("--------- Testing findAccount ---------");
        System.out.println("Expected:\nSavings account: 1\nBalance: $5000.05\nInterest rate: 0.5%\n\nGot:\n" + myBank.findAccount(1));
        System.out.println("\nExpected:\nChecking account: 2\nBalance: $5643.81\n\nGot:\n" + myBank.findAccount(2));
        System.out.println("\nExpected:\nChecking account: 3\nBalance: $73.0\n\nGot:\n" + myBank.findAccount(3));
        System.out.println("\nExpected:\nAccount not found\n\nGot:");
        myBank.findAccount(4);
        
        System.out.println("--------- Testing availableFunds ---------");
        System.out.println("Expected: $10716.86\n\nGot: $" + myBank.availableFunds());
    }
}
