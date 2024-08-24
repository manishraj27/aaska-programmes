
import java.util.Scanner;


public class NearestEvenNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        int nearestEvenNumber = findNearestEvenDigitNumber(number);
        System.out.println(nearestEvenNumber);
    }

    private static int findNearestEvenDigitNumber(int number) {
        int nearestEvenNumber = findNextEvenDigitNumber(number);
        int previousEvenNumber = findNextEvenDigitNumber(number - 1);
        
        if (Math.abs(nearestEvenNumber - number) < Math.abs(previousEvenNumber - number)) {
            return nearestEvenNumber;
        } else {
            return previousEvenNumber;
        }
    }

    private static int findNextEvenDigitNumber(int number) {
        while (!hasAllEvenDigits(number)) {
            number++;
        }
        return number;
    }

    private static boolean hasAllEvenDigits(int number) {
        String str = Integer.toString(number);
        for (char c : str.toCharArray()) {
            int digit = Character.getNumericValue(c);
            if (digit % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}

//find nearest even no which has each digit as even 
// 50 ---> 48
// 60 -->62
// 6789
//   6780
//     6800
