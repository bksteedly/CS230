/**
 * BoundedQueue impliments a bounded queue ADT.
 *
 * @author (Bella Steedly, bs102)
 * @version (4/1/2023)
 */
public class BoundedQueue<T> extends CircularArrayQueue<T>
{
    private int capacity;
    /**
     * Constructor for objects of class BoundedQueue
     * 
     * @param int capacity
     */
    public BoundedQueue(int capacity)
    {
        super();
        this.capacity = capacity;
    }
    
    /**
     * Method to determine whether a bounded queue has reached its given capacity
     * 
     * @return boolean whether the queue is full
     */
    public boolean isFull()
    {
        return size() == capacity;
    }
    
    /**
     * Method to enqueue an element if not at capacity
     * 
     * @param T element
     */
    public void enqueue(T element)
    {
        if (!isFull()) 
            super.enqueue(element);
    }
    
    /**
     * Main method used for testing
     */
    public static void main(String[] args)
    {
        System.out.println("***** Now testing enqueue() *****");
        BoundedQueue q1 = new BoundedQueue(2);
        BoundedQueue q2 = new BoundedQueue(2);
        q1.enqueue(5);
        q1.enqueue(6);
        q1.enqueue(3);
        q1.enqueue(8);
        System.out.println("Expected:\n<front of queue>\n5\n6\n");
        System.out.println("Got:");
        System.out.println(q1);
        
        System.out.println("***** Now testing isFull() *****");
        System.out.println("Expected:\ntrue");
        System.out.println("Got:");
        System.out.println(q1.isFull());
        System.out.println("\nExpected:\nfalse");
        System.out.println("Got:");
        System.out.println(q2.isFull());
    }
}
