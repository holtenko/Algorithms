/**
 * Created by hotsky on 16/4/25.
 */
public class Quick extends Sort {
    @Override
    public void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    public void sort(int[] a, int min, int max) {
        if (min >= max) return;

        int i = min, j = max + 1;
        while (true) {
            while (a[++i] < a[min]) if (i >= max) break;
            while (a[min] < a[--j]) if (j <= min) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, min, j);

        sort(a, min, j - 1);
        sort(a, j + 1, max);
    }
}
