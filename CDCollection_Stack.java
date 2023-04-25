import java.text.NumberFormat;
import java.util.Stack;
/**
 * CDCollection_Stack uses a stack to manage a collection of CDs
 *
 * @author (Bella Steedly)
 * @version (3/20/23)
 */
public class CDCollection_Stack
{
    private Stack<CD> collection;
    private int count;
    private int tempCount;
    private double totalCost;
    /**
     * Constructor initializes instance variables
     */
    public CDCollection_Stack ()
    {
        collection = new Stack<CD>();
        count = 0;
        tempCount = 0;
        totalCost = 0.0;
    }

    /**
     * addCD() adds a CD to the collection
     * 
     * @param title
     * @param artist
     * @param cost
     * @param tracks
     */
    public void addCD (String title, String artist, double cost,
    int tracks)
    {
        collection.push(new CD (title, artist, cost, tracks));
        totalCost += cost;
        count++;
    }

    /**
     * toString() method
     * 
     * @return a string representation of the collection
     */
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        report += "My CD Collection\n\n";

        report += "Number of CDs: " + count + "\n";
        report += "Total cost: " + fmt.format(totalCost) + "\n";
        report += "Average cost: " + fmt.format(totalCost/count);

        report += "\n\nCD List:\n\n";

        Stack<CD> temp = new Stack<CD>(); 
        while(count > 0){
            temp.push(collection.pop());
            tempCount++;
            count--;
        }
        while(tempCount > 0){
            report += temp.peek().toString() + "\n";
            collection.push(temp.pop());
            tempCount--;
            count++;
        }
        return report;
    }
}
