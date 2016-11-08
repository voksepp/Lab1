import java.io.*;
import java.util.*;

public class Lab1A {

    /**
     * This method takes an integer and a file containing sorted integers as arguments and prints true if the integer can be found in the file, else false.
     * @param args "element file" where element is the sought integer and file contains sorted integers separated by spaces
     * @throws java.io.FileNotFoundException if the specified text file does not exist
     * @throws IllegalArgumentException if the amount of arguments specified is not = 1
     */
    public static void main(String[] args) throws java.io.FileNotFoundException, IllegalArgumentException {

        if (args.length != 2) {                                                 // making sure that two arguments are provided
            throw new IllegalArgumentException("Two arguments required");
        }

        int element = Integer.parseInt(args[0]);                                // saves the sought integer as a variable
        String file = args[1];                                                  // saves the file name

        List<Integer> integerList = new ArrayList<>();                          // creates an ArrayList for storage of the integers

        Scanner sc = new Scanner(new File(file));                               // adding integers from file to new ArrayList

        while (sc.hasNextInt()) {                                                 // saving the integers from the file into the list
            integerList.add(sc.nextInt());
        }

        int[] intArray = convertIntListToArray(integerList);                    // converting the list to an array

        MyIntSortedArray sortedArray = new MyIntSortedArray(intArray);          // creates an instance of the MyIntSortedArray object using the integer array

        boolean isMember = sortedArray.member(element);                         // runs the binary search method

        System.out.println(isMember);                                           // prints the result
    }

    /**
     * This method converts an ArrayList of integers to an integer array int[]
     * @param integerList a sorted ArrayList of Integers
     * @return  an array of type int containing the same sorted integers
     */
    private static int[] convertIntListToArray(List<Integer> integerList)
    {
        int[] intArray = new int[integerList.size()];                           // creates a new int array with the same size as the provided list

        for (int i=0; i < intArray.length; i++) {                              // saves each element of the list into the array
            intArray[i] = integerList.get(i);                                   // implied unboxing
        }

        return intArray;
    }
}
