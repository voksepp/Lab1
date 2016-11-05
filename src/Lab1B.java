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

        Integer[] intArray = convertListToArray(integerList);

        MySortedArray<Integer> sortedArray = new MySortedArray<>(intArray);

        boolean isMember = sortedArray.member(element);

        System.out.println(isMember);
    }

    private static Integer[] convertListToArray(List<Integer> integerList)
    {
        Integer[] intArray = new Integer[integerList.size()];

        for (int i=0; i < intArray.length; i++)
            intArray[i] = integerList.get(i);

        return intArray;
    }
}
