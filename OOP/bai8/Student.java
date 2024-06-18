package Files.OOP.bai8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    public String FullName;
    public String ClassName;
    public Date Birthday;
    public double MathResult;
    public double LiteratureResult;
    public double EnglishResult;
    public double AverageScore;

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }

    public double getMathResult() {
        return MathResult;
    }

    public void setMathResult(double mathResult) {
        MathResult = mathResult;
    }

    public double getLiteratureResult() {
        return LiteratureResult;
    }

    public void setLiteratureResult(double literatureResult) {
        LiteratureResult = literatureResult;
    }

    public double getEnglishResult() {
        return EnglishResult;
    }

    public void setEnglishResult(double englishResult) {
        EnglishResult = englishResult;
    }

    public double getAverageScore() {
        return AverageScore;
    }

    private void setAverageScore(double averageScore) {
        AverageScore = averageScore;
    }

    public Student(String fullName, String className, String birthday,
                   double mathResult, double literatureResult, double englishResult)
            throws ParseException {
        SimpleDateFormat datePattern = new SimpleDateFormat("dd/MM/yyyy");
        FullName = fullName;
        ClassName = className;
        Birthday = datePattern.parse(birthday);
        MathResult = mathResult;
        LiteratureResult = literatureResult;
        EnglishResult = englishResult;
        AverageScore = (MathResult + LiteratureResult + EnglishResult) / 3;
    }

    public Student() throws ParseException {
        SimpleDateFormat datePattern = new SimpleDateFormat("dd/MM/yyyy");
        Scanner inputReader = new Scanner(System.in);
        System.out.print("input student name: ");
        FullName = inputReader.nextLine();
        System.out.print("input student class: ");
        ClassName = inputReader.nextLine();
        System.out.print("input student birthday: ");
        Birthday = datePattern.parse(inputReader.nextLine());
        System.out.print("input student's math score: ");
        MathResult = inputReader.nextDouble();
        System.out.print("input student's literature score: ");
        LiteratureResult = inputReader.nextDouble();
        System.out.print("input student's English score: ");
        EnglishResult = inputReader.nextDouble();
        AverageScore = (MathResult + LiteratureResult + EnglishResult) / 3;
    }

    public void PrintInfo() {
        System.out.printf("\n========================\n" +
                        "%s of class %s has an average score of %.2f" +
                        "\n========================\n",
                FullName, ClassName, AverageScore);
    }

    public void RecalculateAvgScore() {
        AverageScore = (MathResult + LiteratureResult + EnglishResult) / 3;
    }
}
