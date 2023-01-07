package ex1_8;

public class TestMain {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(9, 6, 17, 12);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        Movable m2 = new MovableCircle(7, 5, 5, 2, 10);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);

        Movable m3 = new MovableRectangle(11, 22, 33, 48, 7, 9);
        System.out.println(m3);
        m3.moveUp();
        m3.moveRight();
        System.out.println(m3);
    }
}
