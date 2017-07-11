import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by 1 on 20.06.2017.
 */
public class QuickTest {
    @Test
    public void sort() throws Exception {
        int[] q = new int[21];
        for (int i = 0; i < q.length; i++) {
            q[i] = (int)(Math.random()*21 - 10);
        }
        System.out.println(Arrays.toString(q));
        System.out.println(Arrays.toString(Quick.sort(q)));
    }

}