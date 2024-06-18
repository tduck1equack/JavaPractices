package Files.OOP.bai13;

public class Main {
    public static void main(String[] args) {
        CustomInteger test = new CustomInteger(4);
        test.PrintInfo();
        CustomInteger test2 = new CustomInteger();
        test2.PrintInfo();
        System.out.println("sum of 2 above integers: " + CustomInteger.Sum(test, test2));
    }
}
