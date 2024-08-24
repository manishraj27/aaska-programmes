import java.util.Scanner;

public class DaaEndSem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }

        // Output
        System.out.println(countMidpointPoints(N, a));
    }

    public static int countMidpointPoints(int N, int[] a) {
        int totalPoints = 0;

        // Iterate through all possible pairs of points
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Calculate midpoint coordinates
                int[] midpoint = new int[N];
                for (int k = 0; k < N; k++) {
                    midpoint[k] = (a[i] + a[j]) / 2;
                }

                // Check if midpoint coordinates are within the set
                boolean withinSet = true;
                for (int k = 0; k < N; k++) {
                    if (midpoint[k] < 0 || midpoint[k] > a[k]) {
                        withinSet = false;
                        break;
                    }
                }

                if (withinSet) {
                    totalPoints++;
                }
            }
        }

        return totalPoints;
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(countWays(N, a));
    }

    public static long countWays(int N, int[] a) {
        long totalPoints = 1;
        long totalMidpoints = 1;

        for (int i = 0; i < N; i++) {
            totalPoints *= (a[i] + 1); // Count the total number of points in dimension i
            totalMidpoints *= ((a[i] / 2) + 1); // Count the number of valid midpoints in dimension i
        }

        return totalPoints * totalMidpoints;
    }
}
