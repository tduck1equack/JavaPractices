package Files.OOP.bai10;

public class Main {
    public static void main(String[] args) {
        Citizen person1 = new Citizen();
        Citizen person2 = new Citizen(15, "Tran Thuyet Son", "23/10/1993");
        person1.PrintInfo();
        System.out.println(person1.getFamilyName());
        System.out.println(person1.getMiddleName());
        System.out.println(person1.getName());
        person1.setFullName("Nguyen Tran Van Duc");
        person1.setID(23);
        person1.setBirthday("22/12/1999");
        System.out.println(person1.getFamilyName());
        System.out.println(person1.getMiddleName());
        System.out.println(person1.getName());
        person1.PrintInfo();
        person2.PrintInfo();
    }
}
