import java.util.Scanner;

class NonPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] primeornot = new boolean[200 + 1];
        for (int i = 0; i <= 200; i++) {
            primeornot[i] = true;
        }
        primeornot[0] = primeornot[1] = false;

        for (int i = 2; i * i <= 200; i++) {
            if (primeornot[i]) {
                for (int j = i * i; j <= 200; j += i) {
                    primeornot[j] = false;
                }
            }
        }

        int t = sc.nextInt();
        
        while (--t>=0) {
            int n = sc.nextInt();
            int[] arr = new int[101];
            int[] a = new int[n];
            
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                arr[a[i]]++;
            }

            boolean found = false;
            
        
            outerLoop:
            for (int i = 1; i <= 100; i++) {
                if (arr[i] == 0) continue;
                for (int j = i; j <= 100; j++) {
                    if (arr[j] == 0) continue;
                    if (i != j || arr[i] > 1) {
                        int sum = i + j;
                        if (!primeornot[sum]) {
                           
                            int f_idx = -1, s_idx = -1;
                            for (int k = 0; k < n; k++) {
                                if (a[k] == i && f_idx == -1) {
                                    f_idx = k + 1; 
                                } else if (a[k] == j && (s_idx == -1 || s_idx == f_idx)) {
                                    s_idx = k + 1; 
                                }
                                if (f_idx != -1 && s_idx != -1 && f_idx != s_idx) {
                                    System.out.println(f_idx + " " + s_idx);
                                    found = true;
                                    break outerLoop;
                                }
                            }
                        }
                    }
                }
            }

            if (!found) {
                System.out.println("-1");
            }
        }
    }
}


