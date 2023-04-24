import java.lang.Math;
import java.util.*;
/**
 * Area of a triangle asks the user to enter three side lengths then tells the user if the entered sides cannot form a triangle. 
 * If they can form a triangle, the user is told whether the triangle is isosceles and given the area of their triangle. 
 *
 * @author (Bella Steedly)
 * @version (2/2/2023)
 */
public class AreaOfATriangle
{
    /**
     * Determines whether three given sides form a valid triangle
     */
    public static boolean isValidTriangle(double side1,double side2,double side3)
    {
        return (side1+side2)>side3&&(side1+side3)>side2&&(side2+side3>side1);
    }
    
    /**
     * Prints and returns the area of a triangle with the side lengths given
     */
    public static double getHeronArea(double side1, double side2, double side3)
    {
        double s;
        s=0.5*(side1+side2+side3);
        double area;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    
    /**
     * determines whether a triangle with the side lengths given is isosceles
     */
    public static boolean isIsosceles(double side1, double side2, double side3)
    {
        return side1==side2||side2==side3||side1==side3;
    }
    
    /**
     * prompts the user three times for the side lengths of a triangle prints whether triangle is isosceles and its area
     */
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the length of the first side of a triangle: ");
        Double side1;
        side1=input.nextDouble();
        System.out.println("Please enter the length of the second side of a triangle: ");
        Double side2;
        side2=input.nextDouble();
        System.out.println("Please enter the length of the third side of a triangle: ");
        Double side3;
        side3=input.nextDouble();
        if(isValidTriangle(side1,side2,side3)==false){
            System.out.println("These numbers ("+side1+", "+side2+", "+side3+") do not form a triangle");
            System.exit(1);
        }
        if(isIsosceles(side1,side2,side3)==true){
            System.out.println("Triangle is isosceles.");
        }   else {
            System.out.println("Triangle is NOT isosceles.");
        }
        System.out.println("The area of the triangle is "+getHeronArea(side1,side2,side3));
        }
        }
