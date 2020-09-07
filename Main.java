package classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите число , факториал которого необходимого вычислить:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.print("!" + num + "=" + factorial(num));
    }
    public static int factorial(int num) {
        if (num == 0) {

            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
