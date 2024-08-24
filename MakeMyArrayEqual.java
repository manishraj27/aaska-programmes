// import java.util.*;

// public class   MakeMyArrayEqual {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while (--t>= 0) {
//             int n = sc.nextInt();
//             long[] a = new long[n];
//             Map<Long, Integer> m = new HashMap<>();
//             for (int i = 0; i < n; i++) {
//                 a[i] = sc.nextLong();
//                 if (a[i] != 0) {
//                     m.put(a[i], m.getOrDefault(a[i], 0) + 1);
//                 }
//             }
            
//             if (m.size() == 1 || m.size() == 0) {
//                 System.out.println("YES");
//             } else {
//                 System.out.println("NO");
//             }
//         }
//         sc.close();
//     }
// }

import java.util.*;

public class MakeMyArrayEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            Set<Long> nonzero = new HashSet<>();
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (a[i] != 0) {
                    nonzero.add(a[i]);
                }
            }
            
            if (nonzero.size() <= 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
    }
}
