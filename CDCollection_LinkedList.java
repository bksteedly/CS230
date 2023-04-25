import java.text.NumberFormat;
import java.util.LinkedList;
/**
 * CDCollection_LinkedList uses a linked list to manage a collection of CDs.
 *
 * @author (Bella Steedly)
 * @version (3/20/23)
 */
public class CDCollection_LinkedList
{
    private LinkedList<CD> collection;
    private double totalCost;

    /**
     * Constructor which initializes instance variables
     */
    public CDCollection_LinkedList()
    {
        collection = new LinkedList<CD>();
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
    }

    /**
     * toString() method
     * 
     * @return a string representation of the collection of CDs
     */
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        report += "My CD Collection\n\n";

        report += "Number of CDs: " + collection.size() + "\n";
        report += "Total cost: " + fmt.format(totalCost) + "\n";
        report += "Average cost: " + fmt.format(totalCost/collection.size());

        report += "\n\nCD List:\n\n";

        for (int i = collection.size(); i > 0; i--){
            report += collection.get(i-1) + "\n";
        }
        return report;
    }
}