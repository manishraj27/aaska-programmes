/*
 * i. <><<> ---2
 *    ___
 * ii. <><<>> ---6
 *     ______
 * iii. <>><<<>>> ---2
 *     ___ 
 * 
 * max length of valid seq. brackets strating from the begining of the String.
 */








 import java.util.Scanner;

public class BalancedAngularBracket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        String s = sc.next();  
        int c = 0, mx = 0;  
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<') {
                c++;
            } else {
                c--;
            }
            if (c < 0) break;
            if (c == 0) {
                mx = i + 1;
            }
        }
        System.out.println(mx); 
    }
}
