/**
 * Created by allenko on 2016/4/26.
 */
public class Heap1 extends Sort {
    @Override
    public void sort(int[] a) {
        int len = a.length - 1;
        for (int i = len / 2; i > 0; i--) sink(a, i, len);

        for (int i = len; i > 0; i--) {
            exch(a, 1, i);
            sink(a, 1, i-1);
        }
    }

    public void sink(int[] a, int k, int len) {
        while (2 * k <= len) {
            int j = 2 * k;
            if (j < len && a[j] < a[j + 1]) j++;
            if (a[j] < a[k]) break;
            exch(a, k, j);
            k = j;
        }
    }
}
