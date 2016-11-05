public class MySortedArray<E extends Comparable<? super E>> implements MySet<E> {

    private final E[] eArray;

    public MySortedArray(E[] eArray){
        this.eArray = eArray;
    }

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
