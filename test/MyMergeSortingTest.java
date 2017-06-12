import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by 1 on 12.06.2017.
 */
public class MyMergeSortingTest {
    @Test
    public void doSorting() throws Exception {
        MyMergeSorting target = new MyMergeSorting(new int[]{2, 14, 13, 2, 5, -3, 0});
        System.out.println(Arrays.toString(target.array));
        assertArrayEquals(new int[]{-3, 0, 2, 2, 5, 13, 14}, target.array);
    }

}