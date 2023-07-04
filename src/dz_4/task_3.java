package dz_4;

import java.util.LinkedList;
import java.util.Random;

public class task_3 {
    public static void main(String[] args) {
        /*
        Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
         */
        int sum = 0;
        LinkedList<Integer> list = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < 3; i++) {
            list.add(rnd.nextInt(0,5));
            sum += list.get(i);
        }
        System.out.println(list);
        System.out.println(sum);


    }
}
