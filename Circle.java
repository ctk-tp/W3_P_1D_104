public class Circle extends Shape {

    private double radius;

    // No-arg constructor
    public Circle() {
        super();
        this.radius = 1.0;
    }

    // Constructor dengan radius
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Constructor lengkap
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter & Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method khusus
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + radius +
                ", which is a subclass of " + super.toString();
    }
}
