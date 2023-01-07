package ex1_1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The circle has radius of: " + circle1.getRadio() + " And Area of: " + circle1.getArea());
        Circle circle2 = new Circle();
        circle2.setRadio(2.0);
        Circle circle3 = new Circle();
        circle3.setRadio(3.0);
        circle3.setColor("blue");
        System.out.println("The circle has radius of " + circle3.getRadio() + " and area of " + circle3.getArea() + "and color of" + circle3.getColor());
        Circle circle4 = new Circle();
        circle4.setRadio(5.5);
        System.out.println("radius is: " + circle4.getRadio());
        circle4.setColor("green");
        System.out.println("color is: " + circle4.getColor());
        Circle circle5 = new Circle();
        circle5.setRadio(5.0);
        System.out.println(circle5.toString());
        Circle circle6 = new Circle();
        circle6.setRadio(6.6);
        System.out.println(circle6.toString());
        System.out.println(circle6);
        System.out.println("Operator '+' invokes toString() too: " + circle6);
    }
}
