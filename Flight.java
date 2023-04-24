import java.util.Scanner;
/**
 * This class is used to represent an airline flight.
 *
 * @author (Bella Steedly)
 * @version (2/16/2023)
 */
public class Flight
{
    private String airline;
    private int flNum;
    private String from;
    private String to;
    private boolean stopOver;

    /**
     * Constructor for objects of class Flight
     * 
     * @param String airline
     * @param int flNum
     * @param String from
     * @param String to
     */
    public Flight(String airline, int flNum, String from, String to)
    {
        this.airline = airline;
        this.flNum = flNum;
        this.from = from;
        this.to = to;
    }

     /**
     * sets instance variable airline
     * 
     * @param String airline
     */
    public void setAirline(String airline) {
        this.airline = airline;
    }
    
     /**
     * sets instance variable flNum
     * 
     * @param int flNum
     */
    public void setFlNum(int flNum) {
        this.flNum = flNum;
    }
    
     /**
     * sets instance variable from
     * 
     * @param String from
     */
    public void setFrom(String from) {
        this.from = from;
    }
    
     /**
     * sets instance variable to
     * 
     * @param String to
     */
    public void setTo(String to) {
        this.to = to;
    }
    
    /**
     * Returns the airline of the flight
     *
     * @return The airline of the flight
     */
    public String getAirline() {
        return airline;
    }
    
    /**
     * Returns the flight number of the flight
     *
     * @return The flight number of the flight
     */
    public int getFlNum() {
        return flNum;
    }
    
    /**
     * Returns the origin
     *
     * @return The origin
     */
    public String getFrom() {
        return from;
    }
    
    /**
     * Returns the destination
     *
     * @return The destination
     */
    public String getTo() {
        return to;
    }
    
    /**
     * Returns a string representation of the flight
     * 
     * @return A string representation of the flight
     */
    public String toString() {
        String s = "";
        s += "Flight " + flNum + " from " + from + " to " + to;
        return s;
    }
    
    /**
     * Asks the reader for their flight details and returns the flight
     * 
     * @return The flight
     */
    public static Flight readFlight​()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What airline is your flight?");
        String airline = s.nextLine();

        System.out.println("What is your flight number?");
        int flNum = s.nextInt();

        System.out.println("Where are your flying from?");
        String from = s.next();

        System.out.println("Where is your destination?");
        String to = s.next();

        // Create the animal and return it
        return new Flight(airline, flNum, from, to);
        
    }
    
    /**
     * Returns whether two flights have a stopover
     * 
     * @return boolean Whether there is a stopover
     */
    public static boolean stopOver​(Flight f1, Flight f2)
    {
        boolean stopOver = (f1.to).equals(f2.from);
        return stopOver;
    }
    
    /**
     * Main method
     */
    public static void main​(java.lang.String[] args)
    {
        Flight f1 = new Flight("Delta",415, "SEA", "DEN");
        Flight f2 = new Flight("Alaska",516, "DEN", "BOS");
        
        System.out.println(f1);
        System.out.println(f2);
        
        System.out.println("\nTest getters:");
        System.out.println("getAirline(). Expect Delta. Got: " + f1.getAirline());
        System.out.println("getFlNum(). Expect 516. Got: " + f2.getFlNum());
        System.out.println("getFrom(). Expect SEA. Got: " + f1.getFrom());
        System.out.println("getTo(). Expect DEN. Got: " + f1.getTo());
        
        System.out.println("\nTest setters:");
        f1.setAirline("SouthWest");
        System.out.println("setAirline(). Expect SouthWest " + f1.getAirline());
        f2.setFlNum(384);
        System.out.println("setFlNum(). Expect 384. Got: " + f2.getFlNum());
        f1.setFrom("SLC");
        System.out.println("setFrom(). Expect SLC. Got: " + f1.getFrom());
        f2.setTo("JFK");
        System.out.println("setTo(). Expect JFK. Got: " + f2.getTo());
        
        System.out.println("\nTest stopOver():");
        System.out.println("stopOver(). Expect true. Got: " + stopOver(f1, f2));
    }
}
