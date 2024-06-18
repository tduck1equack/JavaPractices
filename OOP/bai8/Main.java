package Files.OOP.bai8;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        Student student1 = new Student();
        Student student2 = new Student("Tran Van Duy",
                "VN03",
                "16/06/2003",
                9.3,
                9.6,
                8.5);
        student1.PrintInfo();
        student2.PrintInfo();
        student1.setFullName("Tran Hayao");
        student1.setClassName("Expelled");
        student1.setLiteratureResult(7.4);
        student1.RecalculateAvgScore();
        student1.PrintInfo();
    }
}
