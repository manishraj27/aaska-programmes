import java.util.Scanner;

class TruthLie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (--t>=0) {
            int n = sc.nextInt(); 
            int m = sc.nextInt(); 
            
           
            int th = 2 * m + 1;
            int tppl = n + m;
            
            if (th > tppl) {
                System.out.println("-1");
            } else {
                System.out.println(Math.max(th, m + 1));
            }
        }
    }
}
