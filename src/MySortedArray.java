public class MySortedArray<E extends Comparable<? super E>> implements MySet<E> {

    private final E[] eArray;

    /**
     * Constructor for class MySortedArray, takes an array of elements E
     * @param eArray an array of elements E
     */
    public MySortedArray(E[] eArray){
        this.eArray = eArray;
    }

    /**
     * This method implements binary search generically, searches an array for the specified element.
     * @param element Sought element
     * @return true if the array contains the element, else false.
     */
    @Override
    public boolean member(E element) {
        int iLow = 0;                               //First index in array
        int iHigh = eArray.length - 1;              //Last index in array

        while (iLow <= iHigh) {
            int iMid = (iLow + iHigh) >>> 1;        //Check in the middle
            E midVal = eArray[iMid];                //midVal is the value of eArray at index iMid

            int diff = midVal.compareTo(element);   //Compare and return -1, 0 or 1 if midval is lesser than, equal to or greater than element
            if (diff < 0)
                iLow = iMid + 1;                    //Check the upper half
            else if (diff > 0)
                iHigh = iMid - 1;                   //Check the lower half
            else
                return true;                        //Element is found
        }
        return false;                               //Element is not found
    }

    /*  Since the algorithm splits the index in half when searching
    it is clear that the time complexity is O(log_2(n))  */
}
