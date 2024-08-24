import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (--t>=0) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            long K = sc.nextLong();

            if (B < A) {
                System.out.println(A - B);
            } else {
                long operations = 0;

                while (A < B) {
                    if (B % K == 0) {
                        long diff = B / K - A;
                        operations += diff;
                        A += diff;
                    } else {
                        operations += B - A;
                        break;
                    }
                }

                System.out.println(operations);
            }
        }
    }
}
