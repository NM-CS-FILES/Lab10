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