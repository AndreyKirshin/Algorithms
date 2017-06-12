
public class MyQuickSorting {
    int[] array;
    public MyQuickSorting(int[] array){
        doSort(array, 0, array.length - 1);
    }

    public void doSort(int[] array, int left, int right) {
        if(left >= right){
            return;
        }

        int i = left;
        int j = right;
        int indexMiddle = left + (right - left)/2;
        while (i < j){
            while (i < indexMiddle && array[i] <= array[indexMiddle]){
                i++;
            }
            while (j > indexMiddle && array[j] >= array[indexMiddle]) {
                j--;
            }
            if (i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
                if (i == indexMiddle) {
                    indexMiddle = j;
                } else if(j == indexMiddle){
                    indexMiddle = i;
                }
            }
        }
        doSort(array, left, indexMiddle);
        doSort(array, indexMiddle + 1, right);

        this.array = array;
    }
}
