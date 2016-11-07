import java.io.*;
import java.util.*;

public class Lab1A {

    public static void main(String[] args) throws java.io.FileNotFoundException, IllegalArgumentException {

        if (args.length != 2)
            throw new IllegalArgumentException("Two arguments required");

        int element = Integer.parseInt(args[0]);
        String file = args[1];

        List<Integer> integerList = new ArrayList<>();

        Scanner sc = new Scanner(new File(file));                               // adding integers from file to new ArrayList

        while (sc.hasNextInt())
            integerList.add(sc.nextInt());

        int[] intArray = convertIntListToArray(integerList);

        MyIntSortedArray sortedArray = new MyIntSortedArray(intArray);

        boolean isMember = sortedArray.member(element);

        System.out.println(isMember);
    }

    private static int[] convertIntListToArray(List<Integer> integerList)
    {
        int[] intArray = new int[integerList.size()];

        for (int i=0; i < intArray.length; i++)
            intArray[i] = integerList.get(i);                                   // unboxing

        return intArray;
    }
}
