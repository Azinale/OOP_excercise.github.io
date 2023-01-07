package ex1_3;

public class TestDate {
    public static void main(String[] args) {
        MyDate birthday = new MyDate(2003, 3, 16);
        MyDate date1 = new MyDate(1999, 5, 4);
        System.out.println(date1);
        System.out.println(birthday);

        System.out.println(birthday.previousDay());
        System.out.println(birthday.previousMonth());
        System.out.println(birthday.previousYear());

        System.out.println(date1);
        System.out.println(date1.nextDay());

    }
}
