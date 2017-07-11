import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by 1 on 11.07.2017.
 */
public class RadixTest {
    @Test
    public void doRadix() throws Exception {
        int[] q = new int[20];
        for (int i = 0; i < q.length; i++) {
            q[i] = (int)(Math.random()*10001);
        }
        System.out.println(Arrays.toString(q));
        System.out.println(Arrays.toString(Radix.doRadix(q)));
    }
}