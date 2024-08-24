import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class DescendingSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); 
        
        while (T-- > 0) {
            int N = sc.nextInt(); 
            Integer[] arr = new Integer[N]; 

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr, new Comparator<Integer>() {
                @Override
                public int compare(Integer a, Integer b) {
                    return b - a; // Sort in descending order
                }
            });

            
              /*A comparator is a comparison function,
             which provide an ordering for collections of objects 
             that don't have a natural ordering. */

           
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
