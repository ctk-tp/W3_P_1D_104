package Circle;

public class TestCylinder {

    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        System.out.println(c1);
        System.out.println("Surface Area = " + c1.getArea());
        System.out.println("Volume = " + c1.getVolume());
        System.out.println();

        Cylinder c2 = new Cylinder(10.0);
        System.out.println(c2);
        System.out.println("Surface Area = " + c2.getArea());
        System.out.println("Volume = " + c2.getVolume());
        System.out.println();

        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println(c3);
        System.out.println("Surface Area = " + c3.getArea());
        System.out.println("Volume = " + c3.getVolume());
        System.out.println();

        Cylinder c4 = new Cylinder(3.0, 5.0, "blue");
        System.out.println(c4);
        System.out.println("Surface Area = " + c4.getArea());
        System.out.println("Volume = " + c4.getVolume());
    }
}