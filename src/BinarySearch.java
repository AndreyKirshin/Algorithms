/**
 * Created by 1 on 21.06.2017.
 */
public class BinarySearch {
    public static int doBi(int[] array, int target){
        return lookFor(array, target, 0, array.length - 1);
    }

    private static int lookFor(int[] array, int target, int left, int right) {
        if(left > right){
            return -1;
        }
        int indMid = left + (right - left) / 2;

        if(target == array[indMid]){
            return indMid;
        } else if(target < array[indMid]){
            return lookFor(array, target, left, indMid - 1);
        } else if(target > array[indMid]){
            return lookFor(array, target, indMid + 1, right);
        }
        return indMid;
    }
}
