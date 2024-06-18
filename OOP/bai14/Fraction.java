package Files.OOP.bai14;

import java.util.Scanner;

public class Fraction {
    public int Numerator;
    public int Denominator;

    public int getNumerator() {
        return Numerator;
    }

    public void setNumerator(int numerator) {
        Numerator = numerator;
    }

    public int getDenominator() {
        return Denominator;
    }

    public void setDenominator(int denominator) {
        Denominator = denominator;
    }

    public void PrintInfo() {
        System.out.printf("the fraction is %d/%d\n", Numerator, Denominator);
    }

    private void ReduceFraction() {
        int maxDivision = 1;
        for (int i = 1; i < Math.min(Numerator, Denominator); i++) {
            if (Numerator % i == 0 && Denominator % i == 0) {
                maxDivision = i;
            }
        }
        Numerator /= maxDivision;
        Denominator /= maxDivision;
    }

    public static Fraction Sum(Fraction x, Fraction y) {
        Fraction sumFraction = new Fraction(1, 1);
        sumFraction.Numerator = x.Numerator * y.Denominator + y.Numerator * x.Denominator;
        sumFraction.Denominator = x.Denominator * y.Denominator;
        sumFraction.ReduceFraction();
        return sumFraction;
    }

    public static Fraction Subtract(Fraction x, Fraction y) {
        Fraction subtractFraction = new Fraction(1, 1);
        subtractFraction.Numerator = x.Numerator * y.Denominator - y.Numerator * x.Denominator;
        subtractFraction.Denominator = x.Denominator * y.Denominator;
        subtractFraction.ReduceFraction();
        return subtractFraction;
    }

    public Fraction(int num, int denom) {
        Numerator = num;
        Denominator = denom;
    }

    public Fraction() {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("initializing fraction");
        System.out.print("input numerator: ");
        Numerator = inputReader.nextInt();
        System.out.print("input denominator: ");
        Denominator = inputReader.nextInt();
    }


}
