package dz_1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        /*
        Вычислить n-ое треугольного число (сумма чисел от 1 до n)
         */
        System.out.println("Введите n число треугольника: ");
        Scanner scanner = new Scanner(System.in);
        Integer triangle = scanner.nextInt();
        int [] arr = new int[triangle];
        int sum  = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
