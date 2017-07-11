import java.util.Arrays;

/**
 * Created by 1 on 19.06.2017.
 */
public class Merge {
    public static int[] sort(int[] array){
        doMerge(array, 0, array.length - 1);
        return array;
    }
    private static void doMerge(int[] array, int left, int right) {
        if(left >= right){
            return;
        }
        int indMid = left + (right - left)/2;
        doMerge(array, left, indMid);
        doMerge(array, indMid + 1, right);

        int[] buf = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            buf[i] = array[i];
        }
        int i = left;
        int j = indMid + 1;
        for(int k = left; k <= right; k++){
            if(i > indMid){
                array[k] = buf[j];
                j++;
            }
            else if(j > right){
                array[k] = buf[i];
                i++;
            }
            else if(buf[i] > buf[j]){
                array[k] = buf[j];
                j++;
            }
            else {
                array[k] = buf[i];
                i++;
            }
        }
    }
}
