package ex1_4;

public class Shape {
    private String color = "red";
    private boolean fill = true;

    public Shape() {
    }

    public Shape(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return fill;
    }

    public void setFilled(boolean fill) {
        this.fill = fill;
    }

    @Override
    public String toString() {
        return "Shape[" +
                "color='" + color +
                ", fill=" + fill +
                ']';
    }
}
