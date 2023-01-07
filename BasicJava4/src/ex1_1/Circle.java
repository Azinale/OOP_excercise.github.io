package ex1_1;

public class Circle {
    private double radio = 1.0;
    private String color = "red";

    public Circle() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Math.pow(radio, 2) * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radio=" + radio +
                ']';
    }

}
