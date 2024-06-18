package Files.OOP.bai4;

public class RationalNumber {
    public double Value;
    public boolean IsPositive;

    public RationalNumber(double value, boolean isPositive) {
        Value = value;
        IsPositive = isPositive;
    }

    public void setValue(double value) {
        Value = value;
    }

    public double getValue() {
        return Value;
    }

    public boolean getIsPositive() {
        return IsPositive;
    }

    private void setIsPositive(boolean positive) {
        IsPositive = positive;
    }


    public static double findMax(RationalNumber a, RationalNumber b, RationalNumber c) {
        return Math.max(Math.max(a.Value, b.Value), c.Value);
    }

    public double nRoot(double n) {
        return Math.pow(this.Value, (1 / n));
    }
}
