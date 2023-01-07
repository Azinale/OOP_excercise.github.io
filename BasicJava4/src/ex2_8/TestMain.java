package ex2_8;

public class TestMain {
    public static void main(String[] args) {
        MyPoint o1 = new MyPoint(3, 7);
        MyCircle circle1 = new MyCircle(o1, 5);
        System.out.println(circle1);
        System.out.println(circle1.getCenterX());
        System.out.println(circle1.getCenterY());


        MyPoint o2 = new MyPoint(2, 6);
        MyCircle circle2 = new MyCircle(o2, 9);
        System.out.println(circle2);

        System.out.println(circle1.distance(circle2));

        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());
    }
}
