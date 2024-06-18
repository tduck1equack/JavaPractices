package Files.OOP.bai15;

public class Main {
    public static void main(String[] args) {
        Clock c1 = new Clock(2, 30, 5);
        Clock c2 = new Clock();
        c1.PrintInfo();
        c2.PrintInfo();
        Clock c1c2 = Clock.CalculateTime(c1, c2);
        c1c2.PrintInfo();
    }
}
