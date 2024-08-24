import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef31071
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int switches = 0;
            boolean isCloseRangeGun = true; 
            
            for(int i = 0; i < n; i++) {
                if(isCloseRangeGun) {
                    if(arr[i] > d) {
                        // Need to switch to long-range gun
                        switches++;
                        isCloseRangeGun = false;
                    }
                } else {
                    if(arr[i] <= d) {
                        // Need to switch to close-range gun
                        switches++;
                        isCloseRangeGun = true;
                    }
                }
            }
            
            System.out.println(switches);
        }
    }
}
