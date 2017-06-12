
public class MySelectionSorting {
    int[] array;

    public MySelectionSorting(int[] array){
        this.array = array;
    }

    public int[] doSorting(){
        for(int i = 0; i < array.length - 1; i++){
            int indexMin = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[indexMin]){
                    indexMin = j;
                }
            }
            int tmp = array[i];
            array[i] = array[indexMin];
            array[indexMin] = tmp;
        }
        return array;
    }

}
