import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        
        while (--T >= 0) {
            int N = Integer.parseInt(br.readLine());
            
          
            int[] A = new int[N];
            
           
            Arrays.fill(A, 1);
            
        
            for (int i = 0; i < N; i++) {
                bw.write(A[i] + " ");
            }
            bw.newLine();
        }
        
        bw.flush();
    }
}
