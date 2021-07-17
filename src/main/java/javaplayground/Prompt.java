package javaplayground;

import java.util.Scanner;

public class Prompt {

    private static final String PROMPT = "cal>";

    public void runPrompt() {
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        int month = 1;
        int year = 2017;
        while (true) {
            System.out.println("연도를 입력하세요");
            System.out.println("YEAR> ");
            year = scanner.nextInt();

            System.out.println("달을 입력하세요");
            System.out.println("MONTH> ");
            month = scanner.nextInt();
            if (month < 0) {
                break;
            }
            if (month > 12) {
                continue;
            }
            cal.printSampleCalendar(year, month);
        }

        System.out.println("Bye~.");

        scanner.close();
    }

    public static void main(String[] args) {
        // 셀 실행
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
