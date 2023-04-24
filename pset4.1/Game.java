/**
 * Write a description of class Game here.
 *
 * @author (Bella Steedly)
 * @version (2/23/2023)
 */
public class Game
{
    /**
     * main method to dest the class Deck
     */ 
    public static void main(String[] args) {
        System.out.println("**********  Testing Deck class  **********");
        
        //Constructor testing
        System.out.println("\nTesting Constructor:");
        Deck d1 = new Deck();
        System.out.println(d1);

        //cut() testing
        System.out.println("\nTesting cut():");
        d1.cut();
        System.out.println(d1);
        d1.cut();
        System.out.println(d1);
        d1.cut();
        System.out.println(d1);
        
        //shuffle() testing
        System.out.println("\nTesting shuffle():");
        d1.shuffle();
        System.out.println(d1);
        d1.shuffle();
        System.out.println(d1);
        d1.shuffle();
        System.out.println(d1);
    }
}
