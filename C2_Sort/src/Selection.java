/**
 * 选择排序
 * Created by hotsky on 16/4/24.
 */
public class Selection extends Sort {
    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) min = j;
            }
            exch(a, i, min);
        }
    }
}
