package ex2_10;

public class TestMain {
    public static void main(String[] args) {
        MyPoint bottomRight = new MyPoint(7,3);
        MyPoint topLeft = new MyPoint(5,9);

        MyRectangle rectangle1 = new MyRectangle(topLeft, bottomRight);

        System.out.println(rectangle1);
    }
}
