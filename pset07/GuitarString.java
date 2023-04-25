import java.util.Random;
/**
 * GuitarString is a class that models a vibrating guitar string.
 *
 * @author (Bella Steedly, bs102)
 * @version (4/2/2023)
 */
public class GuitarString
{
    private double frequency;
    private final int SAMPLING_RATE = 44100;
    private int N;
    private BoundedQueue<Double> strings;
    /**
     * Constructor for objects of class GuitarString
     * 
     * @param double frequency
     */
    public GuitarString(double frequency)
    {
        this.frequency = frequency;
        N = (int)Math.ceil(SAMPLING_RATE / frequency);
        strings = new BoundedQueue<Double>(N);
        for (int i = 0; i < N; i++)
            strings.enqueue(0.0);
    }

    
    /**
     * Method pluck() replaces the N samples in the bounded queue with N random values between -0.5 and +0.5
     */
    public void pluck()
    {
        Random rand = new Random();
        for (int i = 0; i < N; i++)
        {strings.dequeue();
            strings.enqueue(rand.nextDouble() - 0.5);
        }
    }

    /**
     * Method sample() returns the value of the item at the front of the bounded queue
     * 
     * @return double the value of the item at the front of the bounded queue
     */
    public double sample()
    {
        return strings.first();
    }

    /**
     * Method tic() applies the Karplus-Strong algorithm
     */
    public void tic()
    {
        double first = strings.dequeue();
        strings.enqueue((strings.first() + first) / 2 * 0.994);
    }

    /**
     * Main method used for testing
     */
    public static void main(String[] args)
    {
        GuitarString g1 = new GuitarString(4410);
        System.out.println(g1.strings);
        g1.pluck();
        System.out.println(g1.strings);
    }
}
