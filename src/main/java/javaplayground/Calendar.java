package javaplayground;

import java.util.Scanner;

public class Calendar {
    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        if (year % 4 == 0
                && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public int getMaxDaysOfMonth(int year, int month) {
        if (isLeapYear(year)) {
            return LEAP_MAX_DAYS[month - 1];
        }
        return MAX_DAYS[month - 1];
    }

    public void printSampleCalendar(int year, int month) {
        System.out.printf("   <<%4d년 %3d월>>\n",  year, month);
        System.out.println(" SU MO TU WE TH FR SA");
        System.out.println("--------------------");

        int maxDay = getMaxDaysOfMonth(year, month);

        for (int i = 1; i <= maxDay; i++) {
            System.out.printf("%3d", i);
            if (i % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
//        System.out.println("두 수를 입력하세요. 스페이스로 띄우기 ex)7 10");
//        Scanner scanner = new Scanner(System.in);
//        String inputValue = scanner.nextLine();
//        String[] splitedValue = inputValue.split(" ");
//        int first = Integer.parseInt(splitedValue[0]);
//        int second = Integer.parseInt(splitedValue[1]);
//        System.out.println("두 수의 합은 " + (first + second) + "입니다");


        // 숫자를 입력받아 해다하는 달의 최대 일수를 출력하는 프로그램
        String PROMPT = "cal> ";


    }
}
