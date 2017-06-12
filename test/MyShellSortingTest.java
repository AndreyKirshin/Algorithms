import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by 1 on 12.06.2017.
 */
public class MyShellSortingTest {
    @Test
    public void doSort() throws Exception {
        MyShellSorting target = new MyShellSorting();
        System.out.println(Arrays.toString(target.doSort(new int[]{2, 14, 13, 2, 5, -3, 0})));
        assertArrayEquals(target.doSort(new int[]{2, 14, 13, 2, 5, -3, 0}), new int[]{-3, 0, 2, 2, 5, 13, 14});
    }

}