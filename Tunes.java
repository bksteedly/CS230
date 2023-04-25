//********************************************************************
//  Tunes.java       Java Foundations
//
//  Demonstrates the use of an array of objects.
//********************************************************************
/**
 * Client program for testing
 * 
 * @author (Bella Steedly)
 * @version (3/23/2023)
 */
public class Tunes
{
    //-----------------------------------------------------------------
    //  Creates a CDCollection object and adds some CDs to it. Prints
    //  reports on the status of the collection.
    //-----------------------------------------------------------------
    /**
     * Main method used for testing

     */
    public static void main (String[] args)
    {
        System.out.println("***** Now testing array implimentation *****");
        CDCollection music1 = new CDCollection ();

        music1.addCD ("Storm Front", "Billy Joel", 14.95, 10);
        music1.addCD ("Come On Over", "Shania Twain", 14.95, 16);
        music1.addCD ("Soundtrack", "Les Miserables", 17.95, 33);
        music1.addCD ("Graceland", "Paul Simon", 13.90, 11);

        System.out.println (music1);

        music1.addCD ("Double Live", "Garth Brooks", 19.99, 26);
        music1.addCD ("Greatest Hits", "Jimmy Buffet", 15.95, 13);

        System.out.println (music1);

        System.out.println("***** Now testing stack implimentation *****");

        CDCollection_Stack music2 = new CDCollection_Stack();

        music2.addCD ("Storm Front", "Billy Joel", 14.95, 10);
        music2.addCD ("Come On Over", "Shania Twain", 14.95, 16);
        music2.addCD ("Soundtrack", "Les Miserables", 17.95, 33);
        music2.addCD ("Graceland", "Paul Simon", 13.90, 11);

        System.out.println (music2);

        music2.addCD ("Double Live", "Garth Brooks", 19.99, 26);
        music2.addCD ("Greatest Hits", "Jimmy Buffet", 15.95, 13);

        System.out.println (music2);
        
        System.out.println("***** Now testing linked list implimentation *****");
        
        CDCollection_LinkedList music3 = new CDCollection_LinkedList();

        music3.addCD ("Storm Front", "Billy Joel", 14.95, 10);
        music3.addCD ("Come On Over", "Shania Twain", 14.95, 16);
        music3.addCD ("Soundtrack", "Les Miserables", 17.95, 33);
        music3.addCD ("Graceland", "Paul Simon", 13.90, 11);

        System.out.println (music3);

        music3.addCD ("Double Live", "Garth Brooks", 19.99, 26);
        music3.addCD ("Greatest Hits", "Jimmy Buffet", 15.95, 13);

        System.out.println (music3);
    }
}
