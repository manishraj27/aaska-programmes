import java.util.Scanner;

public class BouncingBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] res = new int[t];

        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int totalSum = 0;
            for (int i = 0; i < n; i++) {
                totalSum += a[i];
            }

            int ways = 0;
            int lSum = 0;
            int rSum = totalSum;

            for (int i = 0; i < n; i++) {
                if (a[i] == 0) {
                    if (lSum == rSum - a[i]) {
                        ways += 2;
                    } else if (Math.abs(lSum - (rSum - a[i])) == 1) {
                        ways += 1;
                    }
                }
                lSum += a[i];
                rSum -= a[i];
            }

            res[k] = ways;
        }

        for (int r : res) {
            System.out.println(r);
        }

    }
}
