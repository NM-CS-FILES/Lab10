import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class TestSelectionSort {
    public TestSelectionSort() { }

    @Test
    public void testPositive() {
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        /** add tests to check for this unit test **/
    }

    @Test
    public void testNegative() {
        /** Test data contains negative values only **/
    }

    @Test
    public void testMixed() {
        int[] arr = new int[] { -8, 9, -7, 10, 0 };
		int[] Sortedarr = new int[] { -8, -7, 0, 9, 10 };
		
		SelectionSort sorter = new SelectionSort();
		assertArrayEquals(Sortedarr, sorter.basicSelectionSort(arr));
    }

    @Test
    public void testDuplicates() {
        int[] arr = new int[] { 8, 2, 7, 7, 2 };
		int[] Sortedarr = new int[] { 2, 2, 7, 7, 8 };
		
		SelectionSort sorter = new SelectionSort();
		assertArrayEquals(Sortedarr, sorter.basicSelectionSort(arr));
    }
}