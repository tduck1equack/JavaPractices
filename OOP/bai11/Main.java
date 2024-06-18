package Files.OOP.bai11;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order(14, "13/06/2024", "Hao Hao Noodle", 9.50, 5, "Spicy");
        order1.PrintInfo();
        order2.PrintInfo();
        order1.setOrderDate("19/12/2023");
        order1.setCode(18);
        order1.setUnitPrice(15.7);
        order1.PrintInfo();
    }
}
