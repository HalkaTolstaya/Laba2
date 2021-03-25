package com.company;
public class Point3d
{
    private double x;
    private double y;
    private double z;
    // Консструктор по умолчанию
    public Point3d()
    {
        this(0.0, 0.0, 0.0);
    }

    public Point3d(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return x;
    }

    public double getZ()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void setZ(double z)
    {
    this.z = z;
    }

    public boolean pointComparing(Point3d point)
    {
        return (x == point.x) && (y == point.y) && (z == point.z);
    }

    public double distanceTo(Point3d point)
    {
        double distance;
        distance = Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2) + Math.pow(point.z - z, 2));
        return distance;
    }
}
