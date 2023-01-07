package basic;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if (this.day >= 1 || this.day <= 31) {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if (this.month >= 1 || this.month <= 12) {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if (this.year >= 1900 || this.year <= 9999) {
            this.year = year;
        }
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "\"" + String.format("%02d", day)+ "/" + String.format("%02d", month) + "/" + year + "\"";
    }
}
