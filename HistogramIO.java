import java.util.Scanner;
import java.io.IOException;
import java.io.File;
/**
 * Histogram takes a text file where the first number is the number of integers to be placed in the histogram, and the second number is the 
 * maximum integer. The numbers following the first two are the integers for the histogram. 
 *
 * @author (Ayesha Tariq)
 * @author (Bella Steedly)
 * @version (March 7, 2023)
 */
public class HistogramIO
{
    private int MAX_INT;
    private int SIZE;
    private int[] data; 
    private int numOfBuckets;
    private int[] frequencies;
    /**
     * Constructor for objects of class Histogram (method works as expected)
     * 
     * @param String inFileName the text file to be used
     */
    public HistogramIO(String inFileName) {
        MAX_INT = 0;
        int count = 0;
        try {
            Scanner fileScan = new Scanner(new File(inFileName));
            SIZE = fileScan.nextInt();
            MAX_INT = fileScan.nextInt();
            data = new int[SIZE];  
            while(fileScan.hasNext()) {
                int line = fileScan.nextInt();
                data[count] = line;
                count++;
            }
            fileScan.close();
        } catch(IOException ex) {
            System.out.println(ex);
        }
        SIZE = count;
        int numOfBuckets = MAX_INT/10+1;
        frequencies = new int[numOfBuckets];
    }

    /**
     * The computeFrequencies method computes the number of integers in each bin (method works as expected)
     */
    public void computeFrequencies() {
        for (int i = 0; i < data.length; i++) 
        {
            frequencies[data[i] / 10] += 1;
        }
    }
    
    /**
     * The toString method creates a string representation of the integers in the dataset (method works as expected)
     * 
     * @return String result the string representation
     */
    public String toString() {
        int lowerBound = 0;
        int upperBound = 9;
        String plus = "+";
        String result = "";
        result += "Initial Data (" + SIZE + " integers):\n\n";
        for(int i = 0; i < data.length; i++){
            result += data[i] + " ";
        }
        result += "\n\n****** Results: *******\n\n";
        for(int j = 0; j < frequencies.length; j++){
            result += "range " + lowerBound + "-" + upperBound + " (" + frequencies[j] + ") |" + plus.repeat(frequencies[j]) + "\n\n";
            lowerBound += 10;
            upperBound += 10;
        }
        return result;
    }

    /**
     * The main method used for testing (method works as expected)
     */
    public static void main(String[]args) {
        //create new files
        HistogramIO file1 = new HistogramIO("integerData1.txt");
        HistogramIO file2 = new HistogramIO("test1.txt");
        HistogramIO file3 = new HistogramIO("test2.txt");
        HistogramIO file4 = new HistogramIO("test3.txt");
        HistogramIO file5 = new HistogramIO("test4.txt");
        
        System.out.println("***** Now Testing File1 *****");
        System.out.println("Calling computeFrequencies() on file1\n");
        System.out.println("Expect:\n\nInitial Data (14 integers):\n\n12 19 0 58 51 12 24 27 1 57 57 22 28 28\n\n****** Results: *******\n\nrange 0-9 (2) |++\n\nrange 10-19 (3) |+++\n\nrange 20-29 (5) |+++++\n\nrange 30-39 (0) |\n\nrange 40-49 (0) |\n\nrange 50-59 (4) |++++");
        System.out.println("\n\nGot:\n");
        file1.computeFrequencies();
        System.out.println(file1);
        
        System.out.println("***** Now Testing File2 *****");
        System.out.println("Calling computeFrequencies() on file2\n");
        System.out.println("Expect:\n\nInitial Data (1 integers):\n\n100\n\n****** Results: *******\n\nrange 0-9 (0) |\n\nrange 10-19 (0) |\n\nrange 20-29 (0) |\n\nrange 30-39 (0) |\n\nrange 40-49 (0) |\n\nrange 50-59 (0) |\n\nrange 60-69 (0) |\n\nrange 70-79 (0) |\n\nrange 80-89 (0) |\n\nrange 90-99 (0) |\n\nrange 100-109 (1) |+");
        System.out.println("\n\nGot:\n");
        file2.computeFrequencies();
        System.out.println(file2);
        
        System.out.println("***** Now Testing File3 *****");
        System.out.println("Calling computeFrequencies() on file3\n");
        System.out.println("Expect:\n\nInitial Data (10 integers):\n\n1 18 93 341 281 12 102 46 340 2\n\n****** Results: *******\n\nrange 0-9 (2) |++\n\nrange 10-19 (2) |++\n\nrange 20-29 (0) |\n\nrange 30-39 (0) |\n\nrange 40-49 (1) |+\n\nrange 50-59 (0) |\n\nrange 60-69 (0) |\n\nrange 70-79 (0) |\n\nrange 80-89 (0) |\n\nrange 90-99 (1) |+\n\nrange 100-109 (1) |+\n\nrange 110-119 (0) |\n\nrange 120-129 (0) |\n\nrange 130-139 (0) |\n\nrange 140-149 (0) |\n\nrange 150-159 (0) |\n\nrange 160-169 (0) |\n\nrange 170-179 (0) |\n\nrange 180-189 (0) |\n\nrange 190-199 (0) |\n\nrange 200-209 (0) |\n\nrange 210-219 (0) |\n\nrange 220-229 (0) |\n\nrange 230-239 (0) |\n\nrange 240-249 (0) |\n\nrange 250-259 (0) |\n\nrange 260-269 (0) |\n\nrange 270-279 (0) |\n\nrange 280-289 (1) |+\n\nrange 290-299 (0) |\n\nrange 300-309 (0) |\n\nrange 310-319 (0) |\n\nrange 320-329 (0) |\n\nrange 330-339 (0) |\n\nrange 340-349 (2) |++");
        System.out.println("\n\nGot:\n");
        file3.computeFrequencies();
        System.out.println(file3);
        
        System.out.println("***** Now Testing File4 *****");
        System.out.println("Calling computeFrequencies() on file4\n");
        System.out.println("Expect:\n\nInitial Data (20 integers):\n\n2 17 21 5 35 37 28 9 16 25 37 27 15 16 10 2 4 29 16 8\n\n****** Results: *******\n\nrange 0-9 (6) |++++++\n\nrange 10-19 (6) |++++++\n\nrange 20-29 (5) |+++++\n\nrange 30-39 (3) |+++");
        System.out.println("\n\nGot:\n");
        file4.computeFrequencies();
        System.out.println(file4);
        
        System.out.println("***** Now Testing File4 *****");
        System.out.println("Calling computeFrequencies() on file4\n");
        System.out.println("Expect:\n\nInitial Data (5 integers):\n\n1 2 3 4 9\n\n****** Results: *******\n\nrange 0-9 (5) |+++++");
        System.out.println("\n\nGot:\n");
        file5.computeFrequencies();
        System.out.println(file5);
    }
}