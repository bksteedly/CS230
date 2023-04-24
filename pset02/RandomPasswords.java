import java.util.Random;
/**
 * Random passwords allows the user to generate a random series of letters of a given length that alternates between vowels and consenants.
 *
 * @author (Bella Steedly)
 * @version (2/9/2023)
 */
public class RandomPasswords
{
    /**
     * returns true if character is a vowel, false otherwise
     * @param char ch
     * @return boolean returns true if character is a vowel, false otherwise
     */
    public static boolean isVowel(char ch)
    {
        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }

    /**
     * returns true if the given integer is even, false otherwise
     * @param int n
     * @return boolean returns true if the integer is even, false otherwise
     */
    public static boolean isEven(int n)
    {
        return (n % 2 == 0);
    }

    /**
     * returns a password of length n that alternates between vowels and consenants
     * @param  int n
     * @return string returns a password of length n that alternates between vowels and consenants
     */
    public static String generateRandomPassword(int n)
    {
    String password;
    password = "";
    String alphabet;
    alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char letter;
    Random rand = new Random();
        for(int i=0; i<n; i++){
            if(isEven(i)){
            do{
                letter = alphabet.charAt(rand.nextInt(26));
            } while(isVowel(letter)==false);
            password = password + letter;
        }
        else{
            do{
                letter = alphabet.charAt(rand.nextInt(26));
            } while(isVowel(letter)==true);
            password = password + letter;
            }
    }
    return password;
    }   
    
    /**
     * Test cases of generateRandomPassword
     */
    public static void main(String[] args) {
        System.out.println(generateRandomPassword(0)); //expect an empty string
        System.out.println(generateRandomPassword(1)); //expect one vowel
        System.out.println(generateRandomPassword(10)); //expect ten characters alternating vowel and consenant starting with vowel
    }
}
