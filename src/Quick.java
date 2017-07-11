/**
 * Created by 1 on 20.06.2017.
 */
public class Quick {
    public static int[] sort(int[] array){
        doQuick(array, 0, array.length - 1);
        return array;
    }

    private static void doQuick(int[] array, int left, int right) {
        int mid = array[left + (right - left)/ 2];
        int i = left;
        int j = right;
        while (i <= j){
            while (array[i] < mid){
                i++;
            }
            while (array[j] > mid){
                j--;
            }
            if(i <= j){
                if(i < j){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
                i++;
                j--;
            }
        }
        if(i < right){
            doQuick(array, i, right);
        }
        if(j > left){
            doQuick(array, left, j);
        }
    }
}
