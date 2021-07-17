package javaplayground;

public class LastGugudan {
    public static int[] calculate(int times, int length) {
        int[] result = new int[length + 1];
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
}
