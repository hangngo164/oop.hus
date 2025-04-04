package oop.lab05.ex1p3;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D() {
        super();
        z = 0.0f;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        setX(getX() + x);
        setY(getY() + y);
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[] {getX(), getY(), getZ()};
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
    }
}
