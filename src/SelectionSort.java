public class SelectionSort {
    public int[] basicSelectionSort(int[] x) {
        int temp;
        for (int i = 0; i < x.length; ++i) {
            for (int j = i + 1; j < x.length; ++j) {
                if (x[i] > x[j]) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        return x;
    }
}