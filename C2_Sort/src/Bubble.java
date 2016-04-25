/**
 * 冒泡排序
 * Created by hotsky on 16/4/24.
 */
public class Bubble extends Sort {
    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) exch(a, j, j - 1);

            }
        }
    }
}
