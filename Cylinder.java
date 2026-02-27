package Circle;

public class Cylinder extends Circle {

    private double height;

    // Constructor default
    public Cylinder() {
        super();
        this.height = 1.0;
    }

    // Constructor dengan height
    public Cylinder(double height) {
        super();
        this.height = height;
    }

    // Constructor dengan radius dan height
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Constructor lengkap (radius, height, color)
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    // Override getArea() → luas permukaan tabung
    @Override
    public double getArea() {
        double r = getRadius();
        return 2 * Math.PI * r * height + 2 * super.getArea();
    }

    // Perbaikan getVolume()
    public double getVolume() {
        return super.getArea() * height; // gunakan luas alas
    }

    // Override toString()
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()
                + ", height=" + height;
    }
}
