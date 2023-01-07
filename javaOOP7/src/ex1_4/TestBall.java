package ex1_4;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(77, 70, 9, 17, 37);
        Container box = new Container(7, 7, 117, 177);

        for (int i = 0; i < 100; i++) {
            ball.move();
            if (box.collidesWith(ball)) {
                System.out.println("Collided");
            }
            System.out.println(ball);
        }
    }
}
