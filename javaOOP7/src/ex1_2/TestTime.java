package ex1_2;

public class TestTime {
    public static void main(String[] args) {
        MyTime time1 = new MyTime(12, 57, 17);
        System.out.println(time1);

        System.out.println(time1.nextSecond().nextSecond());

        time1.setTime(17, 17, 17);
        System.out.println(time1);
        System.out.println(time1.previousSecond());
        System.out.println(time1.previousMinute());
        System.out.println(time1.previousHour());
    }
}
