import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by 1 on 11.07.2017.
 */
public class ShellTest {
    @Test
    public void doShell() throws Exception {
        int[] q = new int[20];
        for (int i = 0; i < q.length; i++) {
            q[i] = (int)(Math.random()*21 - 10);
        }
        System.out.println(Arrays.toString(q));
        System.out.println(Arrays.toString(Shell.doShell(q)));
    }

}