import org.junit.Test;

import java.util.Arrays;

/**
 * Created by 1 on 19.06.2017.
 */
public class MergeTest {
    @Test
    public void sort() throws Exception {
        int[] q = new int[20];
        for (int i = 0; i < q.length; i++) {
            q[i] = (int)(Math.random()*21 - 10);
        }
        System.out.println(Arrays.toString(q));
        System.out.println(Arrays.toString(Merge.sort(q)));
        System.out.println(Arrays.toString(Merge.sort(new int[]{2, 14, 13, 2, 5, -3, 0})));
    }

}