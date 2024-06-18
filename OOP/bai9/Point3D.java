package Files.OOP.bai9;

import java.util.Scanner;

public class Point3D {

    public double X;
    public double Y;
    public double Z;

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    public double getZ() {
        return Z;
    }

    public void setZ(double z) {
        Z = z;
    }

    public Point3D(double x, double y, double z) {
        X = x;
        Y = y;
        Z = z;
    }

    public Point3D() {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("input X coordinate: ");
        X = inputReader.nextDouble();
        System.out.print("input Y coordinate: ");
        Y = inputReader.nextDouble();
        System.out.print("input Z coordinate: ");
        Z = inputReader.nextDouble();
    }

    public void PrintInfo() {
        System.out.printf("Point: (%.2f, %.2f, %.2f)\n", X, Y, Z);
    }

    public double Distance(Point3D target) {
        return Math.sqrt((X - target.X) * (X - target.X) +
                (Y - target.Y) * (Y - target.Y) +
                (Z - target.Z) * (Z - target.Z));
    }
}
