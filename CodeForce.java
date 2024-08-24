import java.util.Scanner;

public class CodeForce {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(--t>=0){
            int n = sc.nextInt();

            if(n%2 != 0){
                System.out.println("NO");
            }
            else{
                int c = n/2;
                System.out.println("YES");
                for(int i = 0; i<c; i++){
                    System.out.print("AAAB");
                }
                System.out.println();
            }
        }
    }
}








/*
 * string --->superstring
 * neighbouring elements is same no as it is 
 * 
 * example:  AA
 */