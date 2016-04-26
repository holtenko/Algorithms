/**
 * Created by hotsky on 16/4/25.
 */
public class Shell extends Sort {
    @Override
    public void sort(int[] a) {
        int len = a.length;
        int h = 1;
        while (3 * h < len) h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h; i < len; i++) {
                for (int j = i; j >= h && a[j] < a[j - h]; j -= h)
                    exch(a, j, j - h);
            }
            h = h / 3;
        }
    }
}
