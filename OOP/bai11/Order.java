package Files.OOP.bai11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Order {
    public int Code;
    public LocalDate OrderDate;
    public String ProductName;
    public double UnitPrice;
    public int Quantity;
    public double TotalPrice;
    public String Note;

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getOrderDate() {
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return OrderDate.format(datePattern);
    }

    public void setOrderDate(String orderDate) {
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        OrderDate = LocalDate.parse(orderDate, datePattern);
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
        TotalPrice = Quantity * UnitPrice;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
        TotalPrice = Quantity * UnitPrice;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    private void setTotalPrice(double totalPrice) {
        TotalPrice = totalPrice;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    public Order() {
        Scanner inputReader = new Scanner(System.in);
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("input order code: ");
        Code = inputReader.nextInt();
        inputReader.nextLine();
        System.out.print("input order date: ");
        OrderDate = LocalDate.parse(inputReader.nextLine(), datePattern);
        System.out.print("input product name: ");
        ProductName = inputReader.nextLine();
        System.out.print("input price per unit: ");
        UnitPrice = inputReader.nextDouble();
        System.out.print("input quantity: ");
        Quantity = inputReader.nextInt();
        inputReader.nextLine();
        System.out.print("input note: ");
        inputReader.nextLine();
        TotalPrice = UnitPrice * Quantity;
    }

    public Order(int code, String orderDate, String productName, double unitPrice, int quantity, String note) {
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Code = code;
        OrderDate = LocalDate.parse(orderDate, datePattern);
        ProductName = productName;
        UnitPrice = unitPrice;
        Quantity = quantity;
        Note = note;
        TotalPrice = Quantity * UnitPrice;
    }

    public void PrintInfo() {
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.printf("\n========================\n" +
                        "Order with code %d on %s has a total price of $%.2f" +
                        "\n========================\n",
                Code, OrderDate.format(datePattern), TotalPrice);
    }
}
