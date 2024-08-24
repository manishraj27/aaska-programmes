import java.util.Scanner;

public class Nowinner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (--t>=0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int M = sc.nextInt();

            
            // int maxs = A + B + C + M;

          
            if (M >= Math.abs(A - B) || M >= Math.abs(A - C) || M >= Math.abs(B - C)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
      
    }
}
