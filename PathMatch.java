// import java.util.Scanner;

// public class PathMatch {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
        
//         while (t-- > 0) {
//             int n = sc.nextInt(); 
//             int x = sc.nextInt(); 
//             int y = sc.nextInt(); 
//             String s = sc.next(); 
            
            
//             int aliceex = 0, aliceey = 0;
            
//             boolean bobwin = false;
            
//             for (int i = 0; i < n; i++) {
                
//                 switch (s.charAt(i)) {
//                     case 'U': aliceey++; break;
//                     case 'D': aliceey--; break;
//                     case 'L': aliceex--; break;
//                     case 'R': aliceex++; break;
//                 }
                
                
//                 int patchmatch = Math.abs(x - aliceex) + Math.abs(y - aliceey);
                
                
//                 if (patchmatch <= (i + 1) && (patchmatch % 2 == (i + 1) % 2)) {
//                     bobwin = true;
//                     break;
//                 }
//             }
            
//             System.out.println(bobwin ? "Yes" : "No");
//         }
//     }
// }


import java.util.Scanner;

public class PathMatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (--t>= 0) {
            int n = sc.nextInt(); 
            int x = sc.nextInt(); 
            int y = sc.nextInt(); 
            String s = sc.next(); 
            
            int aliceex = 0, aliceey = 0;
            boolean bobwin = false;
            int i = 0;
            
            while (i < n) {
                switch (s.charAt(i)) {
                    case 'U': aliceey++; break;
                    case 'D': aliceey--; break;
                    case 'L': aliceex--; break;
                    case 'R': aliceex++; break;
                }
                
             
                int patchmatch = Math.abs(x - aliceex) + Math.abs(y - aliceey);
                
              
                if (patchmatch <= (i + 1) && (patchmatch % 2 == (i + 1) % 2)) {
                    bobwin = true;
                    break;
                }
                
                i++;
            }
            
            System.out.println(bobwin ? "Yes" : "No");
        }
    }
}
