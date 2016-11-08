import java.io.*;
import java.util.*;

public class Lab1B {
    /**
     *  This method Takes in 2 arguments which are the element that should be checked and the name of the file
     * @param args "element file" where element is the sought integer and file contains sorted integers separated by spaces
     * @throws java.io.FileNotFoundException if the specified text file does not exist
     * @throws IllegalArgumentException if the amount of arguments specified is not = 1
     *
     */
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 2) {
            throw new IllegalArgumentException("Two arguments required");
        }

        Integer element = Integer.parseInt(args[0]);                                //Sought element
        String file = args[1];                                                      //The filename

        List<Integer> integerList = new ArrayList<>();                              //Create an Integerlist

        Scanner sc = new Scanner(new File(file));                                   //Adding integers from file to new ArrayList

        while (sc.hasNextInt()) {
            integerList.add(sc.nextInt());                                          //Fill the integerlist with what is in the file
        }

        Integer[] intArray = integerList.toArray(new Integer[integerList.size()]);  //Save what's in the Integerlist to an array of Integers

        MySortedArray<Integer> sortedArray = new MySortedArray<>(intArray);         //MySortedArray takes the Integerarray

        boolean isMember = sortedArray.member(element);                             //Check if file contains element

        System.out.println(isMember);
    }
}
