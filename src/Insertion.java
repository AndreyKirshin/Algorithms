/**
 * Created by 1 on 11.07.2017.
 */
public class Insertion {
    public static int[] doInsertion(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int j = i;
            while (j >= 0 && array[j] > array[j + 1]){
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--;
            }
        }
        return array;
    }
}
