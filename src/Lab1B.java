import java.io.*;
import java.util.*;

public class Lab1B {

    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 2)
            throw new IllegalArgumentException("Two arguments required");

        Integer element = Integer.parseInt(args[0]);
        String file = args[1];

        List<Integer> integerList = new ArrayList<>();

        Scanner sc = new Scanner(new File(file));                               // adding integers from file to new ArrayList

        while (sc.hasNextInt())
            integerList.add(sc.nextInt());

        Integer[] intArray = integerList.toArray(new Integer[0]);

        MySortedArray<Integer> sortedArray = new MySortedArray<>(intArray);

        boolean isMember = sortedArray.member(element);

        System.out.println(isMember);
    }
}
