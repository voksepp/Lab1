public class MyIntSortedArray implements MyIntSet {

    private final int[] intArray;

    /**
     *
     * @param intArray
     */
    public MyIntSortedArray (int[] intArray){
        this.intArray = intArray;
    }

    /**
     *
     * @param element
     * @return
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
