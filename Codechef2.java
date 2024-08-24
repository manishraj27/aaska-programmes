import java.util.Scanner;

public class Codechef2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        scanner.nextLine();
        
        while (--T>=0) {
            String S = scanner.nextLine();
            

            boolean mvl = S.charAt(0) == '1';
            boolean mvr = S.charAt(1) == '1';
            boolean mvu = S.charAt(2) == '1';
            boolean mvd = S.charAt(3) == '1';

            int minX = 0, maxX = 0, minY = 0, maxY = 0;

            if (mvl) minX = -10;
            if (mvr) maxX = 10;
            if (mvu) maxY = 10;
            if (mvd) minY = -10;
            
            int count = 0;

            for (int x = minX; x <= maxX; x++) {
                for (int y = minY; y <= maxY; y++) {
                    count++;
                }
            }

            System.out.println(count);
        }
        
       
    }
}
