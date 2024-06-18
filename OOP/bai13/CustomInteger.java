package Files.OOP.bai13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomInteger {
    public int Value;
    public boolean IsEven;
    public boolean IsPrime;
    public boolean IsSymmetrical;

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public boolean isEven() {
        return IsEven;
    }

    private void setEven(boolean even) {
        IsEven = even;
    }

    public boolean isPrime() {
        return IsPrime;
    }

    private void setPrime(boolean prime) {
        IsPrime = prime;
    }

    public boolean isSymmetrical() {
        return IsSymmetrical;
    }

    private void setSymmetrical(boolean symmetrical) {
        IsSymmetrical = symmetrical;
    }

    public CustomInteger() {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("input an integer value: ");
        Value = inputReader.nextInt();
        IsEven = CheckEven(Value);
        IsPrime = CheckPrime(Value);
        IsSymmetrical = CheckSymmetrical(Value);
    }

    public CustomInteger(int value) {
        Value = value;
        IsEven = CheckEven(Value);
        IsPrime = CheckPrime(Value);
        IsSymmetrical = CheckSymmetrical(Value);
    }

    public void PrintInfo() {
        System.out.printf("integer %d is%san odd number and is%sa prime number\n",
                Value,
                IsEven ? " " : " not ",
                IsPrime ? " " : " not ");
    }

    public static int Sum(CustomInteger x, CustomInteger y) {
        return x.Value + y.Value;
    }

    private void InputValue() {
        Scanner inputReader = new Scanner(System.in);
        int newValue = 0;
        boolean repeat = true;
        while (repeat) {
            try {
                System.out.println("input a valid integer: ");
                newValue = inputReader.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("you have inputted an invalid integer.");
                System.out.println("the inputted value might have been a floating point number or a character or a string...");
                System.out.println("please try again.");
                inputReader.nextLine();
            }
        }
        Value = newValue;
        IsEven = CheckEven(Value);
        IsPrime = CheckPrime(Value);
        IsSymmetrical = CheckSymmetrical(Value);
    }

    private boolean CheckEven(int value) {
        return value % 2 == 0;
    }

    private boolean CheckPrime(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    private boolean CheckSymmetrical(int value) {
        StringBuilder valueStr = new StringBuilder(Integer.toString(value));
        StringBuilder reverseValueStr = new StringBuilder(Integer.toString(value));
        reverseValueStr.reverse();
        return valueStr.compareTo(reverseValueStr) == 0;
    }


}
