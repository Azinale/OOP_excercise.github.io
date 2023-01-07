package ex2_7;

public class TestMain {
    public static void main(String[] args) {
        MyPoint a = new MyPoint(6,9);
        MyPoint b = new MyPoint(2,7);

        MyLine ab = new MyLine(a,b);

        System.out.println(ab);

        System.out.println(ab.getLength());
        System.out.println(ab.getGradient());
        System.out.println(ab.getEnd());
        ab.setEndXY(7,7);
        System.out.println(ab);
    }
}

