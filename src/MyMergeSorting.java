import java.util.Arrays;

public class MyMergeSorting {
    int[] array;
    public MyMergeSorting(int[] array){
        doSorting(array, 0, array.length - 1);
    }
    public void doSorting(int[] array, int left, int right){
        if (left >= right) {
            return;
        }
        int middle = left + (right - left) / 2;
        doSorting(array, left, middle);
        doSorting(array, middle + 1, right);

        int[] buffer = Arrays.copyOf(array, array.length);
        for (int i = left; i <= right; i++) {
            buffer[i] = array[i];
        }
        int l = left;
        int m = middle + 1;
        for (int i = left; i <= right; i++) {
            if (l > middle) {
                array[i] = buffer[m];
                m++;
            } else if (m > right) {
                array[i] = buffer[l];
                l++;
            } else if (buffer[l] < buffer[m]) {
                array[i] = buffer[l];
                l++;
            } else {
                array[i] = buffer[m];
                m++;
            }
        }

        this.array = array;
    }
}
