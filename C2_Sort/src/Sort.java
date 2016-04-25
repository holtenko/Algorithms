/**
 * Created by hotsky on 16/4/24.
 */
public abstract class Sort {
    protected static void exch(int[] a,int i,int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
        for(int k:a){
            System.out.print(k+",");
        }
        System.out.println();
    }

    public abstract void sort(int[] a);

}
