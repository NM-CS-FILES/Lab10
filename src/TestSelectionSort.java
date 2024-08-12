import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class TestSelectionSort {
    public TestSelectionSort() { }

    @Test
    public void testPositive() {
        int[] arr = new int[] { 8, 9, 7, 10, 2 };
		int[] Sortedarr = new int[] { 2, 7, 8, 9, 10 };
		
		SelectionSort sorter = new SelectionSort();
		assertArrayEquals(Sortedarr, sorter.basicSelectionSort(arr));
    }

    @Test
    public void testNegative() {
        int[] arr = new int[] { -8, -9, -7, -10, -2 };
		int[] Sortedarr = new int[] { -10, -9, -8, -7, -2 };
		
		SelectionSort sorter = new SelectionSort();
		assertArrayEquals(Sortedarr, sorter.basicSelectionSort(arr));
    }

    @Test
    public void testMixed() {
        /** Test data contains with both positive, negative and zeros **/
    }

    @Test
    public void testDuplicates() {
        /** Test data contains duplicates **/
    }
}