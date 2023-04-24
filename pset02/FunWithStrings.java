/**
 * FunWithStrings takes a given string and determines whether it reads the same forwards and backwards.
 *
 * @author (Bella Steedly)
 * @version (2/7/2023)
 */
public class FunWithStrings
{
    /**
     * Takes a string and returns that string but in reverse order
     * @param String word
     * @return String the inputted word read right to left
     */
    public static String reverseString(String word)
    {
        int i;
        i=word.length();
        String reverse;
        reverse="";
        while(i>0){
            reverse=reverse+word.charAt(i-1);
            i--;
        }
        return reverse;
    }

    /**
     * Compares two strings and returns -1 if they're the same and the index of the first different letter if not the same
     * @param String word1
     * @param String word2
     * @return int -1 if the given strings are the same or the index of first different letter if not the same
     */
    public static int areTheSame(String word1,String word2)
    {
        for(int i=0; i<word1.length(); i++){
            if(word1.charAt(i)!=word2.charAt(i)){
                return i;
            }
        }
        return -1;
    }

    /**
     * Takes a string and returns whether that string is the same forward and backward
     * @param String input
     * @return boolean true if the given string is the same forward and backward, false otherwise
     */
    public static boolean sameBackAndForth(String input)
    {
        return areTheSame(input,reverseString(input))==-1;
    }

    /**
     * Test cases of FunWithStrings
     */
    public static void main()
    {
        System.out.println(sameBackAndForth("")); //expect true
        System.out.println(sameBackAndForth("I")); //expect true
        System.out.println(sameBackAndForth("bb")); //expect true
        System.out.println(sameBackAndForth("dad")); //expect true
        System.out.println(sameBackAndForth("anna")); //expect true
        System.out.println(sameBackAndForth("racecar")); //expect true
        System.out.println(sameBackAndForth("it")); //expect false
        System.out.println(sameBackAndForth("Bella")); //expect false
        System.out.println(sameBackAndForth("palindrome")); //expect false
    }
}
