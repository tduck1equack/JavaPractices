package Files.OOP.bai5;

public class Main {
    public static void main(String[] args) {
        Employee me = new Employee(
                20210210,
                "Tran Trung Duc",
                "Technical and Maintenance",
                "15, Thanh Xuan",
                "0924011033"
        );
        me.PrintInfo();
        me.setEmployeeCode(20210000);
        me.setFullName("Placebo");
        me.setAddress("Lorem ipsum");
        me.setDepartment("itsi domet");
        me.setPhoneNumber("0123456789");
        me.PrintInfo();
        System.out.println(me.getAddress());
        System.out.println(me.getEmployeeCode());
    }
}
