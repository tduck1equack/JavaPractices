package Files.OOP.bai12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public int Code;
    public String FullName;
    public LocalDate Birthday;
    public String FamilyName;
    public double TuitionFee;
    public String Email;

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getBirthday() {
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return Birthday.format(datePattern);
    }

    public void setBirthday(String birthday) {
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Birthday = LocalDate.parse(birthday, datePattern);
    }

    public String getFamilyName() {
        return FamilyName;
    }

    private void setFamilyName(String familyName) {
        FamilyName = familyName;
    }

    public double getTuitionFee() {
        return TuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        TuitionFee = tuitionFee;
    }

    public String getEmail() {
        return Email;
    }

    private void setEmail(String email) {
        Email = email;
    }

    public Student() {
        Scanner inputReader = new Scanner(System.in);
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("input student code: ");
        Code = inputReader.nextInt();
        inputReader.nextLine();
        System.out.print("input student name: ");
        FullName = inputReader.nextLine();
        System.out.print("input student birthday: ");
        Birthday = LocalDate.parse(inputReader.nextLine(), datePattern);
        System.out.print("input student tuition fee: ");
        TuitionFee = inputReader.nextDouble();
        if (TuitionFee > 3000000) TuitionFee -= (TuitionFee * 5 / 100);
        ExtractFamilyName(FullName);
        Email = CreateEmail(FullName);
    }

    public Student(int code, String fullName, String birthday, double tuitionFee) {
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Code = code;
        FullName = fullName;
        Birthday = LocalDate.parse(birthday, datePattern);
        if (tuitionFee > 3000000) TuitionFee = tuitionFee - (tuitionFee * 5 / 100);
    }

    private void ExtractFamilyName(String fullName) {
        fullName = fullName.trim();
        FamilyName = null;
        String[] nameArray = fullName.split("\\s+");
        for (int i = 0; i < nameArray.length - 2; i++) {
            FamilyName = String.join(" ", nameArray[i]);
        }
    }

    private String ExtractName(String fullName) {
        fullName = fullName.trim();
        String[] nameArray = fullName.split("\\s+");
        return nameArray[nameArray.length - 1];
    }

    private String CreateEmail(String fullName) {
        return String.format("%s@edusolution.com", ExtractName(FullName));
    }

    public void PrintInfo() {
        System.out.printf("student code %d, name %s, email %s\n", Code, FullName, Email);
    }

    public static ArrayList<Student> StudentFinder(ArrayList<Student> studentList, String target) {
        ArrayList<Student> resultList = new ArrayList<>();
        for (Student element : studentList) {
            if (target.equals(element.ExtractName(element.FullName))) resultList.add(element);
        }
        return resultList;
    }
}
