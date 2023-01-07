package ex1_3;

import java.util.Calendar;

public class MyDate {
    public final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public final String[] DAYS_IN_WEEK = {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};
    private int year, month, day;


    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
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

    public int[] generateDays(int year) {

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) {
            days[1] = 29;
        }

        return days;
    }

    public boolean isValid(int day, int month, int year) {
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    private String getDayString(int day) {
        if (day < 10) {
            return String.format("%02d", day);
        }

        return String.valueOf(day);
    }

    public String getDayOfWeek(int year, int month, int day) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DATE, day);
        calendar.set(Calendar.MONTH, month - 1);

        return DAYS_IN_WEEK[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }

    public MyDate nextYear() {
        int nextYear = getYear() + 1;

        return new MyDate(nextYear, getMonth(), getDay());
    }

    public MyDate nextMonth() {
        int nextMonth = getMonth() + 1;
        int nextYear = getYear();

        if (this.getMonth() == 11) {
            nextMonth = 0;
            nextYear = nextYear().getYear();
        }

        return new MyDate(nextYear, nextMonth, getDay());
    }

    public MyDate nextDay() {

        int[] days_max = generateDays(getYear());

        int nextDay = getDay() + 1;
        int nextMonth = getMonth();
        int nextYear = getYear();

        if (getDay() == days_max[getMonth() - 1]) {
            nextDay = 1;
            nextMonth = nextMonth().getMonth();
            nextYear = nextMonth().getYear();
        }

        return new MyDate(nextYear, nextMonth, nextDay);
    }

    public MyDate previousYear() {
        int prevYear = getYear() - 1;

        return new MyDate(prevYear, getMonth(), getDay());
    }

    public MyDate previousMonth() {
        int prevMonth = getMonth() - 1;
        int prevYear = getYear();

        if (this.getMonth() <= 1) {
            prevMonth = 12;
            prevYear = previousYear().getYear();
        }

        return new MyDate(prevYear, prevMonth, getDay());
    }

    public MyDate previousDay() {
        int[] days_max = generateDays(getYear());

        int prevDay = getDay() - 1;
        int prevMonth = getMonth();
        int prevYear = getYear();

        if (this.getDay() == 1) {
            prevMonth = previousMonth().getMonth(); //1 -> 12
            prevDay = days_max[prevMonth - 1]; //
            prevYear = previousMonth().getYear();
        }

        return new MyDate(prevYear, prevMonth, prevDay);
    }

    @Override
    public String toString() {
        return String.format("%s, %s %s %d", getDayOfWeek(getYear(), getMonth(), getDay()), getDayString(getDay()), MONTHS[getMonth() - 1], getYear());
    }


}
