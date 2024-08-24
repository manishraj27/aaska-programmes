import java.util.Scanner;

class LargestK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (--T>= 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            String S = sc.next();
            
         
            int inv = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (S.charAt(i) == '1' && S.charAt(j) == '0') {
                        inv++;
                    }
                }
            }
            
          
            int minInv = inv;
            
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j <= N; j++) {
                    int flips = 0;
                    for (int x = i; x < j; x++) {
                        if (S.charAt(x) == '0') {
                            flips++;
                        }
                    }
                    
                    if (flips <= K) {
                        int newInv = inv;
                        for (int x = i; x < j; x++) {
                            for (int y = x + 1; y < N; y++) {
                                if (S.charAt(x) == '0' && S.charAt(y) == '1') {
                                    newInv--;
                                } else if (S.charAt(x) == '1' && S.charAt(y) == '0') {
                                    newInv++;
                                }
                            }
                        }
                        minInv = Math.min(minInv, newInv);
                    }
                }
            }
            
            System.out.println(minInv);
        }
    
    }
}
