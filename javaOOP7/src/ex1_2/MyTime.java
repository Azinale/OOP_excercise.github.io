package ex1_2;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    private String getHourString(int hour) {
        if (hour < 10) {
            return String.format("%02d", hour);
        }

        return String.valueOf(hour);
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    private String getMinuteString(int minute) {
        if (minute < 10) {
            return String.format("%02d", minute);
        }

        return String.valueOf(minute);
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    private String getSecondString(int second) {
        if (second < 10) {
            return String.format("%02d", second);
        }

        return String.valueOf(second);
    }

    public void setTime(int hour, int minute, int second) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    public MyTime nextHour() {
        int nextHour = getHour() + 1;

        if (getHour() == 23) {
            nextHour = 0;
        }

        MyTime newTime = new MyTime(nextHour, getMinute(), getSecond());
        return newTime;
    }

    public MyTime nextMinute() {
        int nextMinute = getMinute() + 1;
        int nextHour = getHour();

        if (this.getMinute() == 59) {
            nextMinute = 0;
            nextHour = nextHour().getHour();
        }

        MyTime newTime = new MyTime(nextHour, nextMinute, getSecond());
        return newTime;
    }

    public MyTime nextSecond() {
        int nextSecond = getSecond() + 1;
        int nextMinute = getMinute();
        int nextHour = getHour();

        if (this.getSecond() == 59) {
            nextSecond = 0;
            nextMinute = nextMinute().getMinute();
            nextHour = nextMinute().getHour();
        }

        MyTime newTime = new MyTime(nextHour, nextMinute, nextSecond);
        return newTime;
    }

    public MyTime previousHour() {
        int prevHour = getHour() - 1;

        if (this.getHour() == 0) {
            prevHour = 23;
        }

        MyTime newTime = new MyTime(prevHour, getMinute(), getSecond());
        return newTime;
    }

    public MyTime previousMinute() {
        int prevMinute = getMinute() - 1;
        int prevHour = getHour();

        if (this.getMinute() == 0) {
            prevMinute = 59;
            prevHour = previousHour().getHour();
        }

        MyTime newTime = new MyTime(prevHour, prevMinute, getSecond());
        return newTime;
    }

    public MyTime previousSecond() {
        int prevSecond = getSecond() - 1;
        int prevMinute = getMinute();
        int prevHour = getHour();

        if (this.getHour() == 0) {
            prevSecond = 59;
            prevMinute = previousMinute().getMinute();
            prevHour = previousMinute().getHour();
        }

        MyTime newTime = new MyTime(prevHour, prevMinute, prevSecond);
        return newTime;
    }

    @Override
    public String toString() {
        return String.format("%s:%s:%s", getHourString(getHour()), getMinuteString(getMinute()), getSecondString(getSecond()));
    }
}
