package Files.OOP.bai16;

public class Main {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(2, 4, 2003);
        t1.PrintInfo();
        t2.PrintInfo();
        Time.TimeBetween(t1, t2);
    }
}
