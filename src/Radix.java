/**
 * Created by 1 on 11.07.2017.
 */
public class Radix {
    public static int[] doRadix(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }

        int maxRank = getMaxRank(max);
        for (int i = 1; i <= maxRank; i = i*10) {
            array = countingSort(array, i);
        }
        return array;
    }

    private static int getMaxRank(int max) {
        int maxDigit = 1;
        while (max > 10){
            max = max / 10;
            maxDigit = maxDigit * 10;
        }
        return maxDigit;
    }

    private static int[] countingSort(int[] array, int rank) {
        int[] out = new int[array.length];
        int[] count = new int[10];

        for (int i = 0; i < array.length; i++) {
            int countPosition = getCountPosition(array[i], rank);
            count[countPosition]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }

        for (int i = array.length - 1; i >= 0 ; i--) {
            int countPosition = getCountPosition(array[i], rank);
            int newPlace = count[countPosition] - 1;
            out[newPlace] = array[i];
            count[countPosition]--;
        }
        return out;
    }

    private static int getCountPosition(int value, int rank) {
        return ((value / rank) % 10);
    }
}
