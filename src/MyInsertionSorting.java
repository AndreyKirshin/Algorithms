
public class MyInsertionSorting {
    int[] array;
    public MyInsertionSorting(int[] array){
        this.array = array;
    }

    public int[] doSorting() {
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] > array[i + 1]){
                int tmp = array[i + 1];
                array[i + 1] = array[i];
                int j = i;
                while(j > 0 && tmp < array[j - 1]){
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = tmp;
            }
        }
        return array;
    }

}
