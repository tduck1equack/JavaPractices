package Files.OOP.bai15;

import java.util.Scanner;

public class Clock {
    public int Hour;
    public int Minute;
    public int Second;
    public boolean IsMorning;

    public int getHour() {
        return Hour;
    }

    public void setHour(int hour) {
        Hour = hour;
    }

    public int getMinute() {
        return Minute;
    }

    public void setMinute(int minute) {
        Minute = minute;
    }

    public int getSecond() {
        return Second;
    }

    public void setSecond(int second) {
        Second = second;
    }

    public boolean isMorning() {
        return IsMorning;
    }

    private void setMorning(boolean morning) {
        IsMorning = morning;
    }

    public void PrintInfo() {
        System.out.printf("Clock: [ %d : %d : %d ]\nIt is %s now.\n", Hour, Minute, Second,
                IsMorning ? "morning" : "afternoon");
    }

    public static Clock CalculateTime(Clock a, Clock b) {
        Clock result = new Clock(1, 1, 1);
        result.setHour(Math.abs(a.Hour - b.Hour));
        result.setMinute(Math.abs(a.Minute - b.Minute));
        result.setSecond(Math.abs(a.Second - b.Second));
        return result;
    }

    public Clock() {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("winding clock...");
        do {
            System.out.print("input hour: ");
            Hour = inputReader.nextInt();
            if (Hour < 0 || Hour > 24) System.out.println("invalid! input something in the range 0 - 24");
        } while (Hour < 0 || Hour > 24);
        do {
            System.out.print("input minute: ");
            Minute = inputReader.nextInt();
            if (Minute < 0 || Minute > 60) System.out.println("invalid! input something in the range 0 - 60");
        } while (Minute < 0 || Minute > 60);
        do {
            System.out.print("input second: ");
            Second = inputReader.nextInt();
            if (Second < 0 || Second > 60) System.out.println("invalid! input something in the range 0 - 60");
        } while (Second < 0 || Second > 60);
        IsMorning = Hour < 12;
    }

    public Clock(int hour, int minute, int second) {
        if (hour < 0 || hour > 24 || minute < 0 || minute > 60 || second < 0 || second > 60)
            System.out.println("failed to wind clock! invalid hour or minute or second");
        else {
            Hour = hour;
            Minute = minute;
            Second = second;
            IsMorning = Hour < 12;
        }
    }

    private int InputRangeCheck(int min, int max, String valueName) {
        Scanner inputReader = new Scanner(System.in);
        int result = 0;
        do {
            System.out.printf("input %s: ", valueName);
            result = inputReader.nextInt();
            if (result < min || result > max) System.out.printf("invalid input - must be in range %d - %d\n", min, max);
        } while (result < min || result > max);
        return result;
    }

    private void InputHour() {
        Hour = InputRangeCheck(0, 24, "hour");
    }

    private void InputMinute() {
        Minute = InputRangeCheck(0, 60, "minute");
    }

    private void InputSecond() {
        Second = InputRangeCheck(0, 60, "second");
    }


}
