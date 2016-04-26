/**
 * Created by hotsky on 16/4/25.
 */
public class Heap0 extends Sort {
    @Override
    public void sort(int[] a) {
        int len = a.length;
        for (int i = len / 2 - 1; i >= 0; i--) sink(a, i, len);

        for (int i = len - 1; i >= 0; i--) {
            exch(a, 0, i);
            sink(a, 0, i - 1);
        }
    }

    public void sink(int[] a, int k, int len) {
        while (2 * k <= len) {
            int j = 2 * k;
            if (j < len && a[j] < a[j + 1]) j++;
            if (a[j] <= a[k]) break;
            exch(a, k, j);
            k = j;
        }
    }
}
