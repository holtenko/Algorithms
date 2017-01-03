/**
 * Created by hotsky on 16/4/24.
 */
public class Main {
    public static void main(String[] args) {
        int[] a={2,1,6,4,9,5,3,1,7,8};
        System.out.println("Origin:");
        for(int i:a){
            System.out.print(i+" ");
        }
            System.out.println();
            System.out.println("Process:");
        Sort sort=new Bubble();
        sort.sort(a);
        System.out.println("Result:");
        for(int i:a){
            System.out.print(i+" ");
        }

    }
}
