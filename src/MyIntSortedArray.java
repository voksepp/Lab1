public class MyIntSortedArray implements MyIntSet {

    private final int[] intArray;

    /**
     * Constructor for class MyIntSortedArray, takes an int[]
     * @param intArray an array of int
     */
    public MyIntSortedArray (int[] intArray){
        this.intArray = intArray;                                       // sets the int array as a class variable
    }

    /**
     * This method implements binary search for an int array, searches the class variable int array for the specified element.
     * @param element Sought integer
     * @return true if the array contains the element, else false.
     */
    @Override
    public boolean member(int element) {
        int low = 0;                                                    // first index of the array
        int high = intArray.length - 1;                                 // last index of the array

        while (low <= high) {                                           // runs while the search interval is >0
            int mid = (low + high) >>> 1;
            int midVal = intArray[mid];                                 // saves the central element in the search interval

            if (midVal < element)                                       // if sought element > midVal
                low = mid + 1;                                          // set new low index above midVal
            else if (midVal > element)                                  // if sought element < midVal
                high = mid - 1;                                         // set new high index below midVal
            else
                return true;                                            // else the element has been found
        }
        return false;                                                   // if the element is not in the array
    }
}
