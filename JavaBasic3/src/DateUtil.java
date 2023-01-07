import java.util.Scanner;

public class DateUtil {

    public static int[] inputDate(Scanner scan) {
        int[] ddmmyy = new int[3];

        String input = scan.next();
        String[] splitString = input.split("/");
        for (int i = 0; i < splitString.length; i++) {
            ddmmyy[i] = Integer.valueOf(splitString[i]);
        }

        return ddmmyy;
    }

    public static String[] generateDaysInWeeks() {
        String[] daysOfWeeks = {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};

        return daysOfWeeks;
    }

    public static String[] generateMonths() {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        return months;

    }

    public static int[] generateDays(int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) {
            days[1] = 29;
        }

        return days;
    }

    public static boolean isValid(int day, int month, int year) {
        int[] days = generateDays(year);

        if (month < 0 || month > 11) {
            return false;
        } else if (day <= 0 || day > days[month]) {
            return false;
        } else if (year <= 0 || year > 9999) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 == 0 && year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int getDayOfWeek(int year, int month, int day) {

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + 31 * m0 / 12) % 7;


        return d0;
    }

    public static void printDate(int year, int month, int day) {
        String[] daysInWeek = generateDaysInWeeks();

        System.out.printf("%s %d %d %d", daysInWeek[getDayOfWeek(year, month, day)], year, month, day);

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] dates;
        while (true) {
            dates = inputDate(scan);
            if (isValid(dates[0], dates[1], dates[2])) {
                break;
            } else {
                System.out.println("Invalid date!");
            }
        }

        printDate(dates[0], dates[1], dates[2]);


    }
}
