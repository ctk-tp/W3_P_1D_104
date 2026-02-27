package Circle;

/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {

    private double radius;
    private String color;

    // Constructor default
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor dengan radius
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    // Constructor dengan radius dan color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter radius
    public double getRadius() {
        return radius;
    }

    // Getter color
    public String getColor() {
        return color;
    }

    // Setter color
    public void setColor(String color) {
        this.color = color;
    }

    // Luas lingkaran
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}
