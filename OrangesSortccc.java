import java.util.Scanner;

public class OrangesSortccc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int k = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] <= a[n - 1]) {
                int t = a[i];
                a[i] = a[k];
                a[k++] = t;
            }
        }
        
        int t = a[n - 1];
        a[n - 1] = a[k];
        a[k] = t;
        
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}


