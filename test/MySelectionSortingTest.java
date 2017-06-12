import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 1 on 12.06.2017.
 */
public class MySelectionSortingTest {
    @Test
    public void doSorting() throws Exception {
        MySelectionSorting target = new MySelectionSorting(new int[]{2, 14, 13, 2, 5, -3, 0});
        int[] res = target.doSorting();
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        assertArrayEquals(new int[]{-3, 0, 2, 2, 5, 13, 14}, res);
    }
}