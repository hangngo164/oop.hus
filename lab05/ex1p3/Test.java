package oop.lab05.ex1p3;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1.0f, 2.0f);
        System.out.println(point2D);

        Point3D point3D = new Point3D(0.0f, 0.0f, 0.0f);
        point3D.setXYZ(4.5f, 5.0f, 6.5f);
        System.out.println(point3D);
    }
}
