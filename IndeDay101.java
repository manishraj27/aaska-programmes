import java.util.*;

class IndeDay101 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        while (--t>=0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            
            int maxcolor = Math.max(a, Math.max(b, c));
            int sumother2 = a + b + c - maxcolor;

            
            if (maxcolor > sumother2 + 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
       
    }
}
