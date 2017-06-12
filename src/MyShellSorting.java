import java.util.Arrays;

public class MyShellSorting {
    public int[] doSort(int[] array){
        int indexMiddle = array.length/2;
        while (indexMiddle > 0){
            for (int i = 0; i < array.length - indexMiddle; i++){
                int j = i;
                while ((j >= 0) && (array[j] > array[j + indexMiddle])){
                    int tmp = array[j];
                    array[j] = array[j + indexMiddle];
                    array[j + indexMiddle] = tmp;

                    j--;
                }
            }
            indexMiddle = indexMiddle / 2;
        }
        return array;
    }
}
