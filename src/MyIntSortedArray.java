public class MyIntSortedArray implements MyIntSet {

    private final int[] intArray;

    /**
     * Constructor for class MyIntSortedArray, takes an int[]
     * @param intArray
     */
    public MyIntSortedArray (int[] intArray){
        this.intArray = intArray;
    }

    /**
     * This method implements binary search for an int array, searches the class variable int array for the specified element.
     * @param element Sought integer
     * @return true if the array contains the element, else false.
     */
    @Override
    public boolean member(int element) {
        int low = 0;
        int high = intArray.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = intArray[mid];

            if (midVal < element)
                low = mid + 1;
            else if (midVal > element)
                high = mid - 1;
            else
                return true;
        }
        return false;
    }
}
