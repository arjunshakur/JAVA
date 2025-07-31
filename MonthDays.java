import java.util.*;

public class MonthDays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number (1-12): ");
        int month = scanner.nextInt();
        scanner.close();
        int daysInMonth = getDaysInMonth(month);
        System.out.println("Number of days in the month: " + daysInMonth);
    }

    public static int getDaysInMonth(int month) {
        if (month == 1 || month == 3 || month == 5 ||
                month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 ||
                month == 11) {
            return 30;
        }
        return 28;
    }

}
