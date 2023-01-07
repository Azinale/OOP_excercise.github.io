package ex2_9;

public class TestMain {
    public static void main(String[] args) {

        MyPoint v1 = new MyPoint(3,2);
        MyPoint v2 = new MyPoint(9,5);
        MyPoint v3 = new MyPoint(4,-2);
        MyTriangle triangle1 = new MyTriangle(v1,v2,v3);

        System.out.println(triangle1);
        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1.getType());
    }
}
