package Files.OOP.bai18;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public int Value1;
    public int Value2;
    public boolean Win;
    public boolean Lose;
    public boolean Draw;

    public int getValue1() {
        return Value1;
    }

    public void setValue1(int value1) {
        Value1 = value1;
    }

    public int getValue2() {
        return Value2;
    }

    public void setValue2(int value2) {
        Value2 = value2;
    }

    public boolean isWin() {
        return Win;
    }

    private void setWin(boolean win) {
        Win = win;
    }

    public boolean isLose() {
        return Lose;
    }

    private void setLose(boolean lose) {
        Lose = lose;
    }

    public boolean isDraw() {
        return Draw;
    }

    private void setDraw(boolean draw) {
        Draw = draw;
    }

    private void PrintSession() {
        System.out.printf("You are the %s!\n", isWin() ? "Winner" : isLose() ? "Loser" : "... Oh, this game is a draw");
    }

    private int InputPlayerValue() {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("input your value: ");
        return inputReader.nextInt();
    }

    public void Start() {
        Random randomizer = new Random();
        do {
            Value1 = InputPlayerValue();
            Value2 = randomizer.nextInt(16) + 3;
            setWin(Value1 > Value2);
            setLose(Value1 < Value2);
            setDraw(Value1 == Value2);
            PrintSession();
            if (Value1 < 3 || Value1 > 18) System.out.println("you're trying to crash this game? no can't do!");
        } while (Value1 > 3 && Value1 < 18);
    }


}
