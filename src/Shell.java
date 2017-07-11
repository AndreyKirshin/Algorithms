/**
 * Created by 1 on 11.07.2017.
 */
public class Shell {
    public static int[] doShell(int[] array) {
        int indMid = 1;
        while (indMid < array.length / 3) {
            indMid = indMid * 3 + 1;
        }
        while (indMid > 0){
            for (int i = 0; i < array.length - indMid; i++) {
                int j = i;
                while (j >= 0 && array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    j--;
                }
            }
            indMid = indMid / 3;
        }
        return array;
    }
}
