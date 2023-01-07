package basic;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 || hour <= 23) {
            this.hour = hour;

        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 || minute <= 59) {
            this.minute = minute;

        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 || second <= 59) {
            this.second = second;
        }
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d", hour) +
                ":" + String.format("%02d", minute) +
                ":" + String.format("%02d", second);
    }


    public Time nextHour() {
        int nextHour = getHour() + 1;

        if (getHour() == 23) {
            nextHour = 0;
        }

        Time newTime = new Time(nextHour, getMinute(), getSecond());
        return newTime;
    }

    public Time nextMinute() {
        int nextMinute = getMinute() + 1;
        int nextHour = getHour();

        if (this.getMinute() == 59) {
            nextMinute = 0;
            nextHour = nextHour().getHour();
        }

        Time newTime = new Time(nextHour, nextMinute, getSecond());
        return newTime;
    }

    public Time nextSecond() {
        int nextSecond = getSecond() + 1;
        int nextMinute = getMinute();
        int nextHour = getHour();

        if (this.getSecond() == 59) {
            nextSecond = 0;
            nextMinute = nextMinute().getMinute();
            nextHour = nextMinute().getHour();
        }

        Time newTime = new Time(nextHour, nextMinute, nextSecond);
        return newTime;
    }

    public Time previousHour() {
        int prevHour = getHour() - 1;

        if (this.getHour() == 0) {
            prevHour = 23;
        }

        Time newTime = new Time(prevHour, getMinute(), getSecond());
        return newTime;
    }

    public Time previousMinute() {
        int prevMinute = getMinute() - 1;
        int prevHour = getHour();

        if (this.getMinute() == 0) {
            prevMinute = 59;
            prevHour = previousHour().getHour();
        }

        Time newTime = new Time(prevHour, prevMinute, getSecond());
        return newTime;
    }

    public Time previousSecond() {
        int prevSecond = getSecond() - 1;
        int prevMinute = getMinute();
        int prevHour = getHour();

        if (this.getHour() == 0) {
            prevSecond = 59;
            prevMinute = previousMinute().getMinute();
            prevHour = previousMinute().getHour();
        }

        Time newTime = new Time(prevHour, prevMinute, prevSecond);
        return newTime;
    }
}
