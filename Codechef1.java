import java.util.Scanner;

public class Codechef1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(findLargestEvenSumSubarray(arr, N));
        }
        
        scanner.close();
    }

    private static int findLargestEvenSumSubarray(int[] arr, int N) {
        int firstEvenIndex = 0;
        int firstOddIndex = 0;
        int maxLength = 0;
        int currentSum = 0;

        for (int i = 0; i < N; i++) {
            currentSum += arr[i];

            if (currentSum % 2 == 0) {
                if (firstEvenIndex == -1) {
                    firstEvenIndex = i;
                }
                maxLength = Math.max(maxLength, i + 1);
            } else {
                if (firstOddIndex == -1) {
                    firstOddIndex = i;
                } else {
                    maxLength = Math.max(maxLength, i - firstOddIndex);
                }
            }
        }

        return maxLength;
    }
}



//javac FileName.java
//java FileName < i.txt > output.txt

int requiredLength = k * (k + 1) / 2;
            
            if(requiredLength > n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }