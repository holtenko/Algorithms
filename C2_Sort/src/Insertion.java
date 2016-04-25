/**
 * Created by hotsky on 16/4/24.
 */
public class Insertion extends Sort {
    @Override
    public void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && a[j - 1] > a[j]; j--) {
                exch(a, j, j-1);
            }
        }
    }
}
