package ex1_2;

public class Test {
    public static void main(String[] args) {
        GeometriObject geometriObject1 = new Circle(7);
        System.out.println(geometriObject1.getArea());
        System.out.println(geometriObject1.getPerimeter());
        System.out.println(geometriObject1);

        GeometriObject geometriObject2 = new Rectangle(17, 18);
        System.out.println(geometriObject2.getPerimeter());
        System.out.println(geometriObject2.getArea());
        System.out.println(geometriObject2);
    }

}
