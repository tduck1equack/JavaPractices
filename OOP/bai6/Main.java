package Files.OOP.bai6;

public class Main {
    public static void main(String[] args) {
        Class calculus = new Class(
                146756,
                "Calculus I",
                45,
                "D9 - 401",
                "Le Quoc Hoan"
        );
        Class japanese = new Class();
        calculus.PrintInfo();
        japanese.PrintInfo();
        calculus.setCode(147827);
        calculus.setName("Calculus III");
        calculus.setStudentNumber(124);
        calculus.setAddress("D9 - 501");
        calculus.setTeacher("Trinh Ngoc Hai");
        System.out.printf("%d\n%s\n%d\n%s\n%s", calculus.getCode(), calculus.getName(), calculus.getStudentNumber(),
                calculus.getAddress(), calculus.getTeacher());
    }
}
