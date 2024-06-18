package Files.OOP.bai9;

public class Main {
    public static void main(String[] args) {
        Point3D pointA = new Point3D();
        Point3D pointB = new Point3D(2, 3, 6);
        pointA.PrintInfo();
        pointB.PrintInfo();
        System.out.printf("Distance from A to B: %.2f\n", pointA.Distance(pointB));
        pointA.setX(3);
        pointA.setY(5);
        pointA.setZ(6);
        pointA.PrintInfo();
        System.out.printf("Distance from A to B: %.2f\n", pointA.Distance(pointB));
    }
}
