package Files.OOP.bai6;

import java.util.Scanner;

public class Class {
    // Attributes
    public int Code;
    public String Name;
    public int StudentNumber;
    public String Address;
    public String Teacher;
    // Getters and Setters

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        StudentNumber = studentNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getTeacher() {
        return Teacher;
    }

    public void setTeacher(String teacher) {
        Teacher = teacher;
    }

    // Methods
    public Class(int code, String name, int studentNumber, String address, String teacher) {
        this.Code = code;
        this.Name = name;
        this.StudentNumber = studentNumber;
        this.Address = address;
        this.Teacher = teacher;
    }

    public Class() {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Input class code: ");
        this.Code = inputReader.nextInt();
        inputReader.nextLine();
        System.out.print("Input class name: ");
        this.Name = inputReader.nextLine();
        System.out.print("Input student number: ");
        this.StudentNumber = inputReader.nextInt();
        inputReader.nextLine();
        System.out.print("Input class address: ");
        this.Address = inputReader.nextLine();
        System.out.print("Input class's teacher: ");
        this.Teacher = inputReader.nextLine();
    }

    public void PrintInfo() {
        System.out.printf("Class %s with code %d at %s\nThis class has %d students and under teacher %s's supervision.\n",
                this.Name, this.Code, this.Address, this.StudentNumber, this.Teacher);
    }
}
