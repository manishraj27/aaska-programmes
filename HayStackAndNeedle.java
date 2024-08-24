import java.io.*;
import java.util.*;

public class HayStackAndNeedle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.next();
        String needle = sc.next();

        if (needle.isEmpty()) {
            System.out.println(0);
            return;
        }

        int len1 = haystack.length();
        int len2 = needle.length();

        int p = 0;
        int q = 0;

        while (p < len1) {
            if (haystack.charAt(p) == needle.charAt(q)) {
                if (len2 == 1) {
                    System.out.println(p);
                    return;
                }
                ++p;
                ++q;
            } else {
                p -= q - 1;
                q = 0;
            }

            if (q == len2) {
                System.out.println(p - q);
                return;
            }
        }
        System.out.println(-1);
    }
}
