import java.util.PriorityQueue;
import java.util.Scanner;

public class DoubleTrouble  {
    static final int MOD = 1000000007;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (--t>= 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[] a = new int[n];
            int i = 0;

            while (i < n) {
                a[i] = sc.nextInt();
                i++;
            }
            
          
            PriorityQueue<Long> pq = new PriorityQueue<>();
            for (int num : a) {
                pq.offer((long)num);
            }
            
            while (k > 0) {
                long minElement = pq.poll();
                minElement *= 2;
                pq.offer(minElement);
                k--;
            }
            
            long sum = 0;
            while (!pq.isEmpty()) {
                sum = (sum + pq.poll()) % MOD;
            }
            
            System.out.println(sum);
        }
    }
}
