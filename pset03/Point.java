import java.util.Scanner;
/**
 * Class point determines the distance between points and whether they are equidistant.
 *
 * @author (Bella Steedly)
 * @version (2/16/2023)
 */
public class Point
{
    private double xCoord;
    private double yCoord;

    /**
     * Constructor for objects of class Point without parameters
     */
    public Point(){
        this.xCoord = 0;
        this.yCoord = 0;
    }

    /**
     * Constructor for objects of class Point with parameters
     * 
     * @param double xCoord
     * @param double yCoord
     */
    public Point(double xCoord, double yCoord){
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    /**
     * toString method which returns a string layout of the point
     * 
     * @return String layout of a point
     */
    public String toString(){
        return "(" + xCoord + "," + yCoord + ")";
    }

    /**
     * Getter for the x coordinate
     * 
     * @return xCoord
     */
    public double getX(){
        return xCoord;
    }

    /**
     * Setter for the x coordinate
     * 
     * @param double xCoord
     */
    public void setX(double xCoord){
        this.xCoord = xCoord;
    }

    /**
     * Getter for the y coordinate
     * 
     * @return yCoord
     */
    public double getY(){
        return yCoord;
    }

    /**
     * Setter for the y coordinate
     * 
     * @param double yCoord
     */
    public void setY(double yCoord){
        this.yCoord = yCoord;
    }

    /**
     * A method which finds the distance between a given point and the current one
     * 
     * @param Point other
     * @return double distance between a given point and the current one
     */
    public double findDistance(Point other){
        double distance = Math.sqrt((this.xCoord-other.xCoord)*(this.xCoord-other.xCoord) + 
                (this.yCoord-other.yCoord)*(this.yCoord-other.yCoord));
        return distance;
    }

    /**
     * A method which returns a boolean for whether two points are equidistant to the current one
     * 
     * @param Point p2
     * @param Point p3
     * @return boolean whether the difference in distance is less than 0.01
     */
    public boolean areEquidistant​(Point p2, Point p3){
        final double TOLERANCE = 0.01;
        double difference = Math.abs(findDistance(p2)-findDistance(p3));
        return difference < TOLERANCE;
    }

    /**
     * Main method used to test the class
     */
    public static void main(String[] args){
        Point p1 = new Point(0.0, 0.0);
        Point p2 = new Point(5.0, 0.0);
        Point p3 = new Point(-5.0,0.0);

        System.out.println("\nTest getters:");
        System.out.println("getX(). Expect 5.0. Got: " + p2.getX());
        System.out.println("getY(). Expect 0.0 Got: " + p2.getY());

        System.out.println("\nTest setters:");
        p2.setX(8.0);
        System.out.println("setX(). Expect 8.0. Got: " + p2.getX());
        p3.setY(4.0);
        System.out.println("setY(). Expect 4.0. Got: " + p3.getY());

        System.out.println("\nTest methods:");
        System.out.println("findDistance(). Expect 13.601470508735. Got: " + p3.findDistance(p2));
        p3.setX(-8.0);
        p3.setY(0.0);
        System.out.println("areEquidistant(). Expect true. Got: " + p1.areEquidistant(p2, p3));
    }
}
