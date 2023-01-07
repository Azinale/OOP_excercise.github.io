package ex1_5;

public class Test {
    public static void main(String[] args) {
        GeometricObject geometricObject1 = new Circle(7);
        System.out.println(geometricObject1.getArea());
        System.out.println(geometricObject1.getPerimeter());
        System.out.println(geometricObject1);

        Resizable resizable1 = new ResizableCircle(8);
        System.out.println(resizable1);
        resizable1.resize(67);
        System.out.println(resizable1);
    }
}
