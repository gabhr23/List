package cop2805;

import java.util.ArrayList;
import java.util.Collections;

public class assig2{

    public static void main(String[] args) {
     
        ArrayList<Double> doubleList = new ArrayList<>();

        // values to the list
        doubleList.add(1.5);
        doubleList.add(2.35);
        doubleList.add(-4.7);
        doubleList.add(0.01);

        // Print the list 
        PrintList(doubleList);

        // Sort the list
        Collections.sort(doubleList);

        // Print the sorted list
        PrintList(doubleList);

        // Search for the value 1.5
        int index = Collections.binarySearch(doubleList, 1.5);

        // Print the index where 1.5 was found
        System.out.println("Index of 1.5: " + index);

        // Fill the list with 0.0 
        Collections.fill(doubleList, 0.0);

        // Print the filled list
        PrintList(doubleList);
    }

    // Method to print each element of the ArrayList
    public static void PrintList(ArrayList<Double> list) {
        for (Double value : list) {
            System.out.println(value);
        }
        System.out.println();
    }
}
