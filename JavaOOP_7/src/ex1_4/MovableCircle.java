package ex1_4;

public class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xspeed, int yspeed, int radius) {
        super(x, y, xspeed, yspeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "[" + "(" + x + ", " + y + ")" + ", Speed= ( " + xspeed + ", " + yspeed + ")" + ", radius=" + radius + ']';
    }

    public void moveUp() {
        y -= yspeed;
    }

    public void moveDown() {
        y += yspeed;
    }

    public void moveLeft() {
        x -= xspeed;
    }

    public void moveRight() {
        x += xspeed;
    }
}
