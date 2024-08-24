import java.util.*;

class VsTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (--t>= 0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); 
            }
            
            Arrays.sort(arr); 
            int x = arr[(n-1)/2];
            int res = 0;

            for(int i = (n-1)/2; i < n; i++) {
                if(arr[i] > x+1) break;

                res += (x+1) - arr[i];
            }
            
            System.out.println(res);
        }
    }
}

//javac FileName.java
//java FileName < i.txt > output.txt
