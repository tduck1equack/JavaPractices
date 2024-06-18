package Files.OOP.bai4;

public class Main {
    public static void main(String[] args) {
        RationalNumber test1 = new RationalNumber(5, true);
        RationalNumber test2 = new RationalNumber(-6, false);
        RationalNumber test3 = new RationalNumber(9, true);
        System.out.println(RationalNumber.findMax(test1, test2, test3));
        System.out.println(test3.nRoot(2));
    }
}
