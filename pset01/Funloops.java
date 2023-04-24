import java.util.Scanner;

/**
 * Fun loops creates three different loops (parrot(), toddler(), and dreamer()).
 *
 * @author (Bella Steedly)
 * @version (2/2/2023)
 */

public class Funloops{

/**
* Part 1 of the exercise.
* This method should act like a parrot, repeating every number entered by the 
* user. The user can stop the mimicing by entering the number 0
*/
  public static void parrot(){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number that is greater than zero: ");
    String num;
    num=input.nextLine();
    while(Integer.valueOf(num)!=0){
        if(Integer.valueOf(num)>0){
        System.out.println(num);
    }
        System.out.println("Enter a number that is greater than zero: ");
        num=input.nextLine();
  }
}

  /**
  * Part 2 of the exercise.
  * This method should act like a toddler who knows their numbers, once they 
  * are given a number, they start reciting all numbers from 1 to that number.
  * @param theNum the input number
  */
  public static void toddler(int theNum){
      int count;
      count=1;
      while(count<=theNum){
          System.out.println(count);
          count+=1;
      }

  }

  /**
  * Part 3 of the exercise.
  * This method should act like a dreamer, who draws a triangle of stars once 
  * they are given a number.
  * @param theNum the input number
  */
  public static void dreamer(int theNum){
      for(int i=1; i<=theNum; i++){
          String star = "*";
          System.out.println(star.repeat(i));
        }
      }

  public static void main(String[] args){
    System.out.println("Now calling parrot()");
    parrot();
    
    System.out.println("\nNow calling toddler(6)");
    toddler(6);
    
    System.out.println("\nNow calling toddler(20)");
    toddler(20);
    
    System.out.println("\nNow calling toddler(1)");
    toddler(1);
    
    System.out.println("\nNow calling dreamer(4)");
    dreamer(4);
    
    System.out.println("\nNow calling dreamer(3)");
    dreamer(3);
    
    System.out.println("\nNow calling dreamer(20)");
    dreamer(20);
  }
}
