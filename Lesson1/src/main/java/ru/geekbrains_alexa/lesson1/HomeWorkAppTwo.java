package ru.geekbrains_alexa.lesson1;

public class HomeWorkAppTwo {
    public static void main(String[] args) {
        within10and20(5, 10);
        isPositiveOrNegative(-9);
        isNegative(0);
        printWordNTimes("MIU", 9);
        isLeapYear(1998);
    }

    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;

        if (10 >= sum && sum <= 20) {
            return true;
        }

        return false;
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean isNegative(int x) {
        if (x >= 0) {
            return true;
        }
        return false;
    }

    public static void printWordNTimes(String word, int times) {
        for (int x = 0; x < times; x++) {
            System.out.println(word);
        }
    }


    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}