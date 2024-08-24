import java.util.Scanner;

public class MakeBobWin {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            
            int startVal = Character.getNumericValue(s.charAt(0));
            int endVal = Character.getNumericValue(s.charAt(n - 1));

          
            int result = 2 - (startVal + endVal);

          
            System.out.println(Math.min(n, result));
        }
        sc.close();
    }
}
