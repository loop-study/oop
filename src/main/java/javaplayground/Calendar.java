package javaplayground;

import java.util.Scanner;

public class Calendar {

    public static void main(String[] args) {
//        System.out.println("두 수를 입력하세요. 스페이스로 띄우기 ex)7 10");
//        Scanner scanner = new Scanner(System.in);
//        String inputValue = scanner.nextLine();
//        String[] splitedValue = inputValue.split(" ");
//        int first = Integer.parseInt(splitedValue[0]);
//        int second = Integer.parseInt(splitedValue[1]);
//        System.out.println("두 수의 합은 " + (first + second) + "입니다");

//        System.out.println("일 월 화 수 목 금 토");
//        System.out.println("-------------------");
//        System.out.println("1  2  3  4  5  6  7");
//        System.out.println("8  9 10 11 12 13 14");
//        System.out.println("15 16 17 18 19 20 21");
//        System.out.println("22 23 24 25 26 27 28");

        // 숫자를 입력받아 해다하는 달의 최대 일수를 출력하는 프로그램
        System.out.println("달을 입력하세요");
        int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        System.out.printf("%d월은 %d일까지 있습니다.\n", month, maxDays[month - 1]);
        scanner.close();

    }
}
