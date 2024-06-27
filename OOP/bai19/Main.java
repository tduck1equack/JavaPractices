package Files.OOP.bai19;

public class Main {
    public static void main(String[] args) {
        Soldier s1 = new Soldier();
        Soldier s2 = new Soldier();
        s1.setName("infantry");
        s1.setEquipped(true);
        s2.setName("archer");
        s1.printInfo();
        s2.printInfo();
        Soldier.fight(s1, s2);
    }
}
