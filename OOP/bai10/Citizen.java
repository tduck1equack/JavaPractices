package Files.OOP.bai10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Citizen {
    public int ID;
    public String FullName;
    public LocalDate Birthday;
    public String FamilyName;
    public String MiddleName;
    public String Name;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
        extractName(FullName);
    }

    public LocalDate getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Birthday = LocalDate.parse(birthday, dateFormatter);
    }

    public String getFamilyName() {
        return FamilyName;
    }

    private void setFamilyName(String familyName) {
        FamilyName = familyName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    private void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getName() {
        return Name;
    }

    private void setName(String name) {
        Name = name;
    }

    private void extractName(String fullName) {
        // clear middlename
        MiddleName = null;
        String[] nameArray = fullName.split("\\s+");
        for (int i = 0; i < nameArray.length; i++) {
            if (i == 0) FamilyName = nameArray[i];
            else if (i == nameArray.length - 1) Name = nameArray[i];
            else if (MiddleName == null) MiddleName = nameArray[i];
            else MiddleName = String.join(" ", MiddleName, nameArray[i]);
        }
    }

    public Citizen(int id, String fullName, String birthday) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ID = id;
        FullName = fullName.trim();
        Birthday = LocalDate.parse(birthday, dateFormatter);
        extractName(FullName);
    }

    public Citizen() {
        Scanner inputReader = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("input citizen id: ");
        ID = inputReader.nextInt();
        inputReader.nextLine();
        System.out.print("input citizen full name: ");
        FullName = inputReader.nextLine();
        System.out.print("input citizen birthday (dd/mm/yyyy): ");
        Birthday = LocalDate.parse(inputReader.nextLine(), dateFormatter);
        extractName(FullName);
    }

    public void PrintInfo() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.printf("\n========================\n" +
                        "Citizen ID %d goes by name %s, born on %s" +
                        "\n========================\n",
                ID, FullName, Birthday.format(dateFormatter));
    }

    private void createFullName() {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("input new full name: ");
        FullName = inputReader.nextLine();
        extractName(FullName);
    }
}
