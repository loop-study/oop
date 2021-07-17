package javaplayground;

public class Gugudan {
    public static int[] calculate(int times) {
        int[] result = new int[9];
        for (int i = 1; i < result.length; i++) {
            result[i] = times * i;
        }
        return result;
    }

    public static void print(int[] result) {
        for (int i = 1; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {
//        print(calculate(2));
//        print(calculate(3));
//        print(calculate(4));

        for (int i = 2; i < 10; i++) {
            print(calculate(i));
        }

//        int[] result = new int[9];
//        for (int i = 1; i < result.length; i++) {
//            result[i] = 2 * i;
//        }
//
//        for (int i = 1; i < result.length; i++) {
//            System.out.println(result[i]);
//        }
//
//        int[] times3 = new int[9];
//        for (int i = 1; i < times3.length; i++) {
//            times3[i] = 3 * i;
//        }
//
//        for (int i = 1; i < times3.length; i++) {
//            System.out.println(times3[i]);
//        }

//        // 2중 포문
//        for (int i = 2; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i * j);
//            }
//        }
    }
}
