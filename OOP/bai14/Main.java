package Files.OOP.bai14;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction();
        Fraction sum = Fraction.Sum(f1, f2);
        Fraction sub = Fraction.Subtract(f1, f2);
        f1.PrintInfo();
        f2.PrintInfo();
        sum.PrintInfo();
        sub.PrintInfo();
    }
}
