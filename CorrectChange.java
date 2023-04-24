import java.util.*;
import java.lang.Math;
/**
 * CorrectChange makes correct change for a given amount of money.
 *
 * @author (Bella Steedly)
 * @version (2/2/2023)
 */
public class CorrectChange
{
    /**
     * Computes the number occurrences of the certain denomination ("denomination") 
     * should be used to make change for the specified amount of cents ("total")
     */
    public static int makeChangeWithOneDenomination(int total, String denominationName, int denomination) 
    {
        int num;
        num=total/denomination;
        if (num>0){
        System.out.println(String.valueOf(total/denomination)+" "+denominationName);
    }
        return total%denomination;
    }

    /**
     * Constructor for objects of class CorrectChange
     */
    public static void CorrectChange()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("How much money do you want to make change for?");
        Double dollars;
        dollars = input.nextDouble();
        if(dollars==0.0){
            System.exit(1);
        }
        System.out.println("We can make change for $"+dollars+" using:");
        double cents;
        cents=dollars*100;
        int numCents;
        numCents=(int)Math.round(cents);
        makeChangeWithOneDenomination
        (makeChangeWithOneDenomination
        (makeChangeWithOneDenomination
        (makeChangeWithOneDenomination
        (makeChangeWithOneDenomination
        (makeChangeWithOneDenomination
        (makeChangeWithOneDenomination
        (makeChangeWithOneDenomination
        (numCents, "$20 bills", 2000), "$10 bills", 1000), 
        "$5 bills", 500), "$1 bills", 100), "quarters", 25), 
        "dimes", 10), "nickels", 5), "pennies", 1);
    }
}