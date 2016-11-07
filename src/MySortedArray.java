public class MySortedArray<E extends Comparable<? super E>> implements MySet<E> {

    private final E[] eArray;

    /**
     * Constructor for class MySortedArray, takes an array of elements E
     * @param eArray
     */
    public MySortedArray(E[] eArray){
        this.eArray = eArray;
    }

    /**
     * This method implements binary search for an generically, searches the class variable array for the specified element.
     * @param element Sought element
     * @return true if the array contains the element, else false.
     */
    @Override
    public boolean member(E element) {
        int iLow = 0;
        int iHigh = eArray.length - 1;

        while (iLow <= iHigh) {
            int iMid = (iLow + iHigh) >>> 1;
            E midVal = eArray[iMid];

            int diff = midVal.compareTo(element);
            if (diff < 0)
                iLow = iMid + 1;
            else if (diff > 0)
                iHigh = iMid - 1;
            else
                return true;
        }
        return false;
    }
}
