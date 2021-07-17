package javaplayground;

import java.util.Scanner;

public class GugudanMain {
    public static void main(String[] args) {
        // 최종 요구사항 1. 입력된 값으로 반복문 진행
//        System.out.println("입력된 숫자로 구구단 진행 : ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        for (int i = 2; i < number + 1; i++) {
//            LastGugudan.print(LastGugudan.calculate(i, number));
//        }

        System.out.println("입력된 문자(ex: 7,8)로 구구단 진행 : ");
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        String[] splitedValue = inputValue.split(",");
        int first = Integer.parseInt(splitedValue[0]);
        int second = Integer.parseInt(splitedValue[1]);

        for (int i = 2; i < first + 1; i++) {
            LastGugudan.print(LastGugudan.calculate(i, second));
        }

//        for (int i = 2; i < 10; i++) {
//            Gugudan.print(Gugudan.calculate(i));
//        }
    }
}
