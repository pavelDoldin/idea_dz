package dz_1;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        /*
        Вычислить n! (произведение чисел от 1 до n)
         */
        System.out.println("Введите число факториала: ");
        Scanner scanner = new Scanner(System.in);
        Integer composition = scanner.nextInt();
        int [] arr = new int[composition];
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            res *= arr[i];
        }
        System.out.println(res);
    }
}
