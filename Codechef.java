import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 

        while (--T >= 0) {
            int N = scanner.nextInt();
            int[] sales = new int[N]; 

         
            for (int i = 0; i < N; i++) {
                sales[i] = scanner.nextInt();
            }

            long maxTotalSales = 0;

            
            for (int i = 0; i < N; i++) {
                long currentTotalSales = 0;

                
                for (int j = i; j >= 0; j--) {
                    currentTotalSales += sales[j];
                }

               
                currentTotalSales += sales[i] * 2;

              
                maxTotalSales = Math.max(maxTotalSales, currentTotalSales);
            }

          
            System.out.println(maxTotalSales);
        }

     
    }
}
