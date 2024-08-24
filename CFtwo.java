import java.util.Arrays;
import java.util.Scanner;

public class CFtwo {
    
    public static boolean canSortArray(int[] a) {
        return dfs(a);
    }

    private static boolean dfs(int[] arr) {
        if (isSorted(arr)) {
            return true;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 10) {
                int[] digits = getDigits(arr[i]);
                int[] newArr = insertDigits(arr, i, digits);
                if (dfs(newArr)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static int[] getDigits(int num) {
        String numStr = Integer.toString(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    private static int[] insertDigits(int[] arr, int index, int[] digits) {
        int[] newArr = new int[arr.length + digits.length - 1];
        System.arraycopy(arr, 0, newArr, 0, index);
        System.arraycopy(digits, 0, newArr, index, digits.length);
        System.arraycopy(arr, index + 1, newArr, index + digits.length, arr.length - index - 1);
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (--t >= 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(canSortArray(a) ? "YES" : "NO");
        }
    }
}
