import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 1 on 21.06.2017.
 */
public class BinarySearchTest {
    @Test
    public void doBi() throws Exception {
        System.out.println(BinarySearch.doBi(new int[]{2, 5, 8, 11, 14, 17, 20, 31}, 5));
        System.out.println(BinarySearch.doBi(new int[]{2, 5, 8, 11, 14, 17, 20, 31}, 2));
        System.out.println(BinarySearch.doBi(new int[]{2, 5, 8, 11, 14, 17, 20, 31}, 31));
        System.out.println(BinarySearch.doBi(new int[]{2, 5, 8, 11, 14, 17, 20, 31}, 74));

    }

}