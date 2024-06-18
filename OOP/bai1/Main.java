package Files.OOP.bai1;

public class Main {
    public static void main(String[] args) {
        SoPhuc test = new SoPhuc();
        test.setPhanThuc(3.5);
        test.setPhanAo(2.5);
        System.out.println(test.getPhanThuc());
        System.out.println(test.getPhanAo());
        test.InThongTin();
    }

}
