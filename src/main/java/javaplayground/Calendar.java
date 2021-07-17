package javaplayground;

import java.util.Scanner;

public class Calendar {
    private static final int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int getMaxDaysOfMonth(int month) {
        return maxDays[month - 1];
    }

    public void printSampleCalendar(int year, int month) {
        System.out.printf("   <<%4d년 %3d월>>\n",  year, month);
        System.out.println(" SU MO TU WE TH FR SA");
        System.out.println("--------------------");

        int maxDay = getMaxDaysOfMonth(month);

        for (int i = 1; i <= maxDay; i++) {
            System.out.printf("%3d", i);
            if (i % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
//        System.out.println("1  2  3  4  5  6  7");
//        System.out.println("8  9 10 11 12 13 14");
//        System.out.println("15 16 17 18 19 20 21");
//        System.out.println("22 23 24 25 26 27 28");
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
