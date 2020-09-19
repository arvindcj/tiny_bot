package algo.sort;

import org.junit.Test;
import static org.junit.Assert.*;

public class InsertionSortTest {
    @Test public void testNullInput() {
         InsertionSort classUnderTest = new InsertionSort(new Integer[] {5,4,3,2,1});
        // Integer[] a = classUnderTest.sort();
        // for(int i=0; i < a.length; i++)
        //   System.out.println(a[i]);
        //assertArrayEquals(new Integer[] {1,2,3}, classUnderTest.sort());
    }
}
