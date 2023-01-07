package ex1_3;

public class Test {
    public static void main(String[] args) {
        Movable movable1 = new MovablePoint(7, 8, 3, 5);
        movable1.moveUp();
        System.out.println(movable1);
        movable1.moveDown();
        System.out.println(movable1);
        movable1.moveLeft();
        System.out.println(movable1);
        movable1.moveRight();
        System.out.println(movable1);
    }

}
