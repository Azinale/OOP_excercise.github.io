package ex1_4;

public class Test {
    public static void main(String[] args) {
        Movable movable1 = new MovablePoint(5, 6, 2, 4);
        movable1.moveUp();
        System.out.println(movable1);
        movable1.moveDown();
        System.out.println(movable1);
        movable1.moveLeft();
        System.out.println(movable1);
        movable1.moveRight();
        System.out.println(movable1);

        Movable movable2 = new MovableCircle(7, 8, 2, 3, 6);
        movable2.moveUp();
        System.out.println(movable2);
        movable2.moveDown();
        System.out.println(movable2);
        movable2.moveLeft();
        System.out.println(movable2);
        movable2.moveRight();
        System.out.println(movable2);
    }
}
