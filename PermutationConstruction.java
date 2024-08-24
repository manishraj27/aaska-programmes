import java.util.*;

public class PermutationConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

       while (--t>=0) {
            int N = sc.nextInt();
            int[] perm = conperm(N);
            for (int i = 0; i < N; i++) {
                System.out.print(perm[i] + " ");
            }
            System.out.println();
        }

     
    }

    public static int[] conperm(int N) {
        int[] perm = new int[N];

        if (N == 1) {
            perm[0] = 1;
        } else {
            
            int lft = 1;
            int rt = N;
            boolean lftTurn = true;

            for (int i = 0; i < N; i++) {
                if (lftTurn) {
                    perm[i] = lft++;
                } else {
                    perm[i] = rt--;
                }
                lftTurn = !lftTurn;
            }
        }

        return perm;
    }
}
