public class Square extends Rectangle {

    // No-arg constructor
    public Square() {
        super(1.0, 1.0);
    }

    // Constructor dengan side
    public Square(double side) {
        super(side, side);
    }

    // Constructor lengkap
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth(); // karena width = length
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Override agar tetap persegi
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getWidth() +
                ", which is a subclass of " + super.toString();
    }
}
