/**
 * Created by 1 on 20.06.2017.
 */
public class Selection {
    public static int[] sort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int indMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < min){
                    min = array[j];
                    indMin = j;
                }
            }
            array[indMin] = array[i];
            array[i] = min;
        }
        return array;
    }
}
