package ch17pc02;
import static ch17pc02.ObjectQuickSorter.*;
/**
 *
 * @author Frank Olson
 */
public class Ch17pc02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] stringArray = {"beta", "gamma", "alpha", "epsilon", "delta"};
        printStuff(stringArray, "Unsorted Array: ");
        
        quickSort(stringArray);
        
        printStuff(stringArray, "Sorted Array: ");
    }
    
    /**
     * Method to print the individual elements of an array
     * @param array String[] The array to be printed
     * @param text String The type of array
     */
    public static void printStuff(String[] array, String text){
        // Print the original array
        System.out.println(text);
        for (String str: array) {
            System.out.println(str + " ");
        }
        System.out.println();
    }
}
