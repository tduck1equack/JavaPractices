package Files.OOP.bai16;

import java.util.Scanner;

public class Time {
    public int Day;
    public int Month;
    public int Year;
    public boolean IsLeapYear;
    public int WeekDay;

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public boolean isLeapYear() {
        return IsLeapYear;
    }

    private void setLeapYear(boolean leapYear) {
        IsLeapYear = leapYear;
    }

    public String getWeekDay() {
        switch (WeekDay) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "Error";
        }
    }

    private void setWeekDay(int weekDay) {
        WeekDay = weekDay;
    }

    public void PrintInfo() {
        System.out.printf("Current time: %s, %02d/%02d/%d\nThis is %s a leap year.\n",
                getWeekDay(), getDay(), getMonth(), getYear(), isLeapYear() ? "" : "not");
    }

    public static void TimeBetween(Time t1, Time t2) {
        System.out.printf("time between %02d/%02d/%d and %02d/%02d/%d is: %02d days, %02d months and %d years\n",
                t1.getDay(), t1.getMonth(), t1.getYear(), t2.getDay(), t2.getMonth(), t2.getYear(),
                Math.abs(t1.getDay() - t2.getDay()), Math.abs(t1.getMonth() - t2.getMonth()), Math.abs(t1.getYear() - t2.getYear()));
    }

    // Tomohiko Sakamoto's algorithm to find day of the week in form of integer
    // getWeekDay() will convert the week day integers
    private int dayOfWeek(int d, int m, int y) {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (m < 3) y -= 1;
        return (y + y / 4 - y / 100 + y / 400 + t[m - 1] + d) % 7;
        // Starting from 0 - Sunday
    }

    public Time(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
        setWeekDay(dayOfWeek(day, month, year));
        setLeapYear(year % 4 == 0);
    }

    public Time() {
        System.out.println("================creating time point================");
        setDay(InputRangeCheck(1, 31, "day"));
        setMonth(InputRangeCheck(1, 12, "month"));
        setYear(InputRangeCheck(1000, 2024, "year"));
        setWeekDay(dayOfWeek(Day, Month, Year));
        setLeapYear(getYear() % 400 == 0);
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

    private void InputDay() {
        Day = InputRangeCheck(1, 31, "day");
    }

    private void InputMonth() {
        Month = InputRangeCheck(1, 12, "month");
    }

    private void InputYear() {
        Year = InputRangeCheck(1000, 2024, "year");
    }


}

