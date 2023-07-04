package dz_1;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
    /*
     * Реализовать простой калькулятор (введите первое число, введите второе число,
     * введите требуемую операцию, ответ)
     */
        double nam_1;
        double nam_2;
        double res;
        char symbol;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        nam_1 = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        nam_2 = scanner.nextDouble();
        System.out.println("Введите операцию ( +, -, *, /): ");
        symbol = scanner.next().charAt(0);
            switch (symbol) {
                case '+': res = nam_1 + nam_2;
                    break;
                case '-': res = nam_1 - nam_2;
                    break;
                case '*': res = nam_1 * nam_2;
                    break;
                case '/': res = nam_1 / nam_2;
                    break;
                default:
                    System.out.println("Ошибка ввода ! ");
                    return;
            }
        System.out.println(res);

    }
}















