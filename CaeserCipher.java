//javac FileName.java
//java FileName < i.txt > output.txt
import java.util.Scanner;

class CaeserCipher{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shift value: ");
        int shift = sc.nextInt();
        System.out.println("Enter the string: ");
        String s = sc.next();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                res += (char) ((c + shift - 65) % 26 + 65);
            } else {
                res += (char) ((c + shift - 97) % 26 + 97);
            }
        }

        System.out.println("Encrypted string: ");
        System.out.println(res);
    }
}