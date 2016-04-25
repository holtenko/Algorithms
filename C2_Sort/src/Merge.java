/**
 * Created by hotsky on 16/4/24.
 */
public class Merge extends Sort {
    private int[] tmp;

    public void merge(int[] a, int min, int mid, int max) {
        int i = min, j = mid + 1;
        for (int k = min; k <= max; k++) tmp[k] = a[k];
        for (int k = min; k <= max; k++) {
            if (i > mid) a[k] = tmp[j++];//左半部分遍历完
            else if (j > max) a[k] = tmp[i++];//右半部分遍历完
            else if (tmp[i] < tmp[j]) a[k] = tmp[i++];//左边小于右边
            else a[k] = tmp[j++];//左边大于右边
        }
    }

    @Override
    public void sort(int[] a) {
        tmp = new int[a.length];
        sort(a, 0, a.length - 1);
    }

    private void sort(int[] a, int min, int max) {
        if (max <= min) return;
        int mid = (max + min) / 2;
        sort(a, min, mid);
        sort(a, mid + 1, max);
        merge(a, min, mid, max);
    }
}
