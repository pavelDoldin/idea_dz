package dz_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        /*
        Пусть дан произвольный список целых чисел, удалить из него четные числа
         */
        List<Integer> arr = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            arr.add(rnd.nextInt(0,101));
            if (arr.get(i) % 2 == 0){
                arr.remove(i);
                i--;
            }
        }
        System.out.println(arr);
    }
}
