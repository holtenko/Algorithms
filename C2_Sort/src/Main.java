/**
 * Created by hotsky on 16/4/24.
 */
public class Main {
    public static void main(String[] args) {
        int[] a={2,1,6,4,9,5,3,1,7,8,0};
        Sort sort=new Heap();
        sort.sort(a);
        System.out.println("Result:");
        for(int i:a){
            System.out.print(i+",");
        }

    }
}
