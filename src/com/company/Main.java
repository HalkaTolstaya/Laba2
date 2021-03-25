package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // Ввод точек с клавиатуры
        System.out.println("Enter the first point:");
        double firstX = in.nextDouble();
        double firstY = in.nextDouble();
        double firstZ = in.nextDouble();
        Point3d firstPoint = new Point3d(firstX, firstY, firstZ);
        // Ввод точек с клавиатуры
        System.out.println("Enter the second point:");
        double secondX = in.nextDouble();
        double secondY = in.nextDouble();
        double secondZ = in.nextDouble();
        Point3d secondPoint = new Point3d(secondX, secondY, secondZ);
        // Ввод точек с клавиатуры
        System.out.println("Enter the third point:");
        double thirdX = in.nextDouble();
        double thirdY = in.nextDouble();
        double thirdZ = in.nextDouble();
        // Расчет площади
        Point3d thirdPoint = new Point3d(thirdX, thirdY, thirdZ);
        if (firstPoint.pointComparing(secondPoint) || secondPoint.pointComparing(thirdPoint) || firstPoint.pointComparing(thirdPoint))
            System.out.println("Points are equal! Triangle didn't created!");
        else
        {
            double triangleArea = SQRT(firstPoint, secondPoint, thirdPoint);
            System.out.println("Triangle area = " + triangleArea);
        }
    }

    public static double SQRT(Point3d a, Point3d b, Point3d c)
    {
        double AB = a.distanceTo(b);
        double BC = b.distanceTo(c);
        double AC = a.distanceTo(c);
        double p = ((AB + AC + BC) / 3.0);
        double area = Math.sqrt(p * (p - AB) * (p - AC) * (p - BC));
        return area;
    }
}
