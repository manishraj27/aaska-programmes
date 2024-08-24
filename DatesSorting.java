import java.util.Arrays;
import java.util.Scanner;

class Date implements Comparable<Date> {
    int day, month, year;

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public int compareTo(Date other) {
        if (this.year != other.year) {
            return Integer.compare(other.year, this.year);
        }
        if (this.month != other.month) {
            return Integer.compare(other.month, this.month);
        }
        return Integer.compare(other.day, this.day);
    }
}

public class DatesSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Date[] dates = new Date[n];
        
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            dates[i] = new Date(day, month, year);
        }

        Arrays.sort(dates);

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(dates[i].day + " " + dates[i].month + " " + dates[i].year);
        }

    }
}

