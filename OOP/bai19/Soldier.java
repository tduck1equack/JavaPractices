package Files.OOP.bai19;

public class Soldier {
    public String name;
    public double strength;
    public boolean equipped;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        calculateStrength(name);
    }

    public double getStrength() {
        return strength;
    }

    private void setStrength(double strength) {
        this.strength = strength;
    }

    public boolean isEquipped() {
        return equipped;
    }

    public void setEquipped(boolean equipped) {
        this.equipped = equipped;
        calculateStrength(this.name);
    }

    private void calculateStrength(String name) {
        switch (this.name) {
            case "infantry":
                if (isEquipped()) {
                    setStrength(50 + 50 * 1.1);
                } else {
                    setStrength(50);
                }
                break;
            case "archer":
                if (isEquipped()) {
                    setStrength(50 + 50 * 1.3);
                } else {
                    setStrength(50);
                }
                break;
            case "swordsman":
                if (isEquipped()) {
                    setStrength(50 + 50 * 1.5);
                } else {
                    setStrength(50);
                }
                break;
            case "gladiator":
                if (isEquipped()) {
                    setStrength(50 + 50 * 1.7);
                } else {
                    setStrength(50);
                }
                break;
        }
    }

    public void printInfo() {
        System.out.printf("Soldier <%s> has a strength index of %.2f\n", this.name, this.strength);
    }

    public static void fight(Soldier s1, Soldier s2) {
        System.out.printf("Soldier 1 <%s> - %.2f strength points.\nSoldier 2 <%s> - %.2f strength points.\n\n" +
                        "%s", s1.name, s1.strength, s2.name, s2.strength,
                s1.strength > s2.strength ? "Soldier 1 wins!\n" : s1.strength < s2.strength ? "Soldier 1 is defeated!\n" : "The fight is a draw!\n");
    }


}
