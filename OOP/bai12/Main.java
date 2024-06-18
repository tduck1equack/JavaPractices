package Files.OOP.bai12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("initiating list of students...");
        System.out.print("initiating number of students: ");
        int size = inputReader.nextInt();
        ArrayList<Student> studentList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            Student newStudent = new Student();
            studentList.add(newStudent);
        }
        for (Student element : studentList) {
            element.PrintInfo();
        }
        System.out.println("finding a student by name: ");
        inputReader.nextLine();
        String target = inputReader.nextLine();
        ArrayList<Student> result = Student.StudentFinder(studentList, target);
        if (result.isEmpty()) System.out.println("student not found!");
        else {
            System.out.println("result: ");
            for (Student item : result) {
                item.PrintInfo();
            }
        }
    }
}
